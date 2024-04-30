drop schema if exists anotacao;

drop user if exists 'user'@'localhost';

create schema anotacao;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on anotacao.* to user@'localhost';

use anotacao;

create table alu_aluno (
    alu_id bigint primary key auto_increment,
    alu_nome_completo varchar(100) not null,
    alu_email_institucional varchar(100) not null,
    alu_data_matricula date not null,
    alu_indice float
);

insert into alu_aluno (alu_nome_completo, alu_email_institucional, alu_data_matricula, alu_indice)
values ('Charles Smith', 'csmith@email.com', curdate(), null),
       ('Ann Doe','adoe@email.com', '2024-02-15', 6.3);
