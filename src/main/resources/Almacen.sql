use heroku_0d3d9a2e88b6da5;

DROP TABLE IF EXISTS `piezas`;
DROP table IF EXISTS `proveedores`;
DROP table IF EXISTS `suministra`;

create table piezas(
codigo int(10),
nombre varchar(100),
 PRIMARY KEY (codigo)
);

create table proveedores (
codigo int(10),
nombre varchar(100),
PRIMARY KEY (codigo)
);

create table suministra (
id int(10) NOT NULL AUTO_INCREMENT,
codigo_pieza int,
id_proveedor int(10),
precio int,
CONSTRAINT FK_pieza_suminis FOREIGN KEY (codigo_pieza) REFERENCES piezas(codigo)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_proveedo_suminis FOREIGN KEY (id_proveedor) REFERENCES proveedores(codigo)
ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (id)
);

insert into piezas (`codigo`, `nombre`) values(1, 'Tuerca');
insert into piezas (`codigo`, `nombre`) values(2, 'Tornillo');
insert into piezas (`codigo`, `nombre`) values(3, 'Arandela');


insert into proveedores (`codigo`, `nombre`) values (1, 'Saltoki');
insert into proveedores (`codigo`, `nombre`) values (2, 'Bauhaus');
insert into proveedores (`codigo`, `nombre`) values (3, 'Leroy');

insert into suministra (`codigo_pieza`, `id_proveedor`, `precio`) values ( 1, 1, 2 );
insert into suministra (`codigo_pieza`, `id_proveedor`, `precio`) values ( 2, 2, 3);
insert into suministra (`codigo_pieza`, `id_proveedor`, `precio` ) values ( 3, 3, 5);

