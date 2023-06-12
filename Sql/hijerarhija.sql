

# c:\xampp\mysql\bin\mysql -uroot < C:\Users\Katedra\Documents\hijerarhija.sql

drop database if exists hijerarhija;
create database hijerarhija;
use hijerarhija;

create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    placa decimal(18,2),
    nadredeni int
);

alter table zaposlenik add foreign key (nadredeni) references zaposlenik(sifra);