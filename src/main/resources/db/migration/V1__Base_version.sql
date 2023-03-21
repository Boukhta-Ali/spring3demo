CREATE SEQUENCE USERS_ID_seq;

CREATE TABLE users (
    id_user bigint NOT NULL DEFAULT nextval('USERS_ID_seq'::regclass),
    CONSTRAINT USER_pkey PRIMARY KEY (ID_USER)
);