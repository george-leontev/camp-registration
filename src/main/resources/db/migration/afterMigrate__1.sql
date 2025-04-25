INSERT INTO business.church (id, name) OVERRIDING SYSTEM VALUE VALUES (1, 'New Life');
INSERT INTO business.church (id, name) OVERRIDING SYSTEM VALUE VALUES (2, 'Word Of Truth');

-- Update sequence to avoid conflicts
ALTER SEQUENCE business.church_id_seq RESTART WITH 3;