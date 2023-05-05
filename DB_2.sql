CREATE DATABASE todos;
USE todos;
CREATE TABLE tasks (
  task_id int PRIMARY KEY, 
  task_name varchar(255), 
  description varchar(255), 
  is_completed boolean
);