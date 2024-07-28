# LDAP docker spike

## 1.  Bootup the local LDAP docker container
```
docker-compose up -d
```

Open in browser : https://localhost:6443

## 2. Test connection to LDAP via ldapsearch cli

### Pre-requisite 

Install the binary
```
sudo apt-get update
sudo apt-get install ldap-utils
ldapsearch -V
```

### 3. Log In to phpLDAPadmin

Use the following credentials to log in: https://localhost:6443

Login DN: cn=admin,dc=mydomain,dc=com
Password: adminpassword

```
ldapsearch -x -H ldap://localhost:389 -b dc=mydomain,dc=com -D "cn=admin,dc=mydomain,dc=com" -w adminpassword

```

### 4. Setup/Load users from external ldif file

I want to simulate having 3 ldap groups to be pre loaded

    teamlead - users amanda, Benny, Chloe,
    frontdevs - users danny, ellis, fin
    backenddevs - users george, harry, irina

You must create the organizational units (ou=users and ou=groups) before you can add entries within them. The create_ou.ldif file ensures that these necessary containers exist in your LDAP directory, providing the structure needed to add user and group entries. Without these organizational units, you cannot add entries beneath them, resulting in the "No such object" error.

```
ldapadd -x -D "cn=admin,dc=mydomain,dc=com" -w adminpassword -f test_preloaddata/create_ou.ldif 

ldapadd -x -D "cn=admin,dc=mydomain,dc=com" -w adminpassword -f test_preloaddata/dataset1/teamlead.ldif 

ldapadd -x -D "cn=admin,dc=mydomain,dc=com" -w adminpassword -f test_preloaddata/dataset2/frontdevs.ldif

ldapadd -x -D "cn=admin,dc=mydomain,dc=com" -w adminpassword -f test_preloaddata/dataset3/backenddevs.ldif 
```

## 5. Read all Test setup users via cli
```
ldapsearch -x -D "cn=admin,dc=mydomain,dc=com" -w adminpassword -b "ou=groups,dc=mydomain,dc=com" -s sub "(objectClass=groupOfNames)" member
```

## 6. Now read all Test setup users via python 
Here the blocker will be to get all the pip libraries installed on the host machine
In order to avoid local dependency & CI friendly using the custom container with all dependency for python code to be present

#### 6.1 Build custom build docker image

```
docker build -t ldap_search -f LocalEnvDockerfile .
```

Run the Docker Container with Environment Variables of your LDAP_SERVER

```
LDAP_SERVER=$(ip addr show | grep "inet " | grep -v 127.0.0.1 | awk '{print $2}' | cut -d/ -f1 | grep '^192\.')

docker run --rm -it -v $(pwd):/app -e LDAP_SERVER=ldap://$LDAP_SERVER ldap_search
```

## Demo

Here is a demo of how it works:

<img src="images/Ldap_spike.gif" width="1200" style="max-width: 100%; height: auto;" alt="Demo GIF">

### 8. Shutdown and cleanup all data
```
# Remove the contents of the ldap_data and ldap_config directories
sudo rm -rf ./ldap_data/*
sudo rm -rf ./ldap_config/*
```

# Resources

https://www.openldap.org/software/download/