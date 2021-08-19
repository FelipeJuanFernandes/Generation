create database db_game_online;

use db_game_online;

-- Criando tabela para classes de personagens
	create table tb_classe(
		id bigint auto_increment,
	  tipo varchar(255) not null,
	  raca varchar(255) not null,
	  
   primary key(id)
);

-- Criando tabela de personagens
	create table tb_personagem(
		id bigint auto_increment,
	  nome varchar(255) not null,
	ataque int not null,
	defesa int not null,
     Nivel int not null,
 classe_id bigint,
   
   primary key(id),
   foreign key(classe_id) references tb_classe(id)
);

-- insert para classes
insert into tb_classe(tipo,raca)values("Arqueiro","Elfo");
insert into tb_classe(tipo,raca)values("Guerreiro","Humano");
insert into tb_classe(tipo,raca)values("Mago","Orc");
insert into tb_classe(tipo,raca)values("Caçador","Humano");
insert into tb_classe(tipo,raca)values("Necromancer","Elfo");



-- insert para personagem
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Hell",3000,3000,55,1);
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Mordor",2000,2000,55,2);
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Felps",4000,4000,55,3);
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Corvo",5000,5000,55,4);
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Aragoc",6000,6000,55,5);
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Belrur",7000,7000,55,1);
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Dourus",3000,3000,55,2);
insert into tb_personagem(nome,ataque,defesa,nivel,classe_id)values("Elbaran",3500,4500,55,3);

select * from tb_personagem;

-- personagem com mais de 2000 de ataque
select * from tb_personagem where ataque > 2000;

-- personagem com defesa entre 1000 a 2000
select * from tb_personagem where defesa between 1000 and 2000;

-- personagem com a letra C no inicio do nome
select * from tb_personagem where nome like 'c%';

-- Inner join buscando todos que são guerreiros
select b.nome, a.tipo from tb_classe a
inner join tb_personagem b
on a.id = b.classe_id
where a.tipo = "Guerreiro";












