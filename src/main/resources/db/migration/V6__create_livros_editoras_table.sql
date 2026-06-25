create table livros_editoras(
                                id bigint unsigned auto_increment primary key,
                                id_editora bigint unsigned not null,
                                id_livros bigint unsigned not null,

                                foreign key (id_editora) references editoras (editora_id),
                                foreign key (id_livros) references livros (id)
);