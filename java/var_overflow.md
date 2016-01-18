# Long 자료형에서 나눗셈

* 다음 코드에서의 결과값은?
```
  final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
  final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
  System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
```

결과는 `5` 가나온다 왜일까? 

* 위에서 각 숫자들은 int 형으로 처리가 된다. 따라서 계산을 하다가 보면 오버플로되기 때문에 정상적인 결과가 나오지 않는다.

  - 해결방법 :  `24L * 60 * 60 * 1000 * 1000`으로 적어줘서 `long`타입으로 계산이 되도록 한다.
