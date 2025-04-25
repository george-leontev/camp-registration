TRUNCATE TABLE business.notification;

INSERT INTO business.notification (telegram_id, title, content, date, icon, is_deleted, is_read)
VALUES ('7654566754',
        'Ваша регистрация аннулирована',
        'Ваша регистрация на лагеря была автоматически отменена, так как мы не получили оплату в течение 7 дней',
        '2025-02-25 20:00:00',
        '⚠️',
        false,
        false
        );

INSERT INTO business.notification (telegram_id, title, content, date, icon, is_deleted, is_read)
VALUES ('5465462436',
        'Ваша регистрация аннулирована',
        'Ваша регистрация на лагеря была автоматически отменена, так как мы не получили оплату в течение 7 дней',
        '2025-03-25 20:00:00',
        '⚠️',
        true,
        false
       );

INSERT INTO business.notification (telegram_id, title, content, date, icon, is_deleted, is_read)
VALUES ('345665412',
        'Ваша регистрация аннулирована',
        'Ваша регистрация на лагеря была автоматически отменена, так как мы не получили оплату в течение 7 дней',
        '2025-04-25 20:00:00',
        '⚠️',
        false,
        false
       );