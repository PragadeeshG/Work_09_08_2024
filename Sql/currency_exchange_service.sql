create table if not exists currency_exchange_service(
local_currency_code Integer not null,
exchange_rate_effective Integer null,
exchange_rate_effective_date varchar(255) null,
exchange_rate_local_currency_desc varchar(255) null,
exchange_rate_local_currency_short_desc varchar(255) null,
exchange_rate_decimal_positions Integer null,
exchange_rate_local_currency_symbol varchar(255) null,
exchange_rate_local_currency_scale varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint currency_exchange_service_pk primary key(local_currency_code));