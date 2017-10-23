create database IF NOT EXISTS grantienda default character set utf8 default collate utf8_general_ci;
create user 'grantienda'@'%' identified by 'grantienda';
grant all privileges on grantienda.* to 'grantienda'@'%';
flush privileges;
