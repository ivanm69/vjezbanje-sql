drop database if exists Tecaj_plesa;
create database Tecaj_plesa;
use Tecaj_plesa;

create table plesaci(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null,
    datum_rodenja datetime

);
create table razina_plesnog_znanja(
    id int not null primary key auto_increment,
    plesac_id int not null,
    razina_znanja varchar(50)not null
);

create table instruktori(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null,
    datum_rodenja datetime
);

create table stilovi(
    id int not null primary key auto_increment,
    naziv varchar(100) not null,
    opis varchar(50)not null
);

create table tecajevi(
    id int not null primary key auto_increment,
    naziv varchar(50)not null,
    trajanje varchar(50),
    instruktor_id int not null,
    stil_id int not null,
    plesac_id int not null
);

create table raspored(
    id int not null primary key auto_increment,
    tecaj_id int not null,
    datum_pocetka datetime,
    datum_zavrsetka datetime
);

create table grupa(
    id int not null primary key auto_increment,
    naziv varchar(50)not null,
    razina_znanja varchar(50)not null                  
);
-- status rezervacije (potvrdeno,nepotvrdjeno,otkazano)
create table rezervacije(
    id int not null primary key auto_increment,
    plesac_id int not null,
    tecaj_id int not null,
    status_rezervacije boolean not null,
    broj_polaznika int not null
);
-- status placanja(plaćeno,neplaćeno)
create table placanje(
    id int not null primary key auto_increment, 
    rezervacije_id int not null,
    datum_placanja datetime not null,
    status_placanja boolean not null
);

alter table tecajevi add foreign key (plesac_id)references plesaci(id);
alter table tecajevi add foreign key(instruktor_id)references instruktori(id);
alter table tecajevi add foreign key (stil_id)references stilovi(id);
alter table razina_plesnog_znanja add foreign key(plesac_id)references plesaci(id);
alter table grupa add foreign key (id)references razina_plesnog_znanja(id);
alter table raspored add foreign key(tecaj_id)references tecajevi(id);
alter table placanje add foreign key (rezervacije_id)references rezervacije(id);
alter table rezervacije add foreign key(plesac_id)references plesaci(id);



