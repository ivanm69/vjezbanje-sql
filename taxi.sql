drop database if exists taxi;
create database taxi;
use taxi;

create table taxi_tvrtka(
    taxi_Id int not null primary key auto_increment,
    naziv varchar(50) not null,
    adresa varchar(100)not null,
    telefon varchar(50)
);

create table vozilo(
     vozilo_id int not null primary key auto_increment,
     taxi_Id int not null,
     model varchar(50) not null,
     regtablica varchar(50) not null
);

create table vozac(
     vozac_id int not null primary key auto_increment,
     ime varchar(50)not null,
     prezime varchar(50) not null,
     telefon varchar(50)not null
);

create table voznja(
     voznja_id int not null primary key auto_increment,
     vozac_id int not null,
     vozilo_id int not null,
     datum datetime
);

create table putnik(
     putnik_id int not null primary key auto_increment,
     ime varchar(50) not null,
     prezime varchar(50) not null,
     telefon varchar(12) not null
);

create table voznja_putnik(
     voznja_id int not null,
     putnik_id int not null
);

alter table vozilo add foreign key(taxi_id)references taxi_tvrtka(taxi_id);
alter table voznja add foreign key(vozac_id)references vozac(vozac_id);
alter table voznja add foreign key(vozilo_id)references vozilo(vozilo_id);
alter table voznja_putnik add foreign key(voznja_id)references voznja(voznja_id);
alter table voznja_putnik add foreign key(putnik_id)references putnik(putnik_id);

insert into taxi_tvrtka(taxi_id,naziv,adresa,telefon)
values(null,'Osječki','Čepinska ulica 120','502-502');
insert into taxi_tvrtka(taxi_id,naziv,adresa,telefon)
values(null,'Cameo','Vukovarska 64','300-300');

insert into vozilo(vozilo_id,taxi_id,model,regtablica)
values(null,2,'Toyota','OS245IM'),
(null,1,'Hyundai','OS1205MV');

insert into vozac(vozac_id,ime,prezime,telefon)
values(null,'Ivan','Marošević','0923301144'),
(null,'Ivo','Ivić','091523017');

insert into putnik(putnik_id,ime,prezime,telefon)
values(null,'Mario','Krznar','095423152'),
(null,'Hrvoje','Kraljev','0912546214');

insert into voznja(voznja_id,vozac_id,vozilo_id,datum)
values(null,(1),(1),null),
(null,(2),(2),null);
insert into voznja_putnik(voznja_id,putnik_id)
values(1,1),(2,2),(1,2),(2,1);
