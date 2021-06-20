use db_escola;

create table tb_alunos(
	RA bigint(10) auto_increment,
    nome varchar(200) not null,
    turma varchar(200) not null,
    professor varchar(200) not null,
    nota bigint(2),
    primary key (RA)
)