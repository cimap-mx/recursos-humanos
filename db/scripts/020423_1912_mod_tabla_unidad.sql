--liquibase formatted sql

--changeset alan.vasquez:020423_1912_mod_tabla_unidad

--context
-- ----------------------------
-- Table re-structure for unidad
-- ----------------------------
DROP TABLE IF EXISTS "personal"."unidad";
CREATE TABLE "personal"."unidad" (
  "id_unidad" serial,
  "nombre" varchar(255) COLLATE "pg_catalog"."default",
  "abreviatura" varchar(255) COLLATE "pg_catalog"."default",
  "clave" varchar(255) COLLATE "pg_catalog"."default",
  "id_padre" int4,
  "nivel" int4 NOT NULL,
  "clave_nivel1" int4,
  "clave_nivel2" int4,
  "clave_nivel3" int4,
  "clave_nivel4" int4,
  "clave_nivel5" int4
);

-- ----------------------------
-- Primary Key structure for table unidad
-- ----------------------------
-- ALTER TABLE "recursos_humanos"."unidad" ADD CONSTRAINT "unidad_pkey" PRIMARY KEY ("id_unidad");
