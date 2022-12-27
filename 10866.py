import sys

num = int(input())
Deque = []
#print(num)
for i in range(num):
   # print(i,",",num) num에 15를 넣었을때 i가 0~14까지 잘 들어가나 확인하기위한 구문입니다.이떄 i는14까지 잘 들어갑니다
    cmd = list(sys.stdin.readline().rstrip().split())
    print(cmd)
    if cmd[0] == "push_front":
        Deque.insert(0,cmd[1])

    if cmd[0] == "push_back":
        Deque.append(cmd[1])

    if cmd[0] == 'pop_front':
        if len(Deque) != 0:
            print(Deque.pop(0))
        else:
            print(-1)
    if cmd[0] == 'pop_back':
        if len(Deque) != 0:
             print(Deque.pop(len(Deque)-1))
        else:
            print(-1)
    if cmd[0] == 'size':
        print(len(Deque))

    if cmd[0] == 'empty':
        if len(Deque) == 0:
            print(1)
        else:
            print(0)
            continue

    if cmd[0] == "front":
        if len(Deque) == 0:
            print(-1)
        else:
            print(Deque[0])

    if cmd[0] == "back":
        if len(Deque) == 0:
            print(-1)
        else:
            print(Deque[len(Deque)-1])