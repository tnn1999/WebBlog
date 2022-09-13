use newsservlet; 

create table role(
	id bigint NOT null primary key auto_increment,
    name varchar(255) not null,
    code varchar(255) not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

create table user(
	id bigint NOT null primary key auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    fullname varchar(255) null,
    status int not null,
    roleid bigint not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

alter table user add constraint  fk_user_role foreign key (roleid) references role(id);

create table news(
	id bigint NOT null primary key auto_increment,
    title varchar(255) null,
    thumbnail varchar(255) null,
    shortdescription text null,
    content text null,
    status int not null,
    author bigint not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

alter table news add constraint  fk_news_user foreign key (author) references user(id);

