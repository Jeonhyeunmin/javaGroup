show tables;


--	테이블 생성하기
create table test(		
	idx		int not null auto_increment primary key,	/* 고유번호 */
	name	varchar(30) not null, 										/* 성명 */
	age		int				default 20,											/* 나이 */
	gender char(2) default '여성',										/* 성별 */
	address varchar(10)															/* 주소 */
);

desc test;												/*	생성된 테이블의 구조 보기		*/

drop table test;									--	테이블 삭제
delete from test /*	test 테이블의 모든 레코드를 삭제 */

--DML
insert into test (name, age, gender, address) values ('홍길동', 23, '남성', '서울');					--	레코드 삽입
insert into test values (default, '김말숙', 30, '여성', '청주');					--	레코드 삽입
insert into test values (default, '오하늘', default, default, '');					--	레코드 삽입
insert into test values (default, '오하늘', default, default, '');					--	레코드 삽입
insert into test (name) values ('이사랑');					--	레코드 삽입
insert into test values (default,'가나다', 30, '남성', '청주');					--	레코드 삽입
insert into test values (default,'아톰', 35, '남성', '제주');					--	레코드 삽입
insert into test values (default,'강감찬', 42, '남성', '인천');					--	레코드 삽입
insert into test values (default,'이사랑', 21, '여성', '서울');					--	레코드 삽입
insert into test values (default,'강소연', 19, '여성', '청주');					--	레코드 삽입
insert into test values (default,'고릴라', 38, '여성', '제주');					--	레코드 삽입
insert into test values (default,'김감자', 41, '남성', '서울');					--	레코드 삽입
insert into test values (default,'이자바', 30, '여성', '청주');					--	레코드 삽입
insert into test values (default,'김자월', 30, '여성', '제주');					--	레코드 삽입
insert into test values (default,'오자월', 22, '여성', '제주');					--	레코드 삽입
insert into test values (default,'오이자월', 22, '여성', '제주');				--	레코드 삽입
insert into test values (default,'김자월화', 36, '여성', '청주');				--	레코드 삽입

update test set age = 35 where name = '김말숙';
update test set address = '제주' where name = '김말숙';

select * from test;							/*	테이블 내용 확인하기	*/

-- 서울에 사는 사람들 조회
select * from test where address = '서울';

-- 남자만 출력
select * from test where gender = '남성';

-- 나이가 35세 이상만 출력
select * from test where age >= 35;

-- 남자이면서 서울에 사는 사람
select * from test where gender = '남성' and address = '서울';

-- 25세 이상인 여성
select * from test where gender = '여성' and age >= 25;

-- 서울에 살거나 청주에 거주하는 사람
select * from test where address = '청주' or address = '서울';

-- 여자중에서 서울에 살거나 청주에 거주하는 사람
select * from test where gender = '여성' and (address = '청주' or address = '서울');

-- 여자 20대 중에서 서울에 살거나 청주에 거주하는 사람
select * from test where gender = '여성' and (age >= 20 and age < 30) and (address = '청주' or address = '서울');

-- 30대를 출력하세요
select * from test where age >= 30 and age < 40;
select * from test where age between 30 and 39;

-- 서울 / 청주에 사는 사람
select * from test where address = '서울' or address = '청주';
select * from test where address in ('서울', '청주');
-- select * from test where address in ('서', '주');

--성이 '김'씨만 출력하세요
select * from test where name like '김%';

-- 이름중에서 자로 끝나는 사람만 출력하세요
select * from test where name like '%자';

-- 이름중에서 '자'를 포함하는 사람들 모두 출력하세요
select * from test where name like '%자%';

-- 서울이나 제주에 사는 사람의 나이를 1살씩 증가시켜주세요
update test set age = age + 1 where address in ('서울', '청주');

-- 모든 사람들의 나이를 1살씩 감소시켜주시오
update test set age = age -1;

-- 청주에 사는 남자들을 삭제처리하시오.
delete from test where address = '청주' and gender = '남성';

-- 이름중에서 두번째 글자가 '자'인 사람들 출력
select * from test where name like '_자%';

-- 서울에 사는 사람들의 성명/나이/성별만 출력하시오
select name, age, gender from test where address = '서울';

-- 이름 순으로 오름차순 출력하세요.
select * from test order by name;
select * from test order by name desc;

-- 나이 내림차순으로 출려하되 나이가 같으면 이름 오름차순으로 출력하세요
select * from test order by age desc, name;

update test set age = 29 where name = '오이자월';