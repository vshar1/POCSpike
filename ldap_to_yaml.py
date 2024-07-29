import yaml

def parse_ldap_output(file_path):
    with open(file_path, 'r') as file:
        lines = file.readlines()

    groups = {}
    current_group = None

    for line in lines:
        line = line.strip()
        if line.startswith('dn:'):
            current_group = line.split(' ')[1]
            groups[current_group] = []
        elif line.startswith('member:'):
            member = line.split(' ')[1]
            groups[current_group].append(member)

    return groups

def convert_to_yaml(data, output_file):
    with open(output_file, 'w') as file:
        yaml.dump(data, file, default_flow_style=False)

if __name__ == "__main__":
    ldap_file = 'ldap_output.txt'
    yaml_file = 'ldap_output.yaml'

    ldap_data = parse_ldap_output(ldap_file)
    convert_to_yaml(ldap_data, yaml_file)

    print(f"YAML output saved to {yaml_file}")
