INSERT INTO users (username,password,enabled)
values ('ahmed','pass',true);

INSERT INTO users(username,password,enabled)
values ('mido','pass',true);


INSERT INTO authorities(username,authority)
values ('ahmed','ROLE_USER');

INSERT INTO authorities(username,authority)
values ('mido','ROLE_ADMIN');