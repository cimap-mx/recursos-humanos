--liquibase formatted sql

--changeset alan.vasquez:2023-03-21_1500_crear_tabla_unidad

--context
-- ----------------------------
-- Table structure for unidad
-- ----------------------------
DROP TABLE IF EXISTS "recursos_humanos"."unidad";
CREATE TABLE "recursos_humanos"."unidad" (
  "id_unidad" int4 NOT NULL,
  "clave" int4,
  "unidad" varchar(255) COLLATE "pg_catalog"."default",
  "abreviatura" varchar(255) COLLATE "pg_catalog"."default",
  "id_padre" int4
)
;

-- ----------------------------
-- Primary Key structure for table unidad
-- ----------------------------
ALTER TABLE "recursos_humanos"."unidad" ADD CONSTRAINT "unidad_pkey" PRIMARY KEY ("id_unidad");
