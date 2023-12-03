## uma pequena revisao em jsf e primefaces usando mysql com docker

## o tomcat usado foi a versao 9 e o banco versao 8.0

## segue abaixo os comando pra criacao do docker

## eu prefiro o podman

# podman build -t mysql .
# podman run -p 3306:3306 --name mysql --rm mysql



# podman exec -it mysql /bin/bash

