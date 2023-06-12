drop database if exists trgovina;
create database trgovina;
use trgovina;

create table trgovina(
    id int not null primary key auto_increment,
    naziv varchar(50) not null,
    adresa varchar(50)not null,
    sef_id int 
);

create table osoba(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null
);

create table radnik_trg(
    osoba_id int not null,
    trgovina int not null
);

create table sef (
    id int not null primary key auto_increment,
    osoba_id int not null,
    trgovina_id int not null
);

alter table trgovina add foreign key(sef_id)references sef(id);
alter table radnik_trg add foreign key(osoba_id)references osoba(id);
alter table radnik_trg add foreign key(trgovina)references trgovina(id);
alter table sef add foreign key(osoba_id)references osoba(id);
alter table sef add foreign key(trgovina_id)references trgovina(id);