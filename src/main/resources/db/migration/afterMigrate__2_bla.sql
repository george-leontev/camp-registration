INSERT INTO business.church (id, name) OVERRIDING SYSTEM VALUE VALUES (3, 'Other');

-- Update sequence to avoid conflicts
ALTER SEQUENCE business.church_id_seq RESTART WITH 4;