CREATE TABLE ITEMS(
    ID FLOAT PRIMARY KEY NOT NULL,
    ITEM VARCHAR2(50) NOT NULL,
    PADRE FLOAT,
    ACCESO INT NOT NULL,
    RUTA VARCHAR2(100)
);

INSERT INTO ITEMS VALUES(1.368,'Reggistro de asuntos',null,1,'registro-asuntos.html');
INSERT INTO ITEMS VALUES(1.369,'Consulta de asuntos',null,1,'consulta-asuntos.html');
INSERT INTO ITEMS VALUES(1.370,'Reportes',null,1,null);
INSERT INTO ITEMS VALUES(1.371,'Gastos',1.370,1,null);
INSERT INTO ITEMS VALUES(1.372,'Reporte de asuntos',1.370,1,null);
INSERT INTO ITEMS VALUES(1.373,'Reporte de juicios',1.370,1,null);
INSERT INTO ITEMS VALUES(1.374,'Despachos externos',null,1,'despachos-externos/busqueda-despachos.html');
INSERT INTO ITEMS VALUES(1.375,'Boletines',null,1,'boletines/consulta-boletines.html');
INSERT INTO ITEMS VALUES(1.376,'Administracion',null,1,null);
INSERT INTO ITEMS VALUES(1.377,'Catalogos Institucionales',1.376,1,null);
INSERT INTO ITEMS VALUES(1.378,'Bitacora',1.376,1,null);

COMMIT;

SELECT * FROM ITEMS;