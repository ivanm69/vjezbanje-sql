select * from smjer;

select * from grupa where smjer= 1;

select b
from smjer a inner join grupa b 
on a.sifra = b.smjer 
where a.naziv='Java programiranje';

select a.naziv as smjer, b.naziv as grupa
from smjer a inner join grupa b 
on a.sifra=b.smjer;

select a.naziv as smjer, b.naziv as grupa
from smjer a left join grupa b 
on a.sifra=b.smjer;

select a.naziv as smjer, b.naziv as grupa,
concat(d.ime,'',d.prezime)as predavac,
concat(g.ime,'',g.prezime)as polaznik
from smjer a 
inner join grupa b  on a.sifra=b.smjer
inner join predavac c on b.predavac=c.sifra
inner join osoba d 	on c.osoba=d.sifra
inner join clan e 	on b.sifra=e.grupa 
inner join polaznik f on e.polaznik=f.sifra 
inner join osoba g 	on f.osoba=g.sifra;
#alter 
select smjer.naziv as smjer, grupa.naziv as grupa
from smjer  inner join grupa  
on smjer.sifra=grupa.smjer;
# alt 2
select smjer.naziv as smjer, grupa.naziv as grupa
from smjer,grupa  
where smjer.sifra=grupa.smjer;

#################################
select a.ime,a.prezime, b.naslov 
from  autor a inner join katalog b 
on a.sifra=b.autor 
where a.ime='Ivana' and a.prezime like'Brli%';

#Koji autori nisu izdali niti jednu knjigu
select a.ime,a.prezime, b.naslov
from  autor a left join katalog b 
on a.sifra=b.autor 
where b.autor is null;

#Gdje su augustovi naslovi????

select distinct c.naziv
from autor a 
inner join katalog b on a.sifra=b.autor 
inner join mjesto c on b.mjesto=c.sifra 
where a.ime='August' and a.prezime='Senoa';

#objavili izdavaci koji nisu d.o.o
select distinct b.naziv,a.naslov 
from katalog a
inner join izdavac b on a.izdavac=b.sifra 
where b.naziv not like '%d.o.o%';
####################################
#sakilla

select c.title
from actor a inner join film_actor b 
on a.actor_id=b.actor_id 
inner join film c on c.film_id=b.film_id 
where a.first_name ='Burt' and a.last_name ='Posey';

select distinct f.first_name ,f.last_name 
from actor a inner join film_actor b 
on a.actor_id=b.actor_id 
inner join film c on c.film_id=b.film_id 
inner join inventory d on d.film_id =c.film_id 
inner join rental e on d.inventory_id=e.inventory_id 
inner join customer f on f.customer_id =e.customer_id 
where a.first_name ='Burt' and a.last_name ='Cosey';


update actor set last_name ='Cosey';

#
select a.name,count(b.film_id)
from category a left join film_category b 
on a.category_id =b.category_id
group by a.name 
order by 2
limit 1;

select * from category 
where name='Horror'
delete from film_category 
where category_id=11

select a.first_name ,a.last_name 
from staff a 
inner join address b on a.address_id =b.address_id 
inner join city c on b.city_id =c.city_id 
where c.city='Barcelona';
