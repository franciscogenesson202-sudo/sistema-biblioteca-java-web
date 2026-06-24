create table alunos(
                       id bigint unsigned auto_increment primary key,
                       user_id bigint unsigned,
                       foreign key (user_id) references usuarios (id)
);
