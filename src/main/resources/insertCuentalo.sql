insert into historiador values('1007823151', 'Daniel', 'Thevening', '3005965069', 'dtheveningdiaz@gmail.com', 'Sahagún', 'calle19No6a50');
insert into categoria(nombre, descripcion) values('Terror en el Campo', 'Historias relacionadas a fantasmas, almas en pena que abundan en los campos'),
('Fantasmas femeninos', 'Historias relacionadas a fantasmas con apariencia femenina');
insert into soundtrack(autor, direccion) values('Jose Viera', 'www.sonidos.com');
insert into historia(titulo, contenido, fecha, id_historiador, id_soundtrack) values(
'El pozo de los susurros','En la tranquila noche del campo, los lugareños susurran sobre un antiguo pozo abandonado en el bosque. Dicen que si te asomas, escucharás susurros provenientes de las profundidades. Una noche, una joven curiosa miró y oyó su nombre susurrado desde las sombras. Desde entonces, se dice que su espíritu vaga por el bosque, llamando a otros hacia el pozo.'
,'2022/02/24','1007823151',1);
insert into historia_categoria values(1,1);