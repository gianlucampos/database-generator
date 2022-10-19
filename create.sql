create sequence seqstock start with 1 increment by 1;
create sequence seqtransaction start with 1 increment by 1;

    create table stock (
       id bigint not null,
        currency varchar(255),
        current_value decimal(19,2),
        stock_name varchar(255),
        primary key (id)
    );

    create table transaction (
       id bigint not null,
        amount_value decimal(19,2),
        dt_submitted varchar(255),
        trasaction_type varchar(255),
        stock_id bigint,
        primary key (id)
    );

    alter table transaction 
       add constraint FKlhqnenc4bwsw1v2vit8ohoffj 
       foreign key (stock_id) 
       references stock;
