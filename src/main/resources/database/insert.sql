insert into transactions(sender_acc_id, getter_acc_id, amount, add_date_time) values (1,2,100,'2018-05-27 01:00:00');
insert into transactions(sender_acc_id, getter_acc_id, amount, add_date_time) values (2,1,200,'2018-05-27 02:00:00');
insert into transactions(sender_acc_id, getter_acc_id, amount, add_date_time) values (1,2,300,'2018-05-27 03:00:00');
insert into transactions(sender_acc_id, getter_acc_id, amount, add_date_time) values (1,2,400,'2018-05-27 04:00:00');
insert into transactions(sender_acc_id, getter_acc_id, amount, add_date_time) values (2,1,500,'2018-05-27 05:00:00');

insert into clients(name, address, age) values ('Leo Messi', 'Hovorova street, 10', 29);
insert into clients(name, address, age) values ('Cristiano Ronaldo', 'Bazarna street, 12', 28);
insert into clients(name, address, age) values ('Antuan Hrismann', 'Henuezskka street, 16', 26);

insert into accounts(client_id,cash_sum) values (1,100);
insert into accounts(client_id,cash_sum) values (1,2000);
insert into accounts(client_id,cash_sum) values (2,30000);
insert into accounts(client_id,cash_sum) values (3,400000);
insert into accounts(client_id,cash_sum) values (3,5000000);

commit;
