-- initial data model for estimation service

CREATE TABLE `user_roles` (
  `user_role_id`      BIGINT(20)  NOT NULL AUTO_INCREMENT,
  `user_role_name`    CHAR(20)    NOT NULL,
  PRIMARY KEY (`user_role_id`)
)
  ENGINE = INNODB
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE `users` (
  `user_id`                 BIGINT(20)     NOT NULL AUTO_INCREMENT,
  `user_name`               VARCHAR(20)    NOT NULL,
  `user_password`           VARCHAR(50)    NOT NULL,
  `first_name`              VARCHAR(50)    NOT NULL,
  `second_name`             VARCHAR(50)    NOT NULL,
  `email`                   TEXT           NOT NULL,
  `user_role_id`            BIGINT(20)     NOT NULL,
  `created_date`            TIMESTAMP      NOT NULL,
  `modified_date`           TIMESTAMP      NOT NULL,
  `verified`                INT(1)         NOT NULL,
  `archived`                INT(1)         NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY (`user_name`),
  CONSTRAINT `user_roles_fk` FOREIGN KEY (`user_role_id`) REFERENCES `user_roles` (`user_role_id`)
)
  ENGINE = INNODB
  DEFAULT CHARSET = utf8mb4;
