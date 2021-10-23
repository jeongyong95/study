#   JPA의 엔티티 매핑
- JPA에서는 데이터베이스의 테이블과 객체를 `annotation`으로 연결합니다.

## 주요 에너테이션
- `@Entity`
  - 에너테이션이 명시된 클래스의 인스턴스를 엔티티로 식별합니다.
  - 일반 자바 객체와 구별하는 에너테이션입니다.
  - 해당 클래스는 `@Id`가 선언된 식별자 필드가 있어야 합니다.
  - 에너테이션의 `name` 속성을 지정하지 않으면 JPA는 클래스 이름을 엔티티 이름으로 등록합니다.
- `@Id`
  - 엔티티 객체의 식별자 필드를 지정합니다.
  - JPA에서 엔티티 객체를 등록하기 위해서 반드시 식별자 필드가 있어야 합니다.
- `@Table`
  - 엔티티 이름과 테이블 이름이 다를 경우, 해당 에너테이션으로 매핑할 테이블을 지정합니다.
  - 속성
    - `name` : 매핑할 테이블을 지정합니다.
    - `catalog` : DB 카탈로그를 지정합니다.(`MySQL`)
    - `schema` : DB 스키마를 지정합니다.(`Oracle`)
    - `uniqueConstraints`
      - 결합 unique 제약조건을 지정합니다.
      - 여러 컬럼이 결합되어 유일성을 보장해야 할 때 사용합니다.
- `@Column`
  - 엔티티 클래스의 필드와 테이블의 컬럼을 매핑합니다.
  - 에너테이션을 생략하면 변수 이름과 동일한 컬럼이 매핑됩니다.
  - 속성
    - `name` : 매핑될 컬럼을 지정합니다.
    - `unique` : unique 제약조건을 설정합니다.
    - `nullable` : null 허용 여부를 설정합니다.
    - `insertable` : INSERT 문을 생성할 때 해당 컬럼을 포함할지 설정합니다.
    - `updatable` : UPDATE 문을 생성할 때 해당 컬럼을 포함할지 설정합니다.
    - `columnDefinition` : 해당 컬럼에 대한 DDL문을 직접 작성합니다.
    - `length` : 문자열 타입의 컬럼 길이를 설정합니다.
    - `precision` : 숫자 타입의 전체 자릿수를 설정합니다.
    - `scale` :  숫타 타입의 소수점 자릿수를 설정합니다.
- `@Temporal`
  - `java.util.Date` 타입의 필드에 사용하며 날짜 데이터를 매핑합니다.
  - `TemporalType.DATE` : 날짜만 표현합니다.
  - `TemporalType.TIME` : 시간만 표현합니다.
  - `TemporalType.TIMESTAMP` : 기본 설정이며 날짜와 시간을 모두 표현합니다.
- `@Transient`
  - 해당 필드를 매핑에서 제외합니다.
- `@Access`
  - JPA가 엔티티의 필드에 접근하는 방식을 설정합니다.
  - `AccessType.FIELD` : 필드에 직접 접근합니다.
  - `AccessType.PROPERTY` : getter/setter 메서드로 접근합니다.
  - `@Id`가 필드에 설정되면 `AccessType.FIELD`가 기본값이 되고, getter에 설정되면 `AccessType.PROPERTY`가 기본값이 됩니다.

##  참고자료
- [JPA 퀵스타트](http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9791186710586&orderClick=LIZ&Kc=)