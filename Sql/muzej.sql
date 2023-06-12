drop database if exists muzej;
create database muzej;
use muzej;

create table izlozba(
    id int not null primary key auto_increment,
    naziv varchar(50)not null,
    datum varchar (50)not null,
    kustos_id int not null,
    sponzor_id int not null
);

create table djelo(
    id int not null primary key auto_increment,
    naziv varchar(50) not null,
    izlozba_id int not null
);

create table kustos(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null
);

create table sponzor(
    id int not null primary key auto_increment,
    ime varchar(50) not null,
    adresa varchar(50)
);

alter table izlozba add foreign key(kustos_id) references kustos(id);
alter table djelo add foreign key (izlozba_id) references izlozba(id);
alter table izlozba add foreign key (sponzor_id)references sponzor(id)

insert into kustos(id,ime,prezime)
values (null,'Goran','Goranović'),
(null,'Srećko','Marković');

insert into sponzor(id,ime,adresa)
values(null,'Hell energy','Dravska ulica 42'),
(null,'Croatia osiguranje','Vinkovacka 21');

insert into izlozba(id,naziv,datum,kustos_id,sponzor_id)
values (null,'Kazimir Malevich','12.05.2023',1,1),
(null,'Titanovi divovi','13.05.2023',2,2);

insert into djelo(id,naziv,izlozba_id)
values (null,'slika',1),
(null,'kip',2);