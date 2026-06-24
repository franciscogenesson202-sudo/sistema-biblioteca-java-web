create table administradores(
                                id bigint unsigned auto_increment primary key,
                                user_id bigint unsigned not null,
                                foreign key (user_id) references usuarios (id)
);
