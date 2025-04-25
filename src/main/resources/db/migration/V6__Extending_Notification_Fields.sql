ALTER TABLE business.notification
ALTER
COLUMN content TYPE VARCHAR(256) USING (content::VARCHAR(256));

ALTER TABLE business.notification
ALTER
COLUMN icon TYPE VARCHAR(16) USING (icon::VARCHAR(16));

ALTER TABLE business.notification
ALTER
COLUMN title TYPE VARCHAR(128) USING (title::VARCHAR(128));