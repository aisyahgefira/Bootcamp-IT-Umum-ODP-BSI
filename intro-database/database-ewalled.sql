-- Membuat Tabel User
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    nama VARCHAR NOT NULL,
    username VARCHAR UNIQUE NOT NULL,
    email VARCHAR UNIQUE NOT NULL,
    password VARCHAR NOT NULL,
    avatar VARCHAR,
    phone_no VARCHAR NOT NULL
);

INSERT INTO users (id, nama, username, email, password, avatar, phone_no)
VALUES
    ('Aisyah', 'aisyaa', 'aisyah@gmail.com', 'Aisyah123#', '', '62812345678901'),
    ('Gefira', 'gefira', 'gefira@gmail.com', 'Gefira123#', '', '62823456789012');

SELECT * FROM users;

-- Membuat Tabel transactions
CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    datetime TIMESTAMP NOT NULL,
    type_transaction VARCHAR NOT NULL,
    no_transaction VARCHAR 	UNIQUE NOT NULL,
    sender_id INTEGER NOT NULL,
    recipient_id INTEGER NOT NULL,
    description VARCHAR NOT NULL,
    category VARCHAR NOT NULL,
    status VARCHAR NOT NULL,
    amount NUMERIC(15,2) NOT NULL,
	FOREIGN KEY (sender_id) REFERENCES users(id),
    FOREIGN KEY (recipient_id) REFERENCES users(id)
);

INSERT INTO transactions (datetime, type_transaction, no_transaction, sender_id, recipient_id, description, category, status, amount)
VALUES
    ('2022-06-30 20:10:00', 'Transfer', '1', 1, 2, 'Fore Coffee', 'Credit', 'Success', '75.000,00'),
    ('2022-06-30 20:10:00', 'Topup', '2', 2, 1, 'Topup from Bank Transfer', 'Debit', 'Success', '1.000.000,00'),
    ('2022-06-30 20:10:00', 'Transfer', '3', 1, 2, 'Fore Coffee', 'Credit', 'Success', '75.000,00'),
    ('2022-06-30 20:10:00', 'Topup', '4', 2, 1, 'Topup from Bank Transfer', 'Debit', 'Success', '1.000.000,00'),
    ('2022-06-30 20:10:00', 'Transfer', '5', 1, 2, 'Beli barang', 'Credit', 'Success', '75.000,00'),
    ('2022-06-30 20:10:00', 'Transfer', '6', 2, 1, 'Transfer', 'Debit', 'Success', '1.000.000,00'),
    ('2022-06-30 20:10:00', 'Transfer', '7', 1, 2, 'Fore Coffee', 'Credit', 'Success', '75.000,00'),
    ('2022-06-30 20:10:00', 'Topup', '8', 2, 1, 'Topup from Bank Transfer', 'Debit', 'Success', '1.000.000,00'),
    ('2022-06-30 20:10:00', 'Transfer', '9', 1, 2, 'Fore Coffee', 'Credit', 'Success', '75.000,00'),
    ('2022-06-30 20:10:00', 'Topup', '10', 2, 1, 'Topup from Bank Transfer', 'Debit', 'Success', '1.000.000,00');

SELECT * FROM transactions;

-- Menampilkan tabel sesuai yang diinginkan

SELECT 
    TO_CHAR(t.datetime, 'HH24:MI - DD FMMonth YYYY') AS "Date & Time",
    t.type_transaction AS "Type",
    CASE 
        WHEN t.type_transaction = 'Topup' THEN '' 
        ELSE u.nama 
    END AS "From / To",
    t.description AS "Description",
    CASE 
        WHEN t.category = 'Credit' THEN 
            '+ ' || TO_CHAR(
                REPLACE(REPLACE(TRIM(t.amount), '.', ''), ',', '.')::NUMERIC, 
                'FM999G999G999G990D00'
            )
        ELSE 
            '- ' || TO_CHAR(
                REPLACE(REPLACE(TRIM(t.amount), '.', ''), ',', '.')::NUMERIC, 
                'FM999G999G999G990D00'
            )
    END AS "Amount"
FROM transactions t
LEFT JOIN users u ON t.sender_id = u.id
ORDER BY t.datetime ASC, t.id ASC;

/* Jika ingin save menjadi tabel baru
CREATE TABLE transactions_formatted AS
SELECT 
    TO_CHAR(t.datetime, 'HH24:MI - DD FMMonth YYYY') AS "Date & Time",
    t.type_transaction AS "Type",
    CASE 
        WHEN t.type_transaction = 'Topup' THEN '' 
        ELSE u.nama 
    END AS "From / To",
    t.description AS "Description",
    CASE 
        WHEN t.category = 'Credit' THEN 
            '+ ' || TO_CHAR(
                REPLACE(REPLACE(TRIM(t.amount), '.', ''), ',', '.')::NUMERIC, 
                'FM999G999G999G990D00'
            )
        ELSE 
            '- ' || TO_CHAR(
                REPLACE(REPLACE(TRIM(t.amount), '.', ''), ',', '.')::NUMERIC, 
                'FM999G999G999G990D00'
            )
    END AS "Amount"
FROM transactions t
LEFT JOIN users u ON t.sender_id = u.id
ORDER BY t.datetime ASC, t.id ASC;

SELECT * FROM transactions_formatted;*/