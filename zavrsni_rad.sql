drop database if exists Tecaj_plesa;
create database Tecaj_plesa;
use Tecaj_plesa;

create table plesac(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null,
    datum_rodenja date
    

);
create table razina_plesnog_znanja(
    id int not null primary key auto_increment,
    plesac_id int not null,
    razina_znanja varchar(50)not null,
    datum_od date
);

create table instruktor(
    id int not null primary key auto_increment,
    ime varchar(50)not null,
    prezime varchar(50)not null,
    datum_rodenja date
);

create table stil(
    id int not null primary key auto_increment,
    naziv varchar(100) not null,
    opis varchar(200)not null
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
 values(null,'Ivan','Horvat','1997-12-05'),
 (null,'Ana','Kovačević','1996-01-01'),
 (null,'Marko','Petrović','1994-04-02'),
 (null,'Mia','Jurić','1998-03-27'),
 (null,'Jasna','Novak','1980-11-20'),
 (null,'Mirjana','Tomić','1995-04-15'),
 (null,'Luka','Kovač','1999-06-30'),
 (null,'Matej','Knežević','1997-07-12'),
 (null,'Davor','Babić','1998-12-04'),
 (null,'Filip','Grgić','1994-08-24'),
 (null,'Lucija','Radić','1999-06-10'),
 (null,'Laura','Matić','1995-10-05');

 insert into razina_plesnog_znanja(id,plesac_id,razina_znanja,datum_od)
 values(null,1,'Početnik','2023-06-01'),
 (null,2,'Početnik','2023-05-30'),
 (null,3,'Napredni','2023-05-30'),
 (null,4,'Napredni','2023-06-05'),
 (null,5,'Početnik','2023-06-05'),
 (null,6,'Početnik','2023-04-15'),
 (null,7,'Napredni','2023-04-12'),
 (null,8,'Napredni','2023-06-26'),
 (null,9,'Profesionalni','2023-05-28'),
 (null,10,'Napredni','2023-06-21'),
 (null,11,'Profesionalni','2023-05-05'),
 (null,12,'Napredni','2023-06-22');
 


insert into instruktor(id,ime,prezime,datum_rodenja)
values(null,'Ivan','Marošević','1999-04-12'),
(null,'Iva','Huiber','1996-04-23');

insert into stil(id,naziv,opis)
values(null,'Salsa','Salsa je dinamičan i ritmičan ples koji potječe iz Latinske Amerike, posebno iz Kube. Uključuje brze korake, okrete i partnera koji se vode kroz različite figure. Salsa se izvodi uz živahnu glazbu poput salsa ritmova.'),
(null,'Bachata','Bachata je senzualni ples porijeklom iz Dominikanske Republike. To je romantičan ples s naglaskom na intimnost i bliskost između partnera. Karakterizira ga koraci u paru, koraci u krugu i provokativne figure.'),
(null,'Kizomba','Kizomba je afrički ples koji se razvio u Angoli. To je sporiji i senzualniji ples koji naglašava fluidne pokrete i blisku interakciju između partnera. Glazba koja prati kizombu često je romantična i melodična.'),
(null,'Cha-Cha','Cha-cha je ples koji potječe iz Kube i razvio se iz salse. Karakterizira ga brzi i energični koraci, naglašen ritam i razigranost. Cha-cha se izvodi uz glazbu koja ima prepoznatljivi ritam "cha-cha-cha".'),
(null,'Rumba','Rumba je senzualni ples porijeklom iz Kube. Ovaj ples kombinira strastvene korake, okrete i naglašavanje pokreta kukovima. Rumba se izvodi uz romantičnu glazbu i fokusira se na izražavanje emocija.'),
(null,'Tango','Tango je strastveni ples koji potječe iz Argentine. Karakterizira ga bliskost između partnera, precizni koraci i dramatičan izraz. Tango se izvodi uz glazbu koja ima specifičan ritam i melodičnu liniju.');

insert into tecaj(id,naziv,trajanje,instruktor_id,stil_id)
values(null,'Početni tečaj Salse','3 Mjeseca',(1),(1)),
(null,'Napredna Bachata senzual','3 Mjeseca',(1),(2)),
(null,'Kizomba','3 Mjeseca',(1),(3)),
(null,'Početni tečaj Cha-Cha','5 Mjeseci',(2),(4)),
(null,'Rumba','5 Mjeseci',(2), (5)),
(null,'Tango','5 Mjeseci',(2),(6));


insert into prijava(id,plesac_id,tecaj_id)
values(null,(1),(2)),
(null,(3),(1)),
(null,(5),(3)),
(null,(6),(4)),
(null,(9),(5)),
(null,(10),(6)),
(null,(2),(1)),
(null,(4),(2)),
(null,(7),(3)),
(null,(8),(4)),
(null,(11),(5)),
(null,(12),(6));

#koji instruktor vodi koji tecaj i koliko traje tecaj
SELECT a.naziv, a.trajanje, CONCAT(b.ime, ' ', b.prezime) AS instruktor
FROM tecaj a
LEFT JOIN instruktor b ON a.instruktor_id = b.id;


#Ovaj upit prikazuje imena plesača, tečaj za koji su prijavljeni i puno ime instruktora koji vodi taj tečaj.
SELECT a.ime, a.prezime, c.naziv AS tecaj, CONCAT(b.ime, ' ', b.prezime) AS instruktor
FROM plesac a
INNER JOIN prijava pr ON a.id = pr.plesac_id
INNER JOIN tecaj c ON pr.tecaj_id = c.id
INNER JOIN instruktor b ON c.instruktor_id = b.id;

#koliko plesaca ima na svakom pojedinom tecaju
SELECT c.naziv, COUNT(a.id) AS broj_plesaca
FROM tecaj c
LEFT JOIN prijava pr ON c.id = pr.tecaj_id
LEFT JOIN plesac a ON pr.plesac_id = a.id
GROUP BY c.id;

#koji plesaci su se prijavili na tecaj
SELECT a.ime, a.prezime
FROM plesac a
INNER JOIN prijava pr ON a.id = pr.plesac_id
INNER JOIN tecaj c ON pr.tecaj_id = c.id
WHERE c.naziv = 'Napredna Bachata senzual';

#Dob svakog prijavljenog plesaca
SELECT a.ime, a.prezime, c.naziv AS tecaj, TIMESTAMPDIFF(YEAR, a.datum_rodenja, CURDATE()) AS dob_plesaca
FROM plesac a
INNER JOIN prijava pr ON a.id = pr.plesac_id
INNER JOIN tecaj c ON pr.tecaj_id = c.id;


