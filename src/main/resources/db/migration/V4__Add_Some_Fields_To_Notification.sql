ALTER TABLE business.notification
    ADD icon VARCHAR(32);

ALTER TABLE business.notification
    ADD is_deleted BOOLEAN;

ALTER TABLE business.notification
    ADD is_read BOOLEAN;