-- Generated by the database client.
CREATE TABLE usuarios(
    id SERIAL NOT NULL,
    usuario varchar(50) NOT NULL,
    senha varchar(50) NOT NULL,
    PRIMARY KEY(id)
);