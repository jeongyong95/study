#   RESTful API

##  소개
- REST란 `Representational State Transfer`의 약자로 2000년에 Roy Fielding의 박사학위 논문에서 최초로 등장했습니다.
- 로이 필딩은 HTTP의 주요 저자 중 한 사람으로서 웹의 장점을 최대한 활용할 수 있는 아키텍처로써 REST를 발표했습니다.


##  구성
- REST API는 아래의 요소로 이뤄져 있습니다.
  - `자원(Resource)` : URI
  - `행위(Verb)` : HTTP Method
  - `표현(Representations)`


##  특징
- `Uniform Interface`
  - URI로 지정한 자원에 대한 조작 방법을 통일하고 한정적인 인터페이스로 수행하는 아키텍쳐 스타일입니다.
- `Stateless`
  - 작업을 위한 상태정보를 저장하고 관리하지 않습니다.
  - 세션/쿠키를 관리하지 않기 때문에 API 서버는 단순히 요청에 응답하면 됩니다.
  - 서비스 자유도가 높아지고, 구현이 단순해집니다.
- `Cacheable`
  - HTTP 표준을 사용하기에 웹의 기존 인프라를 그대로 활용할 수 있습니다.
  - HTTP의 `Last-Modified`나 `ETag`를 이용하여 캐싱을 구현할 수 있습니다.
- `Self-Descriptiveness`
  - REST API 메시지만 보고 내용을 쉽게 이해할 수 있습니다.
- `Client-Server Architecture`
  - REST 서버는 API 제공, 클라이언트는 사용자 인증, 컨텍스트 등을 직접 관리합니다.
  - 각각의 역할이 명확하게 구분되기 때문에 의존성이 줄어듭니다.
- `Layered Architecture`
  - REST 서버는 다중 계층으로 구성될 수 있습니다.
  - 보안, 로드 밸런싱, 암호화 계층을 추가해서 유연한 구조를 가질 수 있습니다.
  - 프록시, 게이트웨이와 같은 네트워크 기반 중간 매체를 사용할 수 있습니다.


##  설계 가이드
### 핵심 규칙
- URI는 자원(Resource)을 표현해야 합니다.
   - 자원의 이름은 동사형보다는 `명사형`으로 표현
- 자원에 대한 행위는 `HTTP Method`로 표현해야 합니다.

### URI 설계 주의사항
- 슬래시(`/`)는 계층 관계를 나타내는 데 사용합니다.
- URI 마지막 문자에 슬래시(`/`)는 표함하지 않습니다.
- 하이픈(`-`)은 URI 가독성을 높이는 데 사용합니다.
- 밑줄(`_`)은 URI에 사용하지 않습니다.
- URI 경로에 되도록 `소문자`만 사용합니다.
  - RFC 3986(URI 문법 형식)은 URI 스키마와 호스트 외에 대소문자를 구별합니다.
- 파일 확장자는 URI에 표현하지 않습니다.

### 자원(Resource) 간 관계 표현
- 소유(`has`) 관계 표현
  - `/자원이름/자원ID/관계있는 다른 자원이름`
- 관계 이름이 복잡하면 서브 리소스에 명시적으로 표현
  - ex) 사용자가 좋아하는 디바이스 : `/users/{id}/likes/devices`

### URI의 Collection과 Document
- `Document` : 문서, 객체
- `Collection` : Document의 집합, URI에서 복수형으로 표현합니다.
- ex) `/sports/soccer`
  - sports -> Collection
  - soccer -> Document

## 참고자료
- [NHN Cloud Meetup! REST API 제대로 알고 사용하기](https://meetup.toast.com/posts/92)