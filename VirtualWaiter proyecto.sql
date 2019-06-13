----------------------------------VIRTUAL WAITER---------------------------------------------------

------------------CREACION DEL TABLESPACE-------------------------------------------------------
CREATE TABLESPACE VirtualWaiter DATAFILE '\home\javier\WAITER\VirtualWiter.dbf' SIZE 800M;

-----------------------------------creación de tablas --------------------------------------------
CREATE TABLE cliente 
    (id_cliente varchar2(50),
    nombre varchar2(50),
    correo varchar2(50),
    contraseña varchar2(50),
    foto varchar2(50),
    constraint pk_cliente primary key (id_cliente));


CREATE TABLE mesa
    (id_mesa number,
    nombre number,
    asientos number,
    disponible varchar2(50),
    constraint pk_mesa primary key(id_mesa));


CREATE TABLE reservacion
    (id_reservacion number,
    fecha DATE DEFAULT (sysdate),
    id_mesa number,
    id_cliente varchar2(50),
    constraint pk_reservacion primary key (id_reservacion),
    constraint fk_mesa_reservacion foreign key (id_mesa) REFERENCES mesa(id_mesa),
    constraint fk_cliente_reservacion foreign key (id_cliente) REFERENCES cliente(id_cliente));


CREATE TABLE tipobebida
    (id_tipobebida number,
    nombre varchar2(50),
    constraint pk_tipobebida primary key(id_tipobebida));

CREATE TABLE bebida
    (id_bebida number,
    nombre varchar2(50),
    precio number,
    descripcion varchar2(50),
    id_tipobebida number,
    constraint pk_bebida primary key(id_bebida),
    constraint fk_tipobida foreign key(id_tipobebida) references tipoBebida(id_tipobebida));

 CREATE TABLE platillo
    (id_platillo number,
    nombre varchar2(50),
    precio number,
    descripcion varchar2(100),
    foto varchar2(50),
    constraint pk_platillo primary key(id_platillo));

 CREATE TABLE postres
    (id_postres number,
    nombre varchar2(50),
    precio number,
    descripcion varchar2(50),
    foto varchar2(50),
    constraint pk_postres prbimary key(id_postres));;

 CREATE TABLE tipopago
    (id_tipopago number,
    nomber varchar2(50),
    constraint pk_tipopago primary key(id_tipopago));



CREATE TABLE pago
   (id_pago number,
   estado varchar2(50),
   fecha date default (sysdate),
   cantidad number,
   constraint pk_pago primary key(id_pago),
   id_cliente varchar2(50),
   id_reservacion number,
   id_bebida number,
   id_platillo number,
   id_postres number,
   id_tipopago number,
   constraint fk_cliente foreign key(id_cliente) references cliente(id_cliente),
   constraint fk_reservacion foreign key(id_reservacion) references reservacion(id_reservacion),
   constraint fk_bebida foreign key(id_bebida) references bebida(id_bebida),
   constraint fk_platillo foreign key(id_platillo) references platillo(id_platillo),
   constraint fk_postres foreign key(id_postres) references postres(id_postres),
   constraint fk_tipopago foreign key(id_pago) references tipopago(id_tipopago));

------------------------------signacion del tablespace--------------------------------------------------------
 ALTER TABLE cliente  MOVE TABLESPACE VirtualWaiter;
ALTER TABLE mesa  MOVE TABLESPACE VirtualWaiter;
ALTER TABLE reservacion  MOVE TABLESPACE VirtualWaiter;
ALTER TABLE tipobebida  MOVE TABLESPACE VirtualWaiter;
ALTER TABLE bebida  MOVE TABLESPACE VirtualWaiter;
ALTER TABLE platillo MOVE TABLESPACE VirtualWaiter;
ALTER TABLE postres  MOVE TABLESPACE VirtualWaiter;
ALTER TABLE tipopago  MOVE TABLESPACE VirtualWaiter;
ALTER TABLE pago  MOVE TABLESPACE VirtualWaiter;
-----------------------------------creacion de usuarios---------------------------------------------------------------
create user javi identified by 123;
create user jonathan identified by 1234;
create user tapia identified by 12345;
create user rogelioo identified by 123456;
---------------------------------------ROLES-------------------------------------------------------------------------
CREATE ROLE jefe;
CREATE ROLE trabajador;
CREATE ROLE chef;

----------------------------------------asignacion de pribilegios--------------------------------------------------
GRANT CONNECT,RESOURCE,DBA,EXP_FULL_DATABASE,IMP_FULL_DATABASE TO jefe;
GRANT CONNECT,RESOURCE,DBA TO chef;
GRANT CONNECT,RESOURCE TO trabajador;

------------------------------------asignacion de pribilegios de objeto----------------------------------------------
GRANT ALL ON cliente TO jefe;
GRANT ALL ON mesa TO jefe;
GRANT ALL ON reservacion TO jefe;
GRANT ALL ON tipobebida TO jefe;
GRANT ALL ON bebida TO jefe;
GRANT ALL ON platillo TO jefe;
GRANT ALL ON postres TO jefe;
GRANT ALL ON tipopago TO jefe;
GRANT ALL ON pago TO jefe;



GRANT select  ON cliente TO trabajador;
GRANT select  ON mesa TO trabajador;
GRANT select  ON reservacion TO trabajador;
GRANT select  ON tipobebida TO trabajador;
GRANT select  ON bebida TO trabajador;
GRANT select  ON platillo TO trabajador;
GRANT select  ON postres TO trabajador;
GRANT select  ON tipopago TO trabajador;
GRANT select  ON pago TO trabajador;

GRANT select,insert,update ON mesa TO chef;
GRANT select,insert,update ON tipobebida TO chef;
GRANT select,insert,update ON platillo TO chef;
GRANT select,insert,update ON postres TO chef;
GRANT select,insert,update ON bebida TO chef;

GRANT jefe TO javi;
GRANT chef TO jonathan;
GRANT trabajador TO tapia;
GRANT chef TO rogelioo;

alter user javi default tablespace VirtualWaiter;
alter user tapia default tablespace VirtualWaiter;
alter user tapia default tablespace VirtualWaiter;
alter user rogelioo default tablespace VirtualWaiter;	
