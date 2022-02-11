DROP TABLE IF EXISTS todo CASCADE;
CREATE TABLE IF NOT EXISTS todo(
  todo_id SERIAL NOT NULL,
  title VARCHAR(255),
  done BOOLEAN,
  limitDate TIMESTAMP NOT NULL,
  PRIMARY KEY (todo_id)
);

DROP TABLE IF EXISTS i_user CASCADE;
CREATE TABLE IF NOT EXISTS i_user (
  user_id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  role_type varchar(32) NOT NULL,
  PRIMARY KEY (user_id)
);