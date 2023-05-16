drop database if exists taxi;
create database taxi;
use taxi;

create table cabs(
    id int not null primary key auto_increment,
    driver_id integer not null,
    cab_type varchar(100)not null,
    reg_number integer not null
);

create table driver(
     id int not null primary key auto_increment,
     driver_name varchar(100)not null,
     cab_id integer not null,
     phone_number integer not null
);

create table customer(
     id int not null primary key auto_increment,
     customer_name varchar(100)not null,
     mobile_number integer not null
);

create table payment(
     id int not null primary key auto_increment,
     destination_id int not null,
     method varchar(50)not null,
     amount decimal(18,2)
);

create table trips(
     id int not null primary key auto_increment,
     customer_id varchar(50) not null,
     driver_name varchar(50) not null,
     payment_id decimal(18,2) not null,
     destination varchar(100) not null
);

alter table driver add foreign key(id)references cabs(id);
alter table trips add foreign key (id)references driver(id);
alter table trips add foreign key (id)references payment(id);
alter table trips add foreign key (id)references driver(id);
alter table trips add foreign key(id) references customer(id); 

insert into cabs(id,driver_id,cab_type,reg_number) values(null,'15','Toyota','OS245BV');
insert into cabs(id,driver_id,cab_type,reg_number) values(null,'10','Kia','VK000OL');
insert into cabs(id,driver_id,cab_type,reg_number) values(null,'23','Hyundai','VU684EL');

insert into driver(id,driver_name,cab_id,phone_number)values(null,'Ivan','24','0954330');
insert into driver(id,driver_name,cab_id,phone_number)values(null,'Petar','10','0984521');
insert into driver(id,driver_name,cab_id,phone_number)values(null,'Marko','5','09233054');

insert into customer(id,customer_name,mobile_number)values(null,'Mario','09852143');
insert into customer(id,customer_name,mobile_number)values(null,'Maja','09189542');
insert into customer(id,customer_name,mobile_number)values(null,'Antonio','09255017');

insert into payment(id,destination_id,method,amount)values(null,'Osječka ulica 58','card','12.82');
insert into payment(id,destination_id,method,amount)values(null,'Riječka ulica 21','cash','20.12');
insert into payment(id,destination_id,method,amount)values(null,'Drinska ulica 10P','card','5.40');

insert into trips (id,customer_id,driver_name,payment,destination)values(null,'Mario','Ivan','12.82',"Osjecka ulica 58");
insert into trips (id,customer_id,driver_name,payment,destination)values(null,'Maja','Petar','20.12',"Riječka ulica 21");
insert into trips (id,customer_id,driver_name,payment,destination)values(null,'Antonio','Marko','5.40',"Drinska ulica 10P");