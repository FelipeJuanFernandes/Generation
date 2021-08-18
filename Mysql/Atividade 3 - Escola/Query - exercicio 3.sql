create database db_alunos;

use db_alunos;

create table Alunos(
id bigint auto_increment,
nome varchar(255) not null,
idade int,
ano int,
nota decimal(8,2),

primary key (id)
);

insert into Alunos(nome,idade,ano,nota) values ("Felipe",15,8,8.5);
insert into Alunos(nome,idade,ano,nota) values ("Joana",15,8,7.5);
insert into Alunos(nome,idade,ano,nota) values ("Pedro",15,8,7.0);
insert into Alunos(nome,idade,ano,nota) values ("Luis",15,8,6.0);
insert into Alunos(nome,idade,ano,nota) values ("Giovanna",15,8,5.0);
insert into Alunos(nome,idade,ano,nota) values ("João",15,8,8.5);
insert into Alunos(nome,idade,ano,nota) values ("Fernando",15,8,4.0);
insert into Alunos(nome,idade,ano,nota) values ("Jose",15,8,3.0);
insert into Alunos(nome,idade,ano,nota) values ("Rita",15,8,2.0);

select * from Alunos where nota > 7.0;
select * from Alunos where nota < 7.0;

update Alunos set nota = 8.0 where id = 9;

