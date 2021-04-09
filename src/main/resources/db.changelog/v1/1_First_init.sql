CREATE TABLE 'trustmeenglish'.'users'
(
    'id'       BIGINT(20)  NOT NULL AUTO_INCREMENT,
    'email'    VARCHAR(45) NOT NULL,
    'password' VARCHAR(45) NOT NULL,
    PRIMARY KEY ('id'),
    UNIQUE INDEX 'email_UNIQUE' ('email' ASC) VISIBLE
);

INSERT INTO 'trustmeenglish'.'users' ('email', 'password')
VALUES ('abc@mail.ru', '12345');
INSERT INTO 'trustmeenglish'.'users' ('email', 'password')
VALUES ('cba@mail.ru', '54321');

CREATE TABLE 'trustmeenglish'.'roles'
(
    'id'   BIGINT(20)  NOT NULL AUTO_INCREMENT,
    'name' VARCHAR(45) NOT NULL,
    PRIMARY KEY ('id'),
    UNIQUE INDEX 'name_UNIQUE' ('name' ASC) VISIBLE
);

CREATE TABLE `trustmeenglish`.`users_roles`
(
    `user_id` INT(20) NOT NULL,
    `role_id` INT(20) NOT NULL,
    INDEX `fk_users_idx` (`user_id` ASC) VISIBLE,
    INDEX `fk_roles_idx` (`role_id` ASC) VISIBLE,
    CONSTRAINT `fk_users`
        FOREIGN KEY (`user_id`)
            REFERENCES `trustmeenglish`.`users` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_roles`
        FOREIGN KEY (`role_id`)
            REFERENCES `trustmeenglish`.`roles` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

INSERT INTO `trustmeenglish`.`roles` (`id`, `name`) VALUES ('1', 'USER');
INSERT INTO `trustmeenglish`.`roles` (`id`, `name`) VALUES ('2', 'MANAGER');
INSERT INTO `trustmeenglish`.`roles` (`id`, `name`) VALUES ('3', 'ADMIN');

INSERT INTO `trustmeenglish`.`users_roles` (`users_id`, `roles_id`) VALUES ('1', '1');
