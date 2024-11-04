# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 문자열 계산기

### TODO
- [x] 입력 받은 문자열을 빈 공백으로 나눈다.
- [x] 피연산자 + 연산자 + 피연산자 순서대로 반복해서 계산한다.
- [x] 테스트할 수 있는 단위로 나누어 구현 목록을 만든다. 
- [x] 덧셈 
- [x] 뺄셈 
- [x] 곱셈 
- [x] 나눗셈  
- [x] 사칙연산 기호가 아닌 경우 IllegalArgumentException throw 
- [x] 사칙 연산을 모두 포함하는 기능 구현

## 2단계 - 로또(자동)

### 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### TODO
- [x] 구매금액을 입력받아 금액에 해당하는 로또를 발급한다.
- [x] 총 구매 개수를 화면에 출력한다.
- [x] 로또 1장당 [1-45] 사이 6개 숫자가 랜덤으로 발급 된다.
- [x] 총 구매 개수 만큼 로또를 발급 한다.
- [x] 발급된 로또를 1장씩 화면에 출력한다.
- [x] 지난 주 당첨 번호를 입력 받는다.
- [x] 당첨 통계를 출력한다.
- [x] 총 수익률을 출력한다.
- [x] 로또에서 무작위로 생성하는 책임은 분리
- [x] 로또에서 출력에 대한 책임은 Report 로 분리
- [x] 3, 4, 5, 6 값 enum 으로 분리
- [x] 당첨 번호도 로또 번호와 동일한 제약 설정
- [x] WinningRules 정적 팩토리 메서드를 활용
- [x] MVC 패턴 적용 domain, view 패키지 구조 분리

## 3단계 - 로또(자동)

### TODO
- [x] 2단계 피드백 반영 - 원시타입 사용, 사용하지 않는 코드 제거, enum 클래스명 수정
- [x] 2단계 피드백 반영 - 부 생성자는 주 생성자를 호출하는 구조로 개선
- [x] 2단계 피드백 반영 - LottoNumber 객체를 도출해서 숫자의 범위에 대한 응집도를 높이기 
- [x] 2단계 피드백 반영 - LottoWinners 가 WinningRule을 대체
- [x] 2단계 피드백 반영 - Report 에서 winningRules 인스턴스 변수 제거
- [x] 2단계 피드백 반영 - Report 에서 수익률을 계산 기능은 도메인 로직으로 분리
- [x] 2등을 위해 추가 번호를 하나 더 추첨한다.
- [x] 당첨 통계에 2등도 추가해야 한다.
