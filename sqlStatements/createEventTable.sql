CREATE TABLE `weekevents`.`event` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` TINYTEXT NOT NULL,
  `type` ENUM('eventType1', 'eventType2') NOT NULL,
  `shorDescription` TINYTEXT NOT NULL,
  `description` LONGTEXT NOT NULL,
  `datetime` TIMESTAMP(6) NOT NULL,
  `mapPointId` INT NOT NULL,
  `address` VARCHAR(120) NOT NULL,
  `userId` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));
