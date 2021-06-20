use db_rh;
create table tb_empregados (
	id bigint(5) auto_increment,
    nome varchar(30) not null, 
    cargo varchar(30) not null,
    salario bigint(10) not null,
    admissao date,
    primary key(id)
)


