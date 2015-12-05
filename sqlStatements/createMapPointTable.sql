CREATE TABLE `weekevents`.`mappoint` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `latitude` DOUBLE NOT NULL,
  `longitude` DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));
