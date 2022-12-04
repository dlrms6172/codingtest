# codingtest
## Reference : Programmers coding test practice

### Solution_1(컨트롤 제트)
- 문제 : 숫자들이 공백으로 구분된 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 “Z”가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 “Z”로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

- 해결방법 : stack을 사용한다.
##

### Solution_2(배열 자르기)
- 문제 : 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

- 해결방법 : Arrays.copyOfRange를 이용한다.
##

### Solution_3(세균 증식)
- 문제 : 어떤 세균이 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

- 해결방법 : for 문 사용
##

### Solution_4(치킨 쿠폰)
- 문제 : 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.

- 해결방법 : 몫 과 나머지를 따로 구한 후 더해준다.
##

### Solution_5(자릿수 더하기)
- 문제 : 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

- 해결방법 : 문자열로 변경한 후 substring함수를 이용하여 각각의 문자를 정수로 변경하여 더해준다.
##

### Solution_6(짝수의 합)
- 문제 : 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

- 해결방법 : 2로 나누었을 때 0이면 더해준다.
##

### Solution_7(다항식 더하기)
- 문제 : 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.

- 해결방법 : stringbuilder 사용
##

### Solution_8(나누어 떨어지는 숫자 배열)
- 문제 : array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

- 해결방법 : List 사용
##
