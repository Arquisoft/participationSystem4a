

INSERT INTO `asw`.`usuarios` (`id`, `apellidos`, `contrasena`, `direccion_postal`, `email`, `fecha_nacimiento`, `nacionalidad`, `nombre`, `numero_identificativo`) VALUES ('1', 'García Larteregui', '2088948c702d6fb94bfa4f4bf314341013730d6da4338507e1be3e5f3b8ccddd9d874faecf00923fe6e26cbd67f0322d9d8e4f6ab8d04704c7f13496dc63a5cb', 'Gijón', 'pelayo@gmail.com', '1994/05/25', 'Española', 'Pelayo', '511236');
INSERT INTO `asw`.`usuarios` (`id`, `apellidos`, `contrasena`, `direccion_postal`, `email`, `fecha_nacimiento`, `nacionalidad`, `nombre`, `numero_identificativo`) VALUES ('2', 'Fernandez Alvarez', '2088948c702d6fb94bfa4f4bf314341013730d6da4338507e1be3e5f3b8ccddd9d874faecf00923fe6e26cbd67f0322d9d8e4f6ab8d04704c7f13496dc63a5cb', 'Oviedo', 'pedro@gmail.com', '1994/05/25', 'Española', 'Pedro', '51123684585T');

INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('1', 'Infraestructuras');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('2', 'Jardines');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('3', 'Transportes');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('4', 'Deportes');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('5', 'Recogida de basuras');
INSERT INTO `asw`.`categoria` (`id`, `nombre`) VALUES ('6', 'Saneamiento');

INSERT INTO  `asw`.`categoria` (`id`, `nombre`) VALUES('7','Medio ambiente');
INSERT INTO  `asw`.`categoria` (`id`, `nombre`) VALUES('8','Carreteras');
INSERT INTO  `asw`.`categoria` (`id`, `nombre`) VALUES('9','Aparcamiento');
INSERT INTO  `asw`.`categoria` (`id`, `nombre`) VALUES('10','Edificios');
INSERT INTO  `asw`.`categoria` (`id`, `nombre`) VALUES('11','Centros comerciales');
INSERT INTO  `asw`.`categoria` (`id`, `nombre`) VALUES('12','Animales');



INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('1', 'Creación de parada de autobus cubierta en Llamaquique', 'Marquesina Llamaquique', '3', '1');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('2', 'Plantacion de nuevos arboles en el Campo San Francisco', 'Nuevos árboles', '13', '2');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('3', 'Implantación de lineas de autobus al nuevo HUCA', 'Lineas de bus Nuevo HUCA', '1', '3');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('4', 'Somos demasiados runners en la ciudad', 'Nuevo estadio de atletismo', '6', '4');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('5', 'La hora de recogida de basuras en invierno es demasiado tarde', 'Ampliacion de horario de recogida', '0', '5');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES ('6', 'Las alcantarillas funcionan muy mal', 'Mejoras alcantarillado', '1', '6');

INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('7','Coste energético casas','Incluir el coste energético de las casas en su valoración de mercado', '0', '7');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('8','Ayudas','Activar ayudas a la eficiencia energética para apoyar la rehabilitación', '0', '7');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('9','IVA','Establecer un IVA reducido para los biocombustibles sólidos y las calderas de biomasa', '0', '7');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('10','Bancos de hábitats','Crear bancos de hábitats para financiar proyectos de conservación', '0', '7');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('11','Gestión bosques','Fomentar la colaboración público privada en la gestión de los bosques', '0', '7');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('12','Eficiencia','Introducir planes de eficiencia para reducir la huella de carbono de los edificios de uso público', '0', '7');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('13','Peajes','Introducir peajes “inteligentes” que promuevan el transporte colectivo y el uso de vehículos de bajas emisiones', '0', '7');

INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('14','Campos de fútbol',1'  Construcción o instalación de vestuarios y aseos en los campos de fútbol situados al sur de la Fuenfresca', '0', '8');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('15','Precio','Reducir el precio por aparcar en la zona verde y zona azul', '0', '9');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('16','Retirar zona verde',2'Retirada de zona verde y zona azul en Tetuán, Barrio del Pilar y Ventilla', '0', '9');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('17','Urbanizar',22,'Urbanizar con zonas verdes mediana Paseo de la Castellana', '0', '9');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('18','Ampliar zona verde',23,'Ampliar la zona VERDE del estacionamiento regulado', '0', '9');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('19','Eliminar','Eliminar zonas verdes en el entorno del Museo Reina Sofía', '0', '9');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('20','Ampliar horario','Ampliar el horario de la zona verde e incluir los domingos', '0', '9');


INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('21','Subir nivel','SUBAN A NIVEL 2 ESTRUCTURAL EL EDIFICIO ESPAÑA','10');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('22','Rehabilitar','Rehabilitar edificios de viviendas sin gastar dinero publico ni privado.','10');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('23','Ascensores','instalación gratuita de ascensores en edificios viejos de mínimo 4 plantas','10');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('24','Edificios históricos','Acceso a lugares y edificios históricos que están cerrados al público','10');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('25','Subvenciones','Pagar subvenciones de Rehabilitación Edificios y Ascensor en el Centro','10');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('26','Alquiler','Alquiler vivienda edificios vacios','10');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('27','Energía solar','Abastecimiento de los edificios de carácter publico por medio de energía solar','10');

INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('28','Difusión de animales','Difundir Animales de el Centro de Protección Animal CPA "La Fortuna "','12');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('29','Veterinarios','centros veterinarios gratuitos , cuidado de animales que viven en la calle','12');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('30','Vacuna','vacuna antirrabica animales compañia','12');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('31','Ordenanza','Madrid necesita una nueva Ordenanza de Tenencia Animales Domésticos','12');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('32','hospital','hOSPITAL PÚBLICO PARA ANIMALES Y MASCOTAS LEGALES','12');
INSERT INTO `asw`.`sugerencia` (`id`, `contenido`, `nombre`, `votos`, `categoria_id`) VALUES('33','Madrid','Madrid tolerancia cero contra el maltrato animal','12');


INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('1', 'Me parece correctisimo', '0', '1','1');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('2', 'Que la soterren ya que estamos', '0', '1','2');

INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('3', 'Para que quieres saber eso? xd', '0', '2','2');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('4', 'Por un Oviedo verde', '0', '2','1');

INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('5', 'No se, yo siempre le echo 20', '0', '3','1');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('6', 'A mi me vendria genial', '0', '3','2');

INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('7', '¿Pero qué me estas container?', '0', '4','2');
INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('8', 'Cuando hace calor huele fatal', '0', '4','1');

INSERT INTO `asw`.`comentario` (`id`, `contenido`, `votos`, `sugerencia_id`,`usuario_id`) VALUES ('9', 'Todo genial', '0', '5','2');
