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
 values(null,'Ivan','Horvat','05-12-1997'),
 (null,'Ana','Kovačević','01-01-1996'),
 (null,'Marko','Petrović','02-04-1994'),
 (null,'Mia','Jurić','27-03-1998'),
 (null,'Jasna','Novak','20-11-1980'),
 (null,'Mirjana','Tomić','15-04-1995'),
 (null,'Luka','Kovač','30-06-1999'),
 (null,'Matej','Knežević','12-07-1997'),
 (null,'Davor','Babić','04-12-1998'),
 (null,'Filip','Grgić','25-08-1994'),
 (null,'Lucija','Radić','06-10-1999'),
 (null,'Laura','Matić','31-02-19980');

 insert into razina_plesnog_znanja(id,plesac_id,razina_znanja,datum_od);
 values(null,1,'Početnik','01-06-2023'),
 (null,2,'Početnik','01-06-2023'),
 (null,3,'Napredni','30-05-2023'),
 (null,4,'Napredni','30-05-2023'),
 (null,5,'Početnik','05-06-2023'),
 (null,6,'Početnik','05-06-2023'),
 (null,7,'Napredni','15-04-2023'),
 (null,8,'Napredni','12-04-2023',),
 (null,9,'Profesionalni','25-06-2023',),
 (null,10,'Napredni','28-05-2023',),
 (null,11,'Profesionalni','21-06-2023',),
 (null,12,'Napredni','05-05-2023',);
 


insert into instruktor(id,ime,prezime,datum_rodenja)
values(null,'Ivan','Marošević','12-04-1999'),
(null,'Iva','Huiber','23-04-1996');

insert into stil(id,naziv,opis)
values(null,'Salsa','Salsa je dinamičan i ritmičan ples koji potječe iz Latinske Amerike, posebno iz Kube. Uključuje brze korake, okrete i partnera koji se vode kroz različite figure. Salsa se izvodi uz živahnu glazbu poput salsa ritmova.'),
(null,'Bachata','Bachata je senzualni ples porijeklom iz Dominikanske Republike. To je romantičan ples s naglaskom na intimnost i bliskost između partnera. Karakterizira ga koraci u paru, koraci u krugu i provokativne figure.'),
(null,'Kizomba','Kizomba je afrički ples koji se razvio u Angoli. To je sporiji i senzualniji ples koji naglašava fluidne pokrete i blisku interakciju između partnera. Glazba koja prati kizombu često je romantična i melodična.'),
(null,'Cha-Cha','Cha-cha je ples koji potječe iz Kube i razvio se iz salse. Karakterizira ga brzi i energični koraci, naglašen ritam i razigranost. Cha-cha se izvodi uz glazbu koja ima prepoznatljivi ritam "cha-cha-cha".'),
(null,'Rumba','Rumba je senzualni ples porijeklom iz Kube. Ovaj ples kombinira strastvene korake, okrete i naglašavanje pokreta kukovima. Rumba se izvodi uz romantičnu glazbu i fokusira se na izražavanje emocija.'),
(null,'Tango','Tango je strastveni ples koji potječe iz Argentine. Karakterizira ga bliskost između partnera, precizni koraci i dramatičan izraz. Tango se izvodi uz glazbu koja ima specifičan ritam i melodičnu liniju.');

insert into tecaj(id,naziv,trajanje,instruktor_id,stil_id)
values(null,'Početni tečaj Salse','3 Mjeseca',1,1),
(null,'Napredna Bachata senzual','3 Mjeseca',(1,2),1),
(null,'Kizomba','3 Mjeseca',(1,2),1),
(null,'Početni tečaj Cha-Cha','5 Mjeseci',2,1),
(null,'Rumba','5 Mjeseci',2,1),
(null,'Tango','5 Mjeseci',(1,2),6);

insert into prijava(id,plesac_id,tecaj_id)
values(null,(1,2),(1,2,3)),
(null,(3,4),(4,5,6)),
(null,(5,7),(1,4,6)),
(null,(6,8),(5,3,2)),
(null,(9,11),(3,5,1)),
(null,(10,12),(2,4,6));







