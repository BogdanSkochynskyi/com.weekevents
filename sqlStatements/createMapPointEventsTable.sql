CREATE TABLE `weekevents`.`mappointevents` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `mappointId` INT NOT NULL,
    `eventId` INT NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC));
