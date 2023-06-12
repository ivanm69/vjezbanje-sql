drop database if exists galerija;
create database galerija;
use galerija;

create table galerija(
    sifra int not null primary key auto_increment,
    naziv varchar(50)not null,
    nadredjena int not null,
    autor int not null
);

create table autor(
    sifra int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null
);

create table slika(
    sifra int not null primary key auto_increment,
    galerija int not null,
    putanja varchar(100)not null
);

create table slika_oznaka(
    slika int not null,
    oznaka int not null
);

create table oznaka(
    sifra int not null primary key auto_increment,
    naziv varchar(50)not null
);

alter table galerija add foreign key(nadredjena) references  galerija(sifra);
alter table galerija add foreign key(autor)references autor(sifra);
alter table slika add foreign key (galerija)references galerija(sifra);
alter table slika_oznaka add foreign key(slika)references slika(sifra);
alter table slika_oznaka add foreign key(oznaka)references oznaka(sifra);

insert into galerija(sifra,naziv,nadredjena,autor)
values (null,'Galerija 360',1,null),
(null,'Umjetnički dojam'1,null),
(null,'InspireART galerija',1,null);

insert into autor(sifra,ime,prezime)
values(null,'Leonardo','Da Vinci'),
(null,'Pablo','Picasso'),
(null,'Frida','Kahlo');

insert into slika(sifra,galerija,putanja)
values (null)