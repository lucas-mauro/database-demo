create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
values (10001, 'Lucas', 'Gil', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
values (10002, 'Juan', 'Arg', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
values (10003, 'Charly', 'Magnanini', sysdate());