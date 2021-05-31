#   HTTP 메시지
##  개요
- HTTP 메시지는 HTTP 애플리케이션 간 주고받는 데이터, 블록입니다.
- HTTP 메시지는 클라이언트, 서버, 프록시 사이를 흐릅니다.
- 메시지 방향
  - 인바운드 : 트랜잭션 방향. 메시지가 서버로 향하는 것
  - 아웃바운드 : 트랜잭션 방향. 메시지가 서버에서 처리되고 사용자 에이전트로 돌아오는 것
  - 모든 메시지는 다운스트림으로 흐름.
    - 절대 업스트림으로 흐르지 않음.

##  메시지 구조
- 시작줄(메시지 형태), 헤더(메시지의 속성), 엔티티 본문(데이터)
- 엔티티는 텍스트, Binary를 가지고 있거나 비어있을 수 있습니다.


##  메시지 문법
- Request(요청)
  - 시작줄 : `메서드` `요청 URL` `버전`
  - `헤더`
  - `엔티티 본문`
- Response(응답)
  - 시작줄 : `버전` `상태 코드` `사유 구절`
  - `헤더`
  - `엔티티 본문`

### 메서드
- `GET`
  - 서버에서 리소스를 가져옴
- `HEAD`
  - 서버에서 리소스의 헤더만 가져옴
- `PUT`
  - 서버에 Request의 본문 저장
- `POST`
  - 서버가 처리해야 할 데이터 전송
- `TRACE`
  - 메시지가 프록시를 거쳐 서버로 가는 과정 추적
- `OPTIONS`
  - 서버가 어떤 메서드를 수행할 수 있는지 확인
- `DELETE`
  - 서버에서 리소스를 제거

### 상태 코드
- 100~199 : 정보성 상태 코드
- 200~299 : 성공 상태 코드
  - `200 OK`
    - 요청은 정상, 엔티티 본문은 요청된 리소스를 포함하고 있음
  - `201 Created`
    - PUT과 같은 개체 생성 요청을 위함, 생성된 리소스에 대한 정보 전송
  - `202 Accepted`
    - 요청은 받아졌지만, 서버는 아직 아무런 행동도 하지 않음
  - `203 Non-Authoritative Information`
    - 엔티티 헤더의 정보가 리소스 사본에서 옴
  - `204 No Content`
    - Response는 엔티티 본문을 포함하지 않음
  - `205 Reset Content`
    - 브라우저에게 현재 페이지에 있는 HTML 폼에 채워진 값을 초기화하라고 함
  - `206 Partial Content`
    - 부분/범위 요청이 성공했음
- 300~399 : 리다이렉션 상태 코드
  - 클라이언트가 관심있는 리소스에 대해 다른 위치를 제공하거나, 대안 응답을 제공함
  - `300 Multiple Choices`
  - `301 Moved Permanently`
  - `302 Found`
  - `303 See Other`
  - `304 Not Modified`
  - `305 Use Proxy`
  - `307 Temporary Redirect`
- 400~499 : 클라이언트 에러 상태 코드
  - `400 Bad Request`
  - `401 Unauthorized`
  - `402 Payment Required`
  - `403 Fobidden`
  - `404 Not Found`
  - `405 Method Not Allowed`
  - `406 Not Acceptable`
  - `407 Proxy Authentication Required`
  - `408 Request Timeout`
  - `409 Conflict`
  - `410 Gone`
  - `411 Length Required`
  - `412 Precondition Failed`
  - `413 Request Entity Too Large`
  - `414 Request URI Too Long`
  - `415 Unsupported Media Type`
  - `416 Request Range Not Satisfiable`
  - `417 Expectation Failed`
- 500~599 : 서버 에러 상태 코드
  - `500 Internal Server Error`
  - `501 Not Implemented`
  - `502 Bad Gateway`
  - `503 Service Unavailable`
  - `504 Gateway Timeout`
  - `505 HTTP Version Not Supported`