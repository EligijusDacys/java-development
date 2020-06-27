DROP TABLE IF EXISTS `users`;

create table `user` (
    id int primary key AUTO_INCREMENT,
    email varchar(100) not null unique,
    name varchar(25) not null,
    country varchar(30) not null,
    password varchar(100) default "password" not null
);

insert into `user` (email, password, name, country) values ('kamil@gmail.com', 'secretPassword', "Kamil", "Brasil");
insert into `user` (email, password, name, country) values ('otherUser@gmail.com', 'unknownPassword', "Peter", "Canada");