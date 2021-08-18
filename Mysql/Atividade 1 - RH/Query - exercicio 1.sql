create database db_rh;

use db_rh;

create table funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
funcao varchar(50),
departamento varchar(50),
salario decimal(8,2),

primary key (id)
);

insert into funcionarios(nome,funcao,departamento,salario) values ("Felipe Fernandes","Desenvolvedor Junior","T.I",1500.00);
insert into funcionarios(nome,funcao,departamento,salario) values ("Pedro Silva","Desenvolvedor Pleno","T.I",2500.00);
insert into funcionarios(nome,funcao,departamento,salario) values ("Luana Silva","Desenvolvedor Senior","T.I",3000.00);
insert into funcionarios(nome,funcao,departamento,salario) values ("Tatiana Santos","Gerente Senior","T.I",4500.00);
insert into funcionarios(nome,funcao,departamento,salario) values ("Juan Alves","Desenvolvedor Pleno","T.I",2500.00);

select * from funcionarios where salario > 2000.00;
select * from funcionarios where salario < 2000.00;

update funcionarios set salario = 3000.00 where id = 5;