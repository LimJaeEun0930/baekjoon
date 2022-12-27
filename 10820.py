import sys

for line in sys.stdin:
    up = 0
    lw = 0
    nb = 0
    nn = 0
    strs = line


    for i in range(len(strs)):
        if strs[i].isalpha() and strs[i].upper() == strs[i]:
            up += 1
        elif strs[i].isalpha() and strs[i].lower() == strs[i]:
            lw += 1
        elif strs[i].isnumeric():
            nb += 1
        elif strs[i] == ' ':
            nn += 1
    print(f"{lw} {up} {nb} {nn}")

# import sys
#
# while True:
#
#     up = 0
#     lw = 0
#     nb = 0
#     nn = 0
#     strs = sys.stdin.readline().rstrip()
#     i = 0
#     while True:
#         if strs[i].isalpha() and strs[i].upper() == strs[i]:
#             up += 1
#         elif strs[i].isalpha() and strs[i].lower() == strs[i]:
#             lw += 1
#         elif strs[i].isnumeric():
#             nb += 1
#         elif strs[i] == ' ':
#             nn += 1
#         if i == len(strs)-1:
#             break
#         i += 1
#     print(f"{lw} {up} {nb} {nn}")