TRUNCATE TABLE business.church CASCADE;
ALTER SEQUENCE business.church_id_seq RESTART WITH 1;

INSERT INTO business.church (name) VALUES ('Новая жизнь');
INSERT INTO business.church (name) VALUES ('Слово Истины');
INSERT INTO business.church (name) VALUES ('Примирение');
INSERT INTO business.church (name) VALUES ('Свет Евангелия');
INSERT INTO business.church (name) VALUES ('Другая');
