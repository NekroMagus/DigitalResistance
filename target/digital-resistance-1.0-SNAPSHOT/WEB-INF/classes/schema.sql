CREATE TABLE commodity
(
  id       SERIAL PRIMARY KEY ,
  sum      INT,
  quantity DECIMAL,
  price    INTEGER,
  name     VARCHAR(255),
  busy     INTEGER
);

CREATE TABLE users
(
  user_id SERIAL PRIMARY KEY ,
  hashtag VARCHAR(255),
  phone   VARCHAR(18) UNIQUE,
  username VARCHAR(255)
);

CREATE TABLE room
(
  room_id     SERIAL PRIMARY KEY ,
  count_users INTEGER,
  count_price INTEGER,
  name        VARCHAR(255),
  equivalently boolean
);

CREATE TABLE users_in_room
(
  id  SERIAL PRIMARY KEY,
  user_id BIGINT,
  room_id BIGINT,
  price INTEGER,
  isadmin boolean
);


INSERT INTO users values (1,'648a81315307a32bd079533c4f47d258d309869f', '+79604786259', 'Mitya');
INSERT INTO users values (2, '46f60547e5b77d13468ef49e9fac10c08b66a644', '+79604786260','Alex');
INSERT INTO users values (3, 'd4256f0f0337cb8f7281750868a737c1a90d0c0d', '+79608343455', 'Mark');
INSERT INTO users values (4, 'ebcb7dd8cd7b888b0ab7092eabc1b870bb0a0cc9', '+79596455198','Artem');
INSERT INTO users values (5, '884541e3ef964580e43e5aff1fb60f21a0c1da4c', '+78834498345', 'Igor');