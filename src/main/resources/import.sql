INSERT INTO `asw`.`usuarios` (`id`, `apellidos`, `contrasena`, `direccion_postal`, `email`, `fecha_nacimiento`, `nacionalidad`, `nombre`, `numero_identificativo`) VALUES ('1', 'García Larteregui', '2088948c702d6fb94bfa4f4bf314341013730d6da4338507e1be3e5f3b8ccddd9d874faecf00923fe6e26cbd67f0322d9d8e4f6ab8d04704c7f13496dc63a5cb', 'Gijón', 'pelayo@gmail.com', '1994/05/25', 'Española', 'Pelayo', '511236');
INSERT INTO `asw`.`usuarios` (`id`, `apellidos`, `contrasena`, `direccion_postal`, `email`, `fecha_nacimiento`, `nacionalidad`, `nombre`, `numero_identificativo`) VALUES ('2', 'Fernandez Alvarez', '2088948c702d6fb94bfa4f4bf314341013730d6da4338507e1be3e5f3b8ccddd9d874faecf00923fe6e26cbd67f0322d9d8e4f6ab8d04704c7f13496dc63a5cb', 'Oviedo', 'pedro@gmail.com', '1994/05/25', 'Española', 'Pedro', '51123684585T');

INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('1', 'Infraestructuras');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('2', 'Jardines');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('3', 'Transportes');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('4', 'Deportes');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('5', 'Recogida de basuras');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('6', 'Saneamiento');




INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('1', 'Creación de parada de autobus cubierta en Llamaquique', 'Marquesina Llamaquique', '3', '1');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('2', 'Plantacion de nuevos arboles en el Campo San Francisco', 'Nuevos árboles', '13', '2');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('3', 'Implantación de lineas de autobus al nuevo HUCA', 'Lineas de bus Nuevo HUCA', '1', '3');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('4', 'Somos demasiados runners en la ciudad', 'Nuevo estadio de atletismo', '6', '4');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('5', 'La hora de recogida de basuras en invierno es demasiado tarde', 'Ampliacion de horario de recogida', '0', '5');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('6', 'Las alcantarillas funcionan muy mal', 'Mejoras alcantarillado', '1', '6');




INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('1', 'Me parece correctisimo', '0', '1');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('2', 'Que la soterren ya que estamos', '0', '1');

INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('3', 'Para que quieres saber eso? xd', '0', '2');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('4', 'Por un Oviedo verde', '0', '2');

INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('5', 'No se, yo siempre le echo 20', '0', '3');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('6', 'A mi me vendria genial', '0', '3');

INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('7', '¿Pero qué me estas container?', '0', '4');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`) VALUES ('8', 'Cuando hace calor huele fatal', '0', '4');


