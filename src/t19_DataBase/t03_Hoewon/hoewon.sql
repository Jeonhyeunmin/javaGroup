show tables;

CREATE TABLE hoewon (
	idx 			int 				not null auto_increment primary key, 							/*	고유번호	*/
	name 			varchar(30) not null,																					/*	이름	*/
	age 			int 				default 20,																				/*	나이	*/
	gender 		char(2)			default '여자',																		/*	성별	*/
	joinday		datetime		default now(),																		/*	생년월일 (yyyy-MM-dd)	*/
	address		varchar(20)																										/*	주소	*/
);


desc hoewon;
--	drop table hoewon;
--	delete from hoewon;

select * from hoewon;

insert into hoewon (name, age, gender, address) values ('홍길동', 23, '남성', '서울');					--	레코드 삽입
insert into hoewon values (default, '김말숙', 30, '여성', default, '청주');					--	레코드 삽입
insert into hoewon values (default, '오하늘', default, default, default,  '');					--	레코드 삽입
insert into hoewon (name) values ('이랑사');					--	레코드 삽입
insert into hoewon values (default,'가나다', 30, '여성', '2000-01-05', '청주');					--	레코드 삽입
insert into hoewon values (default,'아톰', 35, '남성', '1999-10-25', '제주');					--	레코드 삽입
insert into hoewon values (default,'강감찬', 42, '남성', '2005-05-07', '인천');					--	레코드 삽입
insert into hoewon values (default,'이사랑', 21, '여성', '2020-05-02', '서울');					--	레코드 삽입
insert into hoewon values (default,'강소연', 19, '여성', default, '청주');					--	레코드 삽입
insert into hoewon values (default,'고릴라', 38, '여성', '2022-02-01', '제주');					--	레코드 삽입
insert into hoewon values (default,'김감자', 41, '남성', default, '서울');					--	레코드 삽입
insert into hoewon values (default,'이자바', 30, '여성', '2023-06-08', '청주');					--	레코드 삽입
insert into hoewon values (default,'김자월', 30, '여성', '2012-05-08', '제주');					--	레코드 삽입
insert into hoewon values (default,'오자월', 22, '여성', '2004-04-04', '제주');					--	레코드 삽입
insert into hoewon values (default,'오이자월', 22, '여성', '2021-06-30', '제주');				--	레코드 삽입
insert into hoewon values (default,'김자월화', 36, '여성', default, '청주');				--	레코드 삽입