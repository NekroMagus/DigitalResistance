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
  phone   VARCHAR(18) UNIQUE
);

CREATE TABLE room
(
  room_id     SERIAL PRIMARY KEY ,
  count_users INTEGER,
  count_price INTEGER,
  name        VARCHAR(255)
);


CREATE TABLE users_in_room
(
  room_id BIGINT REFERENCES room(room_id),
  user_id BIGINT REFERENCES users (user_id),
  price   INTEGER
);


INSERT INTO users values (1,'hash','+7');
INSERT INTO room values (1,5,1500,'name');