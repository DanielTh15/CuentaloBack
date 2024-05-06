---------------- SCHEMA ----------------------------

CREATE TABLE HISTORIADOR(
"id_historiador" VARCHAR(30) PRIMARY KEY,
"nombre" VARCHAR(50)  NULL,
"apellido" VARCHAR(50)  NULL,
"celular" VARCHAR(50)  NULL,
"correo" VARCHAR(50)  NULL,
"ciudad" VARCHAR(50)  NULL,
"direccion" VARCHAR(50)  NULL
);

CREATE TABLE SOUNDTRACK(
"id_soundtrack" SERIAL PRIMARY KEY,
"autor" VARCHAR(50) NULL,
"direccion" VARCHAR(1000)

);

CREATE TABLE HISTORIA(
"id_historia" SERIAL PRIMARY KEY,
"titulo" VARCHAR(255),
"contenido" TEXT,
"fecha" TIMESTAMP,
"id_historiador" VARCHAR(30),
"id_soundtrack" INT NOT NULL,
FOREIGN KEY("id_historiador") REFERENCES HISTORIADOR("id_historiador"),
FOREIGN KEY("id_soundtrack") REFERENCES SOUNDTRACK ("id_soundtrack")

);

CREATE TABLE COMENTARIO(
"id_comentario" SERIAL PRIMARY KEY,
"contenido" VARCHAR(50)  NULL,
"id_historia" INT,
FOREIGN KEY("id_historia") REFERENCES HISTORIA("id_historia")
);


CREATE TABLE CATEGORIA(
"id_categoria" SERIAL PRIMARY KEY,
"nombre" VARCHAR(20),
"descripcion" VARCHAR(500)
);


CREATE TABLE HISTORIA_CATEGORIA(
"id_historia" INT NOT NULL,
"id_categoria" INT NOT NULL,
PRIMARY KEY("id_historia", "id_categoria"),
FOREIGN KEY ("id_historia") REFERENCES HISTORIA("id_historia"),
FOREIGN KEY ("id_categoria") REFERENCES CATEGORIA("id_categoria")
);


-------------- INSERT DATA ----------------




