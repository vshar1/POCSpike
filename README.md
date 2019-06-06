# terraform-hello-world
Simple tf files to create EC2 instance

In provider_orig.tf file <br>
change accesskey and secretkey to your AWS credentials

In hello-world-terraform.tf file <br>
change AMI for ami id some linux instance
change key for a the key name of the Key Pair to use for the instance

## To create a instance

terraform init
terrafrom plan
terraform apply

## To Destroy a instance

terraform destroy
