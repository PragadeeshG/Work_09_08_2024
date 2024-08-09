create table if not exists currency_exchange_service_maker_checkers(
local_currency_code Integer not null,
transaction_fee Integer null,
sequence_id Integer null,
buy_sell_value varchar(255) null,
group_name varchar(255) null,
maker_checker_type_code Integer null,
maker_checker_type varchar(255) null,
maker_checker_type_desc varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint currency_exchange_service_maker_checkers_pk primary key(local_currency_code));