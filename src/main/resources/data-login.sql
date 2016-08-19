insert into users
(username, password, enabled)
values
('danilo', 'pass', true);

insert into users
(username, password, enabled)
values
('fulano', '111', true);

insert into authorities
(username, authority)
values
('fulano', 'ROLE_USER');

insert into authorities
(username, authority)
values
('danilo', 'ROLE_ADMIN');

insert into authorities
(username, authority)
values
('danilo', 'ROLE_USER');
