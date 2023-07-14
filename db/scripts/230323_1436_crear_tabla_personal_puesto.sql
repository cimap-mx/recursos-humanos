--liquibase formatted sql

--changeset enrique.illan:2023-03-23_1436_crear_tabla_personal_puesto

--context

CREATE TABLE "personal"."puesto" (
  "id_puesto" int4,
  "id_unidad" int4,
  "id_perfil" int4,
  "id_categoria" int4,
  "nombre" varchar(255),
  "fecha_inicial" date,
  "fecha_final" date
)
;
