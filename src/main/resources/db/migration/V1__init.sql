DROP TABLE IF EXISTS _crawling_log;
DROP TABLE IF EXISTS _purchase;
DROP TABLE IF EXISTS _product;
DROP TABLE IF EXISTS _user;

CREATE TABLE _user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(11) NOT NULL,
    birth VARCHAR(11) NOT NULL,
    phone VARCHAR(11) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    gender VARCHAR(11) NOT NULL,
    nickname VARCHAR(11) NOT NULL,
    verified_email INT NOT NULL DEFAULT 0,
    updated TIMESTAMP DEFAULT NOW(),
    created TIMESTAMP DEFAULT NOW()
);

CREATE TABLE _product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(11) NOT NULL,
    price INT NOT NULL,
    usable INT NOT NULL DEFAULT 1,
    updated TIMESTAMP DEFAULT NOW(),
    created TIMESTAMP DEFAULT NOW()
);

CREATE TABLE _purchase (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES _user(id),
    product_id INT REFERENCES _product(id),
    expiration_period INT NOT NULL DEFAULT 1,
    status VARCHAR(11) NOT NULL DEFAULT 'VERIFIED',
    updated TIMESTAMP DEFAULT NOW(),
    created TIMESTAMP DEFAULT NOW()
);

CREATE TABLE _crawling_log (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES _user(id),
    product_id INT REFERENCES _product(id),
    state TEXT NULL,
    status INT NOT NULL DEFAULT 1,
    updated TIMESTAMP DEFAULT NOW(),
    created TIMESTAMP DEFAULT NOW()
);
