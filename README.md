# Azure functions playground app

This playground app deploys a quarkus function to azure using terraform to configure the environment.
I was more or less following this tutorial, but added an additional database:

https://antoniogoncalves.org/2021/07/12/how-to-manually-deploy-a-quarkus-application-to-azure-with-terraform-thanks-to-nubesgen/

## Quarkus commands

```shell script
./mvnw compile quarkus:dev
```

```shell script
./mvnw package
```

```shell script
./mvnw package -Dnative
```

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

## Terraform commands

```shell script
terraform init
```

```shell script
terraform plan
```

```shell script
terraform apply
```

```shell script
terraform destroy
```

## Azure Plugin commands

```shell script
./mvnw com.microsoft.azure:azure-webapp-maven-plugin:2.12.0:config
```

```shell script
./mvnw azure-webapp:deploy
```
