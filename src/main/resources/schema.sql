CREATE TABLE Form(
    id INT NOT NULL,
    name VARCHAR(250) NOT NULL,
    userID INT NOT NULL,
    description VARCHAR(250) NOT NULL,
    content VARCHAR(250) NOT NULL,
    date timestamp NOT NULL,
    PRIMARY KEY(id)
);
CREATE TABLE Users(
    id INT PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    hash_password VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE,
    idRole INT NOT NULL
);