-- SELECT, INSERT, DELETE, UPDATE
USE practice;

-- MEMBER 테이블에 있는 모든 컬럼 조회
SELECT* FROM MEMBER;

-- MEMBER 테이블에 있는 특정 컬럼(ID, NAME)만 조회
SELECT ID, NAME FROM MEMBER;

-- MEMBER 테이블에 데이터 1개 추가
INSERT INTO MEMBER(ID, PASSWORD, NAME, PHONE, EMAIL, AGE, ADDR)
		VALUES('aa1234', '1234', '이름1', '010', 'aa@gmail.com', 10, '서울');
        
-- MEMBER 테이블에 데이터 2개 추가
INSERT INTO MEMBER(ID, PASSWORD, NAME, ADDR)
		VALUES('bb5678', '5678', '이름2', '부산'),
			  ('cc1234', '1234', '이름3', '울산');

--  MEMBER 테이블에 모든 비밀번호 변경하기
UPDATE MEMBER
SET password = '0000'
;              

-- MEMBER 테이블에 ID가 'aa1234'인 비밀번호 변경하기
UPDATE MEMBER
SET PASSWORD = '1234'
WHERE ID = 'aa1234'
;

-- MEMBER 테이블에 ID가 'cc1234'인 데이터 삭제하기
DELETE FROM MEMBER
WHERE ID = 'cc1234'
;

