DROP TABLE IF EXISTS website_user;
CREATE TABLE website_user (
    website_user_id INT AUTO_INCREMENT  PRIMARY KEY,
    application_id INT NOT NULL,
    user_name VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS application;
CREATE TABLE application (
    application_id INT AUTO_INCREMENT  PRIMARY KEY,
    application_name VARCHAR(50) NOT NULL
);