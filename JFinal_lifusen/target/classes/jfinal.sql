create database jfinal;
use jfinal;
drop table if exists user;
drop table if exists dengji;
create table user(
id int primary key auto_increment,
name varchar(10) not null,
content varchar(200),
dengjiid int,
amount double default 100,
photo varchar(100)
)auto_increment = 1001;
create table dengji(
id int primary key auto_increment,
dengName varchar(10) 
)auto_increment=1001;