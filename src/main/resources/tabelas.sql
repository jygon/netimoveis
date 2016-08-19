create table Estados (id smallserial primary key, abreviatura char(2), nome varchar(300));
create table Cidades (id bigserial primary key, nome varchar(300), estado_Id smallserial references estados(id));
create table Pessoas (id bigserial primary key, nome varchar(300), cpf bigint, idade int, emprego varchar(300));
create table Enderecos (id bigserial primary key, logradouro varchar(300), cep varchar(15), numero integer, cidade_Id bigserial references cidades(id),
    complemento varchar(300), longitude double precision, latitude double precision, pessoa_Id bigint references Pessoas(id));
create table Telefones (id bigserial primary key, ddd int, numero integer, tipo varchar(20), pessoa_Id bigint references pessoas(id));
create table Emails (id bigserial primary key, email varchar(100), tipo varchar(20), pessoa_Id bigint references pessoas(id));
create table Vagas (id bigserial, endereco_Id bigserial references Enderecos(id), coberta boolean, metros_Quadrados int, disponivel boolean,
    periodos varchar(30), dias_Disponiveis varchar(100), horarios varchar(100),
    logradouro varchar(300), numero integer, longitude double precision, latitude double precision,
    primary key (numero, endereco_Id));
