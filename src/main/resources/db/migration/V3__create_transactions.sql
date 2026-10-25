CREATE TABLE transactions (
	id			BIGSERIAL PRIMARY KEY,
	user_id			BIGINT NOT NULL REFERENCES users (id) ON DELETE CASCADE,
	category_id		BIGINT NOT NULL REFERENCES categories (id) ON DELETE RESTRICT,
	type			VARCHAR(10) NOT NULL CHECK (type IN('INCOME', 'EXPENSE')),
	amount			NUMERIC(12) NOT NULL CHECK (amount > 0),
	transaction_date	DATE NOT NULL,
	description		VARCHAR(255),
	created_at		TIMESTAMPTZ NOT NULL DEFAULT now()
);