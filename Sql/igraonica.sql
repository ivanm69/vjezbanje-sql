drop database if exists igraonica;
create database igraonica;
use igraonica;

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50)not null,
    ime_roditelja varchar(50)not null,
    prezime varchar(50)not null,
    telefon_roditelja varchar(50)not null
);

create table dijete_posjeta(
    dijete int not null,
    posjeta int not null
);

create table posjeta(
    sifra int not null primary key auto_increment,
    datum_vrijeme_dolaska datetime,
    datum_vrijeme_odlaska datetime,
    napomena varchar(50),
    djelatnik_sifra int not null
);

create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50)not null,
    oib varchar(50),
    iban varchar(50),
    radno_mjesto varchar(50)not null
);
create table usluga_posjeta(
    usluga int not null,
    posjeta int not null
);

create table usluga(
    sifra int not null primary key auto_increment,
    cijena decimal(18,2)not null,
    jedinica_mjere varchar(10)not null,
    kolicina int not null,
    naziv varchar(50)not null
);

create table operater(
    sifra int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar (50)not null,
    oib varchar(50) null,
    email varchar(100)not null,
    loznika varchar(100)
);
alter table dijete_posjeta add foreign key (dijete)references dijete(sifra);
alter table dijete_posjeta add foreign key(posjeta)references posjeta(sifra);
alter table posjeta add foreign key(djelatnik_sifra)references djelatnik(sifra);
alter table usluga_posjeta add foreign key(posjeta)references posjeta(sifra);
alter table usluga_posjeta add foreign key(usluga)references usluga(sifra);

insert into operater(sifra,ime,prezime,oib,email)
values(null,'Marko ','Petrović',null,'markop@gmail.com'),
      (null,'Nikola','Jurić',null,'nikoj@gmail.com'),
      (null,'Luka','Horvat',null,'lukah@gmail.com');

insert into dijete(sifra,ime,ime_roditelja,prezime,telefon_roditelja)
values(null,'Mateo','Robert','Pavić','091255621'),
      (null,'Sara','Lea','Tomić','0923541001'),
      (null,'Filip','Dario','Ivanović','0935421854');

insert into djelatnik(sifra,ime,prezime,oib,iban,radno_mjesto)
values(null,'Ana','Kovač',null,null,'Čuvanje djece'),
      (null,'Martina','Kralj',null,null,'Čuvanje djece'),
      (null,'Helena','Lauš',null,null,'Blagajna');

insert into posjeta(sifra,datum_vrijeme_dolaska,datum_vrijeme_odlaska,napomena,djelatnik_sifra)
values (null,'2023-05-15 09:00','2023-05-15 12:30',null,1),
       (null,'2023-05-14 08:30','2023-05-14 14:20',null,2),
       (null,'2023-05-04 15:25','2023-05-04 19:15',null,3);

insert into usluga (sifra,cijena,jedinica_mjere,kolicina,naziv)
values(null,'9.58','vrijeme','1','Čuvanje');

insert into usluga_posjeta(usluga,posjeta)
values(1,1),(1,3),(1,2);

insert into dijete_posjeta (dijete,posjeta)
values(2,1),(1,3),(3,2);

update usluga set cijena=cijena*1.5;
update djelatnik set radno_mjesto='Čuvanje djece' where sifra=3;
update operater set email='lukahorvat@yahoo.com'  where sifra=3;

delete from dijete_posjeta where dijete=2;
delete from dijete where sifra=2;
delete from dijete_posjeta  where posjeta=2;
delete from usluga_posjeta where posjeta=2;
delete from posjeta where sifra=2;