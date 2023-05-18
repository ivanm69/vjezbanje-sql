drop database if exists udruga_za_zastitu_zivotinja;
create database udruga_za_zastitu_zivotinja;
use udruga_za_zastitu_zivotinja;



create table osoba(
     osoba_id int not null primary key auto_increment,
     ime varchar(50)not null,
     prezime varchar(50) not null,
     adresa varchar(50) not null,
     telefon varchar(15)not null
     
);

create table sticenik(
     sticenik_id int not null primary key auto_increment,
     ime varchar(50)not null,
     vrsta varchar(50) not null,
     datum_dolaska date not null,
     osoba_id int not null,
     prostor_id int not null
);

create table prostor(
     prostor_id int not null primary key auto_increment,
     naziv varchar(50) not null,
     kapacitet integer not null
     );

alter table sticenik add foreign key(osoba_id)references osoba(osoba_id);
alter table sticenik add foreign key(prostor_id)references prostor(prostor_id);

insert into osoba (osoba_id,ime,prezime,adresa,telefon)
values(null,'Ana','Anić','Voćarska ulica 12','098521345'),
(null,'Marija','Marić','Riječka ulica 56','0915523220');


insert into prostor (prostor_id,naziv,kapacitet)
values (null,'azil','250');

insert into sticenik (sticenik_id,ime,vrsta,datum_dolaska,osoba_id,prostor_id)
values (null,'Floki','pas','12.03.2022',1,1),
(null,'Bobi','macak','1.03.2022',2,1),
(null,'Ringo','zec','10.01.2022',1,1),
(null,'Bloom','pas','08.08.2022',2,1);