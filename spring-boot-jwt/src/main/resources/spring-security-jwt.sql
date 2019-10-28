DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `role`;
DROP TABLE IF EXISTS `user_role`;
DROP TABLE IF EXISTS `role_permission`;
DROP TABLE IF EXISTS `permission`;

CREATE TABLE `user` (
    `id` bigint(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
    );
CREATE TABLE `role` (
    `id` bigint(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
    );
CREATE TABLE `user_role` (
    `user_id` bigint(11) NOT NULL,
    `role_id` bigint(11) NOT NULL
    );
CREATE TABLE `role_permission` (
    `role_id` bigint(11) NOT NULL,
    `permission_id` bigint(11) NOT NULL
    );
CREATE TABLE `permission` (
    `id` bigint(11) NOT NULL AUTO_INCREMENT,
    `url` varchar(255) NOT NULL,
    `name` varchar(255) NOT NULL,
    `description` varchar(255) NULL,
    `pid` bigint(11) NOT NULL,
    PRIMARY KEY (`id`)
    );

INSERT INTO user (id, username, password) VALUES (1,'user','e10adc3949ba59abbe56e057f20f883e');
INSERT INTO user (id, username , password) VALUES (2,'admin','e10adc3949ba59abbe56e057f20f883e');
INSERT INTO role (id, name) VALUES (1,'USER');
INSERT INTO role (id, name) VALUES (2,'ADMIN');
INSERT INTO permission (id, url, name, pid) VALUES (1,'/user/hi','',0);
INSERT INTO permission (id, url, name, pid) VALUES (2,'/admin/hi','',0);
INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 1);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 1);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 2);
