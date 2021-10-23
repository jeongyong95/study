#   관계형 데이터베이스

## 소개

##  RDB의 키
- 기본키
- 대체키
- 외래키
- 슈퍼키

## 데이터 언어
- 데이터 정의어(Data Definition Language)
  - 테이블의 생성, 변경, 제거
- 데이터 조작어(Data Manipulation Language)
  - 테이블에서 데이터의 조회, 입력, 수정, 삭제
- 데이터 제어어(Data Control Language)
  - 데이터에 대한 접근, 사용 권한을 제어

##  SQL
- RDB를 위한 표준 질의어입니다.
- 원하는 데이터가 무엇인지만 제시하는 비절차적 언어입니다.


### 데이터 정의

####    CREATE TABLE

~~~SQL
CREATE TABLE 테이블_이름 (
    속성_이름 데이터_타입 [NOT NULL] [DEFAULT 기본_값]
    ...
    [PRIMARY KEY (속성1, 속성2, ...)]
    [UNIQUE (속성1, 속성2, ...)]
    [FOREIGN KEY (속성1, 속성2, ...) REFERENCES 테이블_이름(속성1, 속성2, ...)] [ON DELETE 옵션] [ON UPDATE 옵션]
    ...
    [CONSTRAINT 이름] [CHECK(조건)]
    ...
);
~~~

####    ALTER TABLE

- 새로운 속성 추가
~~~SQL
ALTER TABLE 테이블_이름 ADD 속성_이름 데이터_타입 [NOT NULL] [DEFAULT 기본_값];
~~~

- 기존 속성 삭제
~~~SQL
ALTER TABLE 테이블_이름 DROP COLUMN 속성_이름;
~~~

- 새로운 제약조건 추가
~~~SQL
ALTER TABLE 테이블_이름 ADD CONSTRAINT 제약조건_이름 제약조건_내용;
~~~

- 기존 제약조건 삭제
~~~SQL
ALTER TABLE 테이블_이름 DROP CONSTRAINT 제약조건_이름;
~~~

####    DROP TABLE
- 테이블 삭제
~~~SQL
DROP TABLE 테이블_이름;
~~~

####    CREATE VIEW

####    DROP VIEW


### 데이터 조작


####    SELECT
- 기본 검색
~~~SQL
SELECT [ALL || DISTINCT] 속성_리스트 FROM 테이블_리스트;
~~~
  - SELECT 뒤에 속성에 산술연산을 수행할 수 있습니다. (`+, -, *, /`)

- 조건 검색
~~~SQL
SELECT [ALL || DISTINCT] 속성_리스트
FROM 테이블_리스트
WHERE 속성 비교연산자 값;
~~~
  - 비교 연산자 (`=, <>, <, >, <=, >=`)
  - 논리 연산자 (`AND, OR, NOT`)

- LIKE 검색
~~~SQL
SELECT [ALL || DISTINCT] 속성_리스트
FROM 테이블_리스트
WHERE 속성 LIKE 부분값;
~~~
  - _ : 1개의 문자
  - % : 0개 이상의 문자

- NULL 검색
~~~SQL
SELECT [ALL || DISTINCT] 속성_리스트
FROM 테이블_리스트
WHERE 속성 IS [NOT] NULL;
~~~

- 정렬 검색
~~~SQL
SELECT [ALL || DISTINCT] 속성_리스트
FROM 테이블_리스트
[WHERE 조건]
[ORDER BY 속성_리스트 [ASC || DESC]];
~~~

- 집계 함수를 활용한 검색
  - 모든 데이터
    - `COUNT` : 속성 값의 개수
    - `MAX` : 속성 값의 최댓값
    - `MIN` : 속성 값의 최솟값
  - 숫자 데이터만
    - `SUM` : 속성 값의 합계
    - `AVG` : 속성 값의 평균
  - 집계 함수는 NULL 속성을 제외하고 계산합니다.
  - 집계 함수는 SELECT 절이나 HAVING 절에서만 사용 가능합니다.
  - 집계 함수는 WHERE 절에서는 사용 불가능합니다.

- 그룹별 검색
~~~SQL
SELECT [ALL || DISTINCT] 속성_리스트
FROM 테이블_리스트
[WHERE 조건]
[GROUP BY 속성_리스트 [HAVING 조건]]
[ORDER BY 속성_리스트 [ASC || DESC]];
~~~

- 부속 질의문
  - SELECT 문 안에 있는 SELECT문입니다.
  - `()`로 묶어서 사용합니다.
  - `ORDER BY` 절을 사용할 수 없습니다.
  - 단일 행이 반환되는 부속 질의문 연산
    - 비교 연산자
  - 다중 행이 반환되는 부속 질의문 연산
    - `IN`, `NOT IN`, `EXISTS`, `NOT EXISTS`, `ALL`, `ANY` 또는 `SOME`


####    INSERT
- 데이터 삽입
~~~SQL
INSERT
INTO 테이블_이름[(속성_리스트)]
VALUES (속성값_리스트);
~~~

- 부속 질의문을 이용한 데이터 삽입
~~~SQL
INSERT
INTO 테이블_이름[(속성_리스트)]
SELECT 문;
~~~

####    UPDATE
- 데이터 수정
~~~SQL
UPDATE 테이블_이름
SET 속성1 = 값1, 속성2 = 값2 ...
[WHERE 조건];
~~~

####    DELETE
- 데이터 삭제
~~~SQL
DELETE
FROM 테이블_이름
[WHERE 조건];
~~~