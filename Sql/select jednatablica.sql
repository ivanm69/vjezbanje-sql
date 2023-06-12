select * from smjer;

# minimalna forma select naredbe
select 1;

# filtriranje kolona
select naziv, cijena from smjer;

select naziv, sifra, naziv from smjer;

select *, naziv from smjer;


# select lista
# 1. * sve kolone
# 2. naziv kolone
# 3. konstanta

select naziv, 'Osijek' from smjer;

# svakoj koloni se može dati zamjensko ime

select naziv as smjer, 'Osijek' as grad from smjer;

# 4. izraz

select naziv, now() as datum, 2 as velicina, 66.22 as cijena from smjer;

# ispišite imena i prezimena osoba
select ime, prezime from osoba;


# filtriranje redova
select * from osoba;

# koristim operatore
# 1. uperatori uspoređivanja:
# = < > <= >= !=
select * from osoba where sifra=1;


select * from osoba where sifra>=10;

# 2. logički operatori - bool-ovi operatori
# and or not     -> https://i.ytimg.com/vi/7dvqfpXEjdg/maxresdefault.jpg

select * from osoba where sifra>1 and sifra<3;

select * from osoba where sifra=2 or sifra=3;


select * from osoba where not (sifra>3 and sifra<9);

# Izlistajte mi imena i prezimena svih osoba
# koje se ne zovu Antonio

select ime, prezime from osoba
where ime!='Antonio';

select ime, prezime from osoba
where not ime='Antonio';

# 3. ostali operatori
# like

select * from osoba where ime like 'A%';

select * from osoba where ime like '%a';

-- google način pretraživanja
select * from osoba where ime not like '%a%';

# between - upogoni logički and s uključenim vrijednostima

select * from osoba where sifra>=3 and sifra<=5;
select * from osoba where sifra between 3 and 5;

# in - upogoni logički or
select * from osoba where sifra=2 or sifra=6 or sifra=9;
select * from osoba where sifra in (2,6,9);

# postavite sebi svoj OIB
update osoba set oib='61348493740'
where sifra=1;


# Izlistajte sve osobe koje imaju oib

# operatori is null i is not null
select * from osoba where oib is not null;

# Unesite osobu Shaquille O'Neal

# novije verzije baza doyvoljavaju "
insert into osoba (ime,prezime)
values ("Shaquille","O'Neal");

select * from osoba where ime like 'S%';

# sve verzije baza
insert into osoba (ime,prezime)
values ('Shaquille','O\'Neal');






#### BAZA mjesta
# izlistajte sva mjesta 
# u Osječko baranjskoj županiji
select * from mjesto where naziv='Osijek';
select * from mjesto where zupanija =14;
select * from mjesto where postanskibroj  like '31%';

select count(*) from mjesto where zupanija =14;

# Koliko mjesta u hrvatskoj bi bili
# pobjednici igre kaladont?

select * from mjesto where naziv like 'ka%';

# Unesite novo mjesto naziv Keritovac u OBŽ

# baza knjižnica

# koliko ima redova u tablici autor?
select count(*) from autor;

select * from autor limit 20,10;

# Izlistajte sve autore koji su rođeni
# 1980 godine
select * from autor where 
datumrodenja  between '1980-01-01' and '1980-12-31';


# Dečka je ostavila cura, jadan pati
# što bi mu preporučili za čitanje
select * from katalog
where naslov like '%ljubav%'
and sifra in(2660,2879,3063);

# Izlistajte sve izdavače koji su 
# društvo s ograničenom odgovornošću
select * from izdavac
where naziv like '%d%o%o%'
and sifra not in (2,5,443);

# tablici izdavač dodajte kolonu vps
alter table izdavac add column vps int;
update izdavac set vps=1 where 
naziv like '%d%o%o%'
and sifra not in (2,5,443);
select * from izdavac where vps=1;


# unesite sebe kao autora
select * from autor limit 10;

# Obrišite sve kataložne zapise koji govore o smrti

# Baza sakila

# koliko ima jezika u bazi
select count(*) from `language` l;
select * from language;

# unesite hrvatski jezik
describe language;
insert into language (name) values ('Hrvatski');

select first_name  from actor
order by first_name;

select first_name  from actor
order by 1;

select distinct first_name  from actor
order by 1;

# ispišite sve filmove čija cijena posudbe je manja od 
# 3$
select count(*) from film where rental_rate <3;

select * from film limit 10;

# Postoji li u bazi Vaš omiljeni film

select * from customer;

# izlistajte sva jedinstvena prezimena kupaca

# Pogledati https://www.youtube.com/watch?v=toSRmKKiosQ