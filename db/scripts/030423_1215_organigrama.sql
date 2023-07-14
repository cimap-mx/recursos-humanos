--liquibase formatted sql

--changeset alan.vasquez:030423_1215_organigrama

--context
-- ----------------------------
-- Table re-structure for organigrama
-- ----------------------------
DROP TABLE IF EXISTS "personal"."organigrama";
CREATE TABLE "personal"."organigrama" (
  "id_organigrama" serial,
  "id_padre" int4,
  "clave" varchar(255) COLLATE "pg_catalog"."default",
  "nombre" varchar(255) COLLATE "pg_catalog"."default",
  "id_tipo" int4,
  "nivel" int4 NOT NULL,
  "abreviatura" varchar(255) COLLATE "pg_catalog"."default",
  "clave_nivel1" int4,
  "clave_nivel2" int4,
  "clave_nivel3" int4,
  "clave_nivel4" int4,
  "clave_nivel5" int4,
  "clave_nivel6" int4,
  "clave_nivel7" int4,
  "id_unidad" int4,
  "id_puesto" int4,
  "id_plaza" int4
);

-- ----------------------------
-- Primary Key structure for table Organigrama
-- ----------------------------