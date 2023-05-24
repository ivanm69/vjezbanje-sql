drop database if exists Tecaj_plesa;
create database Tecaj_plesa;
use Tecaj_plesa;

create table plesac(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null,
    datum_rodenja datetime
    

);
create table razina_plesnog_znanja(
    id int not null primary key auto_increment,
    plesac_id int not null,
    razina_znanja varchar(50)not null,
    datum_od datetime
);

create table instruktor(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null,
    datum_rodenja datetime
);

create table stil(
    id int not null primary key auto_increment,
    naziv varchar(100) not null,
    opis varchar(50)not null
);

create table tecaj(
    id int not null primary key auto_increment,
    naziv varchar(50)not null,
    trajanje varchar(50),
    instruktor_id int not null,
    stil_id int not null
    
);

create table prijava(
    id int not null primary key auto_increment,
    plesac_id int not null,
    tecaj_id int not null
);

alter table prijava add foreign key (plesac_id) references plesac(id);
alter table razina_plesnog_znanja add foreign key (plesac_id) references plesac(id);
alter table prijava add foreign key (tecaj_id) references tecaj(id);
alter table tecaj add foreign key(stil_id) references stil(id);
alter table tecaj add foreign key(instruktor_id)references instruktor(id);

 insert into plesac(id,ime,prezime,datum_rodenja)
 values();

 insert into razina_plesnog_znanja(id,plesac_id,razina_znanja,datum_od);
 values();


insert into instruktor(id,ime,prezime,datum_rodenja)
values();

insert into stil(id,naziv,opis)
values();

insert into tecaj(id,naziv,trajanje,instruktor_id,stil_id)
values();

insert into prijava(id,plesac_id,tecaj_id)
values();







