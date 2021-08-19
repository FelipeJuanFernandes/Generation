create database db_pizzaria_legal;

use db_pizzaria_legal;

-- criando categoria
	create table tb_categoria(
		id bigint auto_increment,
	  Tipo varchar(255) not null,
   Tamanho varchar(255) not null,
	 Borda boolean,
		  
   primary key(id)
);

-- criando pizza
	create table tb_pizza(
		id bigint auto_increment,
	  Nome varchar(255) not null,
	 Preco decimal(8,2) not null,
Ingredientes varchar(255),
Categoria_id bigint,
	 Ativo boolean,
        
   primary key(id),
   foreign key(categoria_id) references tb_categoria(id)
);

-- insert categoria
insert into tb_categoria(Tipo, Tamanho, Borda)values("salgada","grande",true);
insert into tb_categoria(Tipo, Tamanho, Borda)values("salgada","broto",true);
insert into tb_categoria(Tipo, Tamanho, Borda)values("salgada","grande",false);
insert into tb_categoria(Tipo, Tamanho, Borda)values("salgada","broto",false);
insert into tb_categoria(Tipo, Tamanho, Borda)values("doce","grande",true);
insert into tb_categoria(Tipo, Tamanho, Borda)values("doce","broto",true);
insert into tb_categoria(Tipo, Tamanho, Borda)values("doce","grande",false);
insert into tb_categoria(Tipo, Tamanho, Borda)values("doce","broto",false);

-- insert pizza
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Calabresa",40.00,"Calabresa",1,true);
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Mussarela",45.00,"Mussarela",2,true);
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Frango",60.00,"Frango",3,true);
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Presunto com Queijo",65.00,"Presunto com Queijo",4,true);
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Brigadeiro",25.00,"Brigadeiro",5,true);
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Romeu e Julieta",30.00,"Queijo e Goiabada",6,true);
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Prestigio",35.00,"Coco",7,true);
insert into tb_pizza(Nome, Preco, Ingredientes,Categoria_id,Ativo)values("Choco Branco",35.00,"Choco Branco",8,true);

--  pizza com preço maior que 45,00
select * from tb_pizza where Preco > 45.00;

-- pizza com preço entre 29,00 a 60,00
select * from tb_pizza where Preco between 29.00 and 60.00;

-- pizza com nome que começa com "C"
select * from tb_pizza where nome like 'C%';

-- inner join das tabelas de pizza com categoria
select a.nome, b.tipo from tb_pizza a
inner join tb_categoria b
on a.categoria_id = b.id
where b.tipo = "doce";




