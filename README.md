# Take home assignment

## Problem Statement
We have a service that currently returns a list of students when called

This endpoint is at `https://localhost:8080/students/all`

We also have a html page that renders this list in public/index.html

We want to now go ahead and render a distinct list of majors based on whats in the students table

*  Create a new endpoint that returns a list of distinct majors
 * Create a new html page that renders this list

Schema
```sql
create table students
(
    id uuid not null,
    name varchar(255) not null,
    major varchar(255) not null,
    primary key(id)
);
```

