
FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=seuPass

EXPOSE 3306


COPY ./script.sql /docker-entrypoint-initdb.d/
