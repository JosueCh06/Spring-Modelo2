-- Base de datos
Create database DAW_CL2;
use DAW_CL2;

-- Creacion de tablas
Create table tb_sucursal(
cod_sucursal int primary key auto_increment,
nom_sucursal varchar(25)
);
Create table tb_supervisor(
cod_supervisor int primary key auto_increment,
nom_supervisor varchar(25),
ape_supervisor varchar(25),
dni_supervisor varchar(8),
num_hijos  int,
sueldo double,
cod_sucursal int
);

-- LLave foranea
Alter table tb_supervisor add constraint FK01 foreign key(cod_sucursal) references tb_sucursal(cod_sucursal);

-- Insercion en las tabla tb_sucursal
insert into tb_sucursal values(null,'Chorrillos');
insert into tb_sucursal values(null,'Independencia');
insert into tb_sucursal values(null,'Breña');
insert into tb_sucursal values(null,'Los Olivos');

-- Insercion en las tabla tb_supervisor
insert into tb_supervisor values(null,'Juan', 'Perez Castro','78945612',2,2000,1);
insert into tb_supervisor values(null,'Lucas', 'Ortiz Inga','85274168',2,1800,1);
insert into tb_supervisor values(null,'Rodrigo', 'Inga Chavez','89621453',2,2500,2);
insert into tb_supervisor values(null,'Benjamin', 'Perez Astudillo','74125896',2,2700,2);
insert into tb_supervisor values(null,'Fernando', 'Torres Carrion','65432178',2,2900,3);
insert into tb_supervisor values(null,'Josue', 'Carrion Bolivar','01478526',2,3000,3);
insert into tb_supervisor values(null,'Saul', 'Bolivar Escalante','78965001',2,4000,4);
insert into tb_supervisor values(null,'Joel', 'Escalante Perez','47850036',2,2800,4);
