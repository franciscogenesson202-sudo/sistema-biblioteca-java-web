create table livros (
                        id bigint unsigned auto_increment primary key,
                        autor varchar(255) not null,
                        titulo varchar(255) not null,
                        resumo text not null,
                        quantidade int unsigned not null,
                        data_lancamento date not null
);