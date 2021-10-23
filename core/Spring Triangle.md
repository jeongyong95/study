#   Spring Triangle
- `Dependency Injection`
- `Inversion of Control`
- `Portable Service Abstraction`

## Dependency Injection
---
###  소개
- 의존성은 쉽게 이야기하면 `new`입니다.
- DI는 `new`를 사용하여 어떤 컴포넌트에 의존성을 주입하는 것입니다.

###  DI 방법
- 의존성은 크게 2가지 방법으로 주입할 수 있습니다.

####  Constructor Injection
- 컴포넌트를 생성할 때 컨테이너에 있는 의존성을 주입합니다.
- DI 시점을 파악할 수 있습니다.
  - 권장되는 DI 방법입니다.

####  Setter Injection
- 생성된 컴포넌트에 임의의 시점에 의존성을 주입합니다.
- DI 시점을 파악하기 어렵습니다.

###  @Autowired와 @Resource
- Autowired
  - 스프링 프레임워크 에너테이션
  - Type, Name 순서대로 Bean 검색
  - @Qualifier와 협업
  - Name 설정 : @Autowired@Qualifier("이름")
- Resource
  - 자바 표준 에너테이션
  - Name, Type 순서대로 Bean 검색
  - attribute로 name이 있음
  - Name 설정 : @Resource(name="이름")


##   Inversion of Control
---
###  소개
- 컴포넌트의 호출이 외부에서 결정되는 원리입니다.
- 개발자가 호출하지 않고, 컨테이너가 필요한 상황에서 알맞게 호출합니다.


## Portable Service Abstraction
---
###  소개
- 서비스 추상화(Service Abstraction)이란 어떤 것을 내부적으로 숨기고 그 위에 있는 추상화 계층으로 서비스를 제공해주는 것입니다.
- 스프링에서 서블릿이 드러나지 않고, 컨트롤러가 서블릿 애플리케이션이 작동하도록 하는 것도 서비스 추상화입니다.
- 여기에서 Portable을 더하면, 서비스 추상화로 제공되는 기능을 다른 컴포넌트를 통해서 바꿀 수 있는 확장성이 추가됩니다.
- PSA란 유연한 확장성이 가능한 서비스 추상화입니다.
- ex)JDBC, JPA 등