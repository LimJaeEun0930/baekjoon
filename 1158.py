N, K = map(int, input().split())
arr = [i for i in range(1, N + 1)]

answer = []
num = 0

for t in range(N):
    num += K - 1
    if num >= len(arr):
        num = num % len(arr)

    answer.append(str(arr.pop(num))) # pop(num)은 num을 리턴하고 num을 지운다.
print("<", ", ".join(answer)[:], ">", sep='')