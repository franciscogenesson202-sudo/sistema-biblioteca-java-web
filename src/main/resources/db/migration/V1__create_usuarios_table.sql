create table usuarios(
                         id bigint unsigned auto_increment primary key,
                         nome varchar(255) not null,
                         email varchar(255),
                         senha varchar(255) not null,
                         tipo_usuario varchar(255) not null
);
