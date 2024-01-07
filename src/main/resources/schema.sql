CREATE table if NOT EXISTS photos(
    id bigint auto_increment primary key,
    file_name varchar(255),
    content_type varchar(255),
    data VARBINARY(MAX)
);