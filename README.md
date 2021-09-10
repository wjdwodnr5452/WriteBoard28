# 발견 문제점
## 1. '조회' 시 /board/view.do 에서 에러 발생

> **원인** : view.jsp 에서 DTO 의 property 를 잘못 기재

```java
// 수정
${list[0].regdate} ==> ${list[0].regDate}
```

## 2. '수정' 시 내용이 삭제되는 증상 발생

> **원인** : update.jsp 에서 parameter name 에 오타

```html
// 수정
<textarea name="contnet"> ==> <textarea name="content">
```