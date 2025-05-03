TRUNCATE TABLE dictionaries.payment_type CASCADE;
ALTER SEQUENCE dictionaries.payment_type_id_seq RESTART WITH 1;

TRUNCATE TABLE dictionaries.registration_status CASCADE;
ALTER SEQUENCE dictionaries.registration_status_id_seq RESTART WITH 1;

TRUNCATE TABLE business.user CASCADE;
ALTER SEQUENCE business.user_id_seq RESTART WITH 1;

TRUNCATE TABLE business.admin CASCADE;
ALTER SEQUENCE business.admin_id_seq RESTART WITH 1;

TRUNCATE TABLE business.faq CASCADE;
ALTER SEQUENCE business.faq_id_seq RESTART WITH 1;

TRUNCATE TABLE business.price CASCADE;
ALTER SEQUENCE business.price_id_seq RESTART WITH 1;

TRUNCATE TABLE business.registration CASCADE;
ALTER SEQUENCE business.registration_id_seq RESTART WITH 1;

TRUNCATE TABLE business.registration_link_price CASCADE;
ALTER SEQUENCE business.registration_link_price_id_seq RESTART WITH 1;

INSERT INTO dictionaries.payment_type (id, name) VALUES (1, 'Картой');
INSERT INTO dictionaries.payment_type (id, name) VALUES (2, 'Наличными');


INSERT INTO dictionaries.registration_status (id, name) VALUES (1, 'Ожидает оплаты');
INSERT INTO dictionaries.registration_status (id, name) VALUES (2, 'На проверке');
INSERT INTO dictionaries.registration_status (id, name) VALUES (3, 'Оплачено');
INSERT INTO dictionaries.registration_status (id, name) VALUES (4, 'Отклонено');


INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (1, '@kri_dresv', 'Кристина', 'Дресвянникова', '+7 962 554 3201', 'https://t.me/i/userpic/320/nk5BHVQchaNcsHVO2ZN7WiKyh8dg5J9LwsAzNeoX0FA.svg', '125473123');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (2, '@bolshelga', 'Ольга', 'Большакова', '+7 904 665 1098', 'https://t.me/i/userpic/320/hzjAGsQCS7G-BgpGz9PqzfAeK36MwFNvgEHNbC2gA10.svg', '1233467713');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (3, '@ritatro', 'Маргарита', 'Трофимова', '+7 906 113 9628', 'https://t.me/i/userpic/320/aE7cAbhIIHTe0fZXXHkx1TmqeAUcFah9_j_jpd74d0s.svg', '1237777231');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (4, '@TakiIlyas', 'Ильяс', 'Такишин', '+7 996 240 6351', 'https://t.me/i/userpic/320/UMmjvAOPPu94hlpuI_iyYaCicHDU1dP-UsCpsR2IN6w.svg', '3890903123');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (5, 'vladimir_leontev', 'Vladimir', 'Leontev', 'undefined', 'https://t.me/i/userpic/320/KhkaF3U8QmbIFxXP_aL_1FhbgeWalt_bwNxc-JqgiOs.svg', '1235986704');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (6, 'nekit_vp', 'Nekit', '', 'undefined', 'https://t.me/i/userpic/320/PIXS6FxLySQuofZ2NNEIUrpeg-isNevG_LisFMCuPeg.svg', '12312313');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (7, 's_julianna_a', 'юlianna', '', 'undefined', 'https://t.me/i/userpic/320/p8gyBj8M-64mObxpEgAFlngW8tKVOU8SdDV85XnLXjo.svg', '121121');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (8, 'leontev_vyacheslav', 'Vyacheslav', 'Leontev', 'undefined', 'https://t.me/i/userpic/320/d-bjTyj27vTELQHewZKM8h0KNRUCbcZ6yk8aFv57LXs.svg', '965648301');
INSERT INTO business."user" (id, user_name, first_name, last_name, phone, photo_url, telegram_id) VALUES (9, 'Egor_Leontev24', 'Egor', 'Leontev', 'undefined', 'https://t.me/i/userpic/320/GcsrT0dsaqGZBsXCpAAY6XqPib53eejn9a3a7xPIGozOITzXi-y8uTyKboHx0H88.svg', '5467557669');


INSERT INTO business.admin (id, bank_card_number, bank_card_owner, bank_name, phone_number, user_id, church_id, for_bank_card, is_super_admin) VALUES (1, '', '', '', '+7 962 554 3201', 1, 2, false, false);
INSERT INTO business.admin (id, bank_card_number, bank_card_owner, bank_name, phone_number, user_id, church_id, for_bank_card, is_super_admin) VALUES (2, '', '', '', '+7 904 665 1098', 2, 4, false, false);
INSERT INTO business.admin (id, bank_card_number, bank_card_owner, bank_name, phone_number, user_id, church_id, for_bank_card, is_super_admin) VALUES (3, '', '', '', '+7 906 113 9628', 3, 1, false, false);


INSERT INTO business.faq (id, question, answer) VALUES (1, 'Если ребёнку 6 лет сколько оплата?', 'С 2 лет до 6 лет включительно - скидка 50%');
INSERT INTO business.faq (id, question, answer) VALUES (5, 'Может ли  на детский отдых поехать нецерковный ребёнок? Можно ли его зарегистрировать заранее?', 'Регистрация с апреля доступна только для детей Церкви и в том числе для детей кому мы благовествуем, о ком заботимся, о ком являем попечение, а для детей из других Церквей, знакомые, знакомые знакомых, для них возможность откроется с июня по июльской цене.');


INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (1, '2025-02-28 21:00:00.000', '2025-03-30 20:59:59.000', 500, 1);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (2, '2025-03-28 21:00:00.000', '2025-04-30 20:59:59.000', 500, 1);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (3, '2025-05-01 21:00:00.000', '2025-05-31 20:59:59.000', 800, 1);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (4, '2025-05-30 21:00:00.000', '2025-06-30 20:59:59.000', 1000, 1);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (5, '2025-07-01 21:00:00.000', '2025-07-30 20:59:59.000', 1200, 1);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (6, '2025-02-28 21:00:00.000', '2025-03-30 20:59:59.000', 500, 2);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (7, '2025-03-28 21:00:00.000', '2025-04-30 20:59:59.000', 500, 2);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (8, '2025-05-01 21:00:00.000', '2025-05-31 20:59:59.000', 800, 2);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (9, '2025-05-30 21:00:00.000', '2025-06-30 20:59:59.000', 1000, 2);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (10, '2025-07-01 21:00:00.000', '2025-07-30 20:59:59.000', 1200, 2);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (11, '2025-02-28 21:00:00.000', '2025-03-30 20:59:59.000', 1000, 3);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (12, '2025-03-28 21:00:00.000', '2025-04-30 20:59:59.000', 1000, 3);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (13, '2025-05-01 21:00:00.000', '2025-05-31 20:59:59.000', 1500, 3);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (14, '2025-05-30 21:00:00.000', '2025-06-30 20:59:59.000', 2000, 3);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (15, '2025-07-01 21:00:00.000', '2025-07-30 20:59:59.000', 2500, 3);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (16, '2025-02-28 21:00:00.000', '2025-03-30 20:59:59.000', 500, 4);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (17, '2025-03-28 21:00:00.000', '2025-04-30 20:59:59.000', 500, 4);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (18, '2025-05-01 21:00:00.000', '2025-05-31 20:59:59.000', 800, 4);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (19, '2025-05-30 21:00:00.000', '2025-06-30 20:59:59.000', 1000, 4);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (20, '2025-07-01 21:00:00.000', '2025-07-30 20:59:59.000', 1200, 4);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (25, '2025-07-01 21:00:00.000', '2025-07-30 20:59:59.000', 1200, 5);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (23, '2025-05-01 21:00:00.000', '2025-05-31 20:59:59.000', 800, 5);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (24, '2025-05-30 21:00:00.000', '2025-06-30 20:59:59.000', 1000, 5);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (22, '2025-03-28 21:00:00.000', '2025-04-30 20:59:59.000', 500, 5);
INSERT INTO business.price (id, start_date, end_date, value, camp_id) VALUES (21, '2025-02-28 21:00:00.000', '2025-03-30 20:59:59.000', 500, 5);


INSERT INTO business.registration (id, name, last_name, birthdate, city, registration_date, is_active, church_id, user_id, registration_status_id, payment_type_id, admin_id, phone, is_medical_worker, is_organizer) VALUES (1, 'Ефим', 'Трофимов', '2014-06-16 20:00:00.000', 'Казань', '2025-04-04 04:26:49.917', true, 2, 1, 3, null, 1, '+7 909 308 53 01', false, false);
INSERT INTO business.registration (id, name, last_name, birthdate, city, registration_date, is_active, church_id, user_id, registration_status_id, payment_type_id, admin_id, phone, is_medical_worker, is_organizer) VALUES (2, 'Владимир', 'Большаков', '2014-08-07 20:00:00.000', 'Казань', '2025-04-03 06:42:25.931', true, 2, 2, 3, null, 1, '+7 905 315 73 62', false, false);
INSERT INTO business.registration (id, name, last_name, birthdate, city, registration_date, is_active, church_id, user_id, registration_status_id, payment_type_id, admin_id, phone, is_medical_worker, is_organizer) VALUES (3, 'Владимир', 'Большаков', '2014-08-07 20:00:00.000', 'Казань', '2025-04-03 06:39:48.703', true, 2, 3, 3, null, 1, '+7 905 315 73 62', false, false);
INSERT INTO business.registration (id, name, last_name, birthdate, city, registration_date, is_active, church_id, user_id, registration_status_id, payment_type_id, admin_id, phone, is_medical_worker, is_organizer) VALUES (4, 'Егор', 'Леонтьев', '2015-07-26 21:00:00.000', 'Казань', '2025-04-03 06:33:25.934', true, 2, 4, 3, null, 1, '+7 905 315 73 62', false, false);
INSERT INTO business.registration (id, name, last_name, birthdate, city, registration_date, is_active, church_id, user_id, registration_status_id, payment_type_id, admin_id, phone, is_medical_worker, is_organizer) VALUES (5, 'Владимир', 'Леонтьев', '2013-05-26 04:26:10.107', 'Казань', '2025-04-03 05:27:57.493', true, 2, 5, 3, null, 1, '+7 905 315 73 62', false, false);


INSERT INTO business.registration_link_price (id, registration_id, price_id) VALUES (1, 1, 1);
INSERT INTO business.registration_link_price (id, registration_id, price_id) VALUES (2, 2, 3);
INSERT INTO business.registration_link_price (id, registration_id, price_id) VALUES (3, 3, 12);
INSERT INTO business.registration_link_price (id, registration_id, price_id) VALUES (4, 4, 18);
INSERT INTO business.registration_link_price (id, registration_id, price_id) VALUES (5, 5, 21);


