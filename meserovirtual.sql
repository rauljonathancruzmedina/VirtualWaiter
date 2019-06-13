----------------------------------VIRTUAL WAITER---------------------------------------------------

------------------CREACION DEL TABLESPACE-------------------------------------------------------
CREATE TABLESPACE MeseroVirtual DATAFILE '\home\javier\WAITER\MeseroVirtual.dbf' SIZE 800M;

-----------------------------------creación de tablas --------------------------------------------
CREATE TABLE alimentos
    (codigo_al varchar2(50),
    tipo_al varchar2(50),
    nombre_al varchar2(50),
    precio_al decimal(10,2),
    constraint pk_alimentos primary key (codigo_al));

insert into alimentos(codigo_al,tipo_al,nombre_al,precio_al)values(0001,'platillo','pollo en salsa verde',35.00);

CREATE TABLE registro_venta
    (numero varchar2(50),
    total decimal(10,2),
    fecha date default (sysdate),
    constraint pk_registro_venta primary key(numero));
insert into registro_ventas(numero,total,fecha)values('platillo','35',);


CREATE TABLE usuarios
    (codigo_us varchar2(50),
    nombre_us varchar2(50),
    sexo_us varchar2(50),
    tipo_us varchar2(50),

pass varchar2(50),
    constraint pk_usuario primary key (codigo_us));

------------------------------signacion del tablespace--------------------------------------------------------
ALTER TABLE registro_venta  MOVE TABLESPACE MeseroVirtual;
ALTER TABLE usuario  MOVE TABLESPACE MeseroVirtual;
ALTER TABLE alimentos  MOVE TABLESPACE MeseroVirtual;

create user Javier identified by javi;

---------------------------------------ROLES-------------------------------------------------------------------------
CREATE ROLE principa;

----------------------------------------asignacion de pribilegios--------------------------------------------------
GRANT CONNECT,RESOURCE,DBA,EXP_FULL_DATABASE,IMP_FULL_DATABASE TO principa;

------------------------------------asignacion de pribilegios de objeto----------------------------------------------
GRANT ALL ON usuarios TO principa;
GRANT ALL ON registro_venta TO principa;
GRANT ALL ON alimentos TO principa;

GRANT principa TO Javier;

	alter user Javier default tablespace MeseroVirtual;
