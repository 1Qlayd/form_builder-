CREATE TABLE Form(
    id INT NOT NULL,
    name VARCHAR(250) NOT NULL,
    userID INT NOT NULL,
    description VARCHAR(250) NOT NULL,
    content VARCHAR(250) NOT NULL,
    date timestamp NOT NULL,
    PRIMARY KEY(id)
);