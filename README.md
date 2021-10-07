# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
---
## 기능 요구사항
> 기능 목록을 만들고, 기능 단위로 commit 하는 방식으로 진행
* n대의 자동차
    * 자동차 이름은 쉼표(,)로 구분하여 사용자 입력
* 게임 진행
    * 이동 횟수 사용자 입력
    * 전진 조건
        * 랜덤 값 0 - 9
        * 전진 : 4 이상
        * 정지 : 3 이하
  * 전진하는 자동차의 이름도 함께 출력 
* 경주 우승
    * 우승자 출력 : 한 명 이상의 경우 쉼표(,)로 구분하여 출력
* 사용자 입력 예외처리
    * 자동차 이름 길이 제한 : 5자 이하
    * 이동 횟수 숫자만 입력 가능
## 프로그래밍 요구사항
### 1. 제약사항
* nextstep.utils 패키지에서 제공하는 Randoms, Console API 활용
   ```
   Random 값 추출 nextstep.utils.Randoms의 pickNumberlnRange()
   사용자 입력 값 nextstep.utils.Console의 readLine()
   ```
* baseball.ApplicationTest에 있는 Test Case 2개 (모든 기능 Test Case를 추가해보도록 한다.)
* indent depth가 2를 넘지 않아야 함. 1까지만 허용
* 일급 컬렉션을 활용하여 구현
* 모든 원시값과 문자열을 포장
### 2. 단위 테스트