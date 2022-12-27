import sys

text = list(sys.stdin.readline().rstrip())

flag = False
result = ''
stack = ''

for i in text:

    if flag == False:
        if i=='<':
            flag = True
            stack += i
        elif i == '':
            stack += i
            result += stack
            stack = ''
        else:
            stack = i + stack

    elif flag == True:
        stack += i
        if i == '>':
            flag = False
            result += stack
            stack = ''

print(result + stack)

# import sys
#
# st = list(sys.stdin.readline())
# st.remove('\n')
#
# tem = []
# tem2 = []
# co = 0
# for i in range(len(st)):
#     if st[i] != '<' and co ==0:
#         tem.append(st[i])
#        # print(tem) #
#
#     elif st[i] == '<' and co ==0:
#         print(tem[len(tem) - 1::-1], end='')
#         #print(tem)
#         tem=[]
#         co= 1
#     elif st[i] == '<' and co ==1:
#         for k in range(i,st.index('>',i)+1):
#             tem2.append(st[k])
#         co = 0
#         print({n for n in tem2},end='')
#         tem2=[]
#
#
# #print(st)