--liquibase formatted sql

--changeset francisco.vieyra:230323_1619_create_table_jerarquia

--context Crear el esquema personal en la base de datos de recursos humanos

	DROP TABLE IF EXISTS personal.jerarquia;

	CREATE TABLE personal.jerarquia (
	  id_jerarquia int4 NOT NULL,
	  nombre_jerarquia varchar(15) COLLATE pg_catalog.default
	);

	COMMENT ON COLUMN personal.jerarquia.id_jerarquia IS 'Id de la tabla jerarquia';
	COMMENT ON COLUMN personal.jerarquia.nombre_jerarquia IS 'Nombre de la jerarquia';


	DELETE FROM personal.jerarquia;

	INSERT INTO personal.jerarquia VALUES (1, 'Responsable');
	INSERT INTO personal.jerarquia VALUES (2, 'Asistente');
	INSERT INTO personal.jerarquia VALUES (3, 'Operativo');
	INSERT INTO personal.jerarquia VALUES (4, 'Soporte técnico');