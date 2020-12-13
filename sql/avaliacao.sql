Create table Categoria(
	id bigint not null GENERATED ALWAYS AS IDENTITY,
	codigo int not null,
	descricao varchar(100),
	 PRIMARY KEY(id)
);


INSERT INTO public.categoria(
	 codigo, descricao)
	VALUES ( 1, 'Comportamental');
	INSERT INTO public.categoria(
	 codigo, descricao)
	VALUES ( 2, 'Programação');
	INSERT INTO public.categoria(
	 codigo, descricao)
	VALUES ( 3, 'Qualidade');
	INSERT INTO public.categoria(
	 codigo, descricao)
	VALUES ( 4, 'Processos');
	

Create table Curso(
	id bigint not null GENERATED ALWAYS AS IDENTITY,
	descricao varchar(100) not null,
	data_inicio date not null,
	data_termino date not null,
	quantidade_alunos int,
	categoria_id bigint not null,
	PRIMARY KEY(id),
	CONSTRAINT fk_categoria
      FOREIGN KEY(categoria_id) 
	  REFERENCES categoria(id)
);
