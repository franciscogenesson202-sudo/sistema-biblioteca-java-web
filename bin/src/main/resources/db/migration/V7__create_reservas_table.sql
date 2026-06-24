create table reservas(
                         id bigint unsigned auto_increment primary key,
                         user_id bigint unsigned not null,
                         id_livro bigint unsigned not null,
                         data date not null,

                         foreign key (user_id) references alunos(id),
                         foreign key (id_livro) references livros(id)
);

