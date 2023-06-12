drop database if exists issu;
create database issu;
use issu;

create table student(
    id int not null primary key auto_increment,
    first_name varchar(50)not null,
    last_name varchar(50)not null,
    jmbag integer not null
);

create table student_course(
     id int not null primary key auto_increment,
     student varchar(50)not null,
     course varchar(50),
     date_of_enroll datetime,
     academic_year datetime
);

create table course(
     id int not null primary key auto_increment,
     name1 varchar(50)not null,
     ects decimal(18,2),
     description1 varchar(100)
);

create table academic_year(
     id int not null primary key auto_increment,
     name1 varchar(50)not null,
     start_date0 datetime,
     end_date datetime
);

alter table student_course add foreign key(student) references student(id);
alter table course add foreign key(student)references student(id);
alter table academic_year add foreign key(student) references student(id);
