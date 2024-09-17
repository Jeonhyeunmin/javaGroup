CREATE TABLE hoewon (
	mid 			varchar(15) not null,  																			/*	아이디	*/
	pwd 			varchar(15) not null,																			/*	비밀번호	*/
	name 			varchar(20) not null,																			/*	이름	*/
	age 			int			default 20,																			/*	나이	*/
	sex				varchar(2)	default '남자',																		/*	성별	*/
	ipsail			datetime	default now(),																		/*	입사일	*/
    address			varchar(50)																						/*	주소	*/
);

desc hoewon;

drop table hoewon;

ALTER TABLE hoewon rename sinsang;

select * from sinsang;

desc sinsang;

drop column soge;

desc sinsang;

desc sinsang;

insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('hong','1234','홍길동',25,'남자','1990-10-05','서울');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('kim','1234','김말숙',33,'여자','1997-12-3','부산');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('lee','1234','이순자',24,'여자','1985-7-25','광주');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('lee1','1234','이기자',40,'남자','1999-10-3','울산');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('park','1234','박찬호',32,'남자','1980-6-08','대전');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('bae','1234','배은숙',19,'여자','1993-11-22','마산');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('son','1234','손기정',45,'남자','1987-12-15','제주');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('kim1','1234','김영숙',36,'여자','2002-10-5','부천');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('kim2','1234','김영철',39,'남자','1988-10-05','인천');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('lee2','1234','이겨라',29,'남자','2000-10-09','서울');
insert into sinsang (mid, pwd, name, age, gender, ipsail, address) values ('son2','1234','손오공',23,'남자','2005-12-15','서울');

select * from sinsang;

delete from sinsang;

select * from sinsang where mid = 'kim';

select * from sinsang where gender = '남자';

select * from sinsang where address = '서울';

select * from sinsang where address in('서울', '인천');

select * from sinsang where address = '서울' and gender = '남자';

desc sinsang;

select * from sinsang;

update sinsang set point = point + 100 where gender = '여자';


select * from sinsang;

update sinsang set point = point + 50
where gender = '남자' and age >= 35;

select * from sinsang;

update sinsang set address = '서울'
where mid = 'kim1';

select mid, age, address from sinsang;

select mid as '아이디', gender as '성별' , ipsail as '입사일' from sinsang
where 1=1
and ipsail >= '2000-01-01';

insert into sinsang values ('park','1234','박세리',35,'여자',default,'인천',NULL,default);

select mid, gender, address from sinsang
where age between 30 and 39
and gender = '여자';

select * from sinsang where age between 30 and 39;
select * from sinsang where age >= 30 and age < 40;

select name, age, gender, address from sinsang where address = '서울' or address = '부산';
select name, age, gender, address from sinsang where address in ('서울', '부산');

select * from sinsang order by age desc, name, idx;

insert into sinsang (name, mid, pwd) values ('홍길공자','hkgj',1234);

select * from sinsang where name like '홍%';

select * from sinsang where name like '%자';

select * from sinsang where name like '%공%';

select mid as '아이디', name as '이름', gender as '성별' from sinsang
where 1=1
and name like '_기%';

select * from sinsang where name like '%기_';

select mid, name, gender from sinsang order by idx limit 5;

select mid as '아이디', gender as '성별' , ipsail as '입사일' from sinsang
order by idx limit 5;

select mid as '아이디', gender as '성별' , ipsail as '입사일' from sinsang
order by gender desc,
name,
idx limit 5;

select * from sinsang order by age desc limit 5;