create table course
(
	id bigint not null,
	name varchar(255) not null,
	author varchar(255) not null,
	primary key (id)
	
);
--INSERT into course (id, name, author)
--values(1, 'Learn AWS', 'in28minutes');
--
--SELECT * FROM COURSE;
--
--DELETE FROM COURSE WHERE id = 1;