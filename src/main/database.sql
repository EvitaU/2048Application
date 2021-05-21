set global time_zone = '+3:00';

create database if not exists Highscores;

use Highscores;

create table highscore
(
    id         int not null auto_increment,
    highscore  float,
    created_at timestamp default current_timestamp,
    primary key (id)
);


