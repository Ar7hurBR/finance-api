CREATE TABLE categories (
	id		BIGSERIAL PRIMARY KEY,
	user_id		BIGINT NOT NULL REFERENCES users (id) ON DELETE CASCADE,
	name		VARCHAR(80) NOT NULL,
	type		VARCHAR(10) NOT NULL CHECK (type IN ('INCOME', 'EXPENSE')),
	CONSTRAINT uk_categories_user_name UNIQUE (user_id, name)
);