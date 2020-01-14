create table user(
                    id serial,
                    student_numner varchar(45),
                    password varchar(45),
                    primary key(stdent_number)

);
CREATE TABLE modules(
                        id serial,
                        module_name character varying (120) Not null ,
                        module_code character varying(120) Not null ,
                        timestamp timestamp with time zone not null default clock_timestamp(),
                        primary key (id)
);

create table student(
                        id serial primary key ,
                        name varchar (255),
                        surname varchar (255),
                        student_number varchar (10),
                        id_number varchar (255),
                        current_year date

);

create table documents(
                          id serial primary key ,
                          document_name varchar (255),
                          document_type varchar (255),
                          attached_documents bytea
);

create table users(
                     student_number varchar(10) primary key,
                     password varchar(45)

);

create table user_roles(
                    student_number varchar(10) NO NULL primary key ,
                    role varchar (255) NOT null
)


