import sys

n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))


# for idx,i in enumerate(nums):
#     for k in range(idx+1,len(nums)):
#         if nums.count(nums[k])>nums.count(i):
#             print(nums[k],end=' ')
#             break
#         elif k == len(nums)-1:
#             print('-1',end=' ')
# print(-1,end='')
# for문 두번써서 그런지 시간초과 나온다. for문을 한번만 쓰는 방향으로.
