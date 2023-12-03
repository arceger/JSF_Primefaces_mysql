CREATE DATABASE ordersrv;
use ordersrv;

CREATE TABLE services(
    OrderID int NOT NULL AUTO_INCREMENT,
    empresa varchar(100) NOT NULL,
    endereco varchar(200)NOT NULL,
    telefone varchar(50) NOT NULL,
    zipcode varchar(50) NOT NULL,
    representante varchar(100),
    equipamento varchar(200)NOT NULL,
    defeito varchar(500)NOT NULL,
    PRIMARY KEY (OrderID)

);