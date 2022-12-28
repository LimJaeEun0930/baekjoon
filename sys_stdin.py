import sys

for line in sys.stdin:
    if (line == "\n"): #파일 끝내기
        break
    print(type(line))
for line in sys.stdin.readline():
    if (line == "\n"): #파일 끝내기
        break
    print(type(line))
 # loop를 sys.stdin으로 받는것의 의미는 한줄한줄씩 받는것이고 line3
 # loop를 sys.stdin.readline()으로 받는것은 입력받은 문자열의 요소 하나하나씩 loop돌리는것. line7
 # string을 loop 돌리는것과 같다.