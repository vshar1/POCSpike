from ldap3 import Server, Connection, ALL
import yaml
import os

LDAP_SERVER = os.getenv('LDAP_SERVER', 'ldap://localhost')
LDAP_USER = 'cn=admin,dc=mydomain,dc=com'
LDAP_PASSWORD = 'adminpassword'
BASE_DN = 'ou=groups,dc=mydomain,dc=com'

def search_groups(server, user, password, base_dn):
    server = Server(server, get_info=ALL)
    conn = Connection(server, user, password, auto_bind=True)
    conn.search(base_dn, '(objectClass=groupOfNames)', attributes=['member'])

    groups = {}
    for entry in conn.entries:
        group_dn = entry.entry_dn
        members = entry.member.values if 'member' in entry else []
        groups[group_dn] = list(members)

    return groups

def save_to_yaml(data, output_file):
    with open(output_file, 'w') as file:
        yaml.dump(data, file, default_flow_style=False)

def print_first_20_lines(file_path):
    with open(file_path, 'r') as file:
        for _ in range(20):
            line = file.readline()
            if not line:
                break
            print(line.strip())

if __name__ == "__main__":
    groups = search_groups(LDAP_SERVER, LDAP_USER, LDAP_PASSWORD, BASE_DN)
    output_file = 'ldap_output.yaml'
    save_to_yaml(groups, output_file)
    print(f"YAML output saved to {output_file}")
    print("\nFirst 20 lines of the output file:\n")
    print_first_20_lines(output_file)
