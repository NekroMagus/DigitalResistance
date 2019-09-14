CREATE TABLE commodity
(
  id       BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  sum      INT,
  quantity double,
  price    int,
  name     varchar(255),
  busy     int
);

CREATE TABLE users
(
  user_id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  hashtag VARCHAR(255),
  phone   VARCHAR(18) UNIQUE
);

CREATE TABLE room
(
  room_id     BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  count_users INT,
  count_price INT,
  name        VARCHAR(255)
);


CREATE TABLE users_in_room
(
  room_id BIGINT NOT NULL,
  user_id BIGINT NOT NULL,
  price   INT,
  FOREIGN KEY (user_id) REFERENCES users (user_id),
  FOREIGN KEY (room_id) REFERENCES room (room_id)
);


