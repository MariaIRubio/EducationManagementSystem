DROP DATABASE IF EXISTS `education_db`;
CREATE DATABASE `education_db`;
USE `education_db`;

DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS `authorities`;

CREATE TABLE `users`(
`username` VARCHAR(50) NOT NULL,
`password` VARCHAR(68) NOT NULL,
`enabled` TINYINT NOT NULL,
PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `users` VALUES
('maria', '{bcrypt}$2a$12$2j0JD4t.t4dZknn8t7uiFeVCGHzms/s001GLwo0xDtqzbYRQ6vFfy', 1), 
('daniel', '{bcrypt}$2a$12$2j0JD4t.t4dZknn8t7uiFeVCGHzms/s001GLwo0xDtqzbYRQ6vFfy', 1),
('adriana', '{bcrypt}$2a$12$2j0JD4t.t4dZknn8t7uiFeVCGHzms/s001GLwo0xDtqzbYRQ6vFfy', 1);

CREATE TABLE `authorities` (
`username` VARCHAR(50) NOT NULL,
`authority` VARCHAR(50) NOT NULL,
UNIQUE KEY `authorities4_idx_1` (`username`, `authority`),
CONSTRAINT `authorities4_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users`(`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `authorities` VALUES
('maria', 'ROLE_STUDENT'),
('daniel', 'ROLE_TEACHER'), 
('adriana', 'ROLE_ADMIN');
