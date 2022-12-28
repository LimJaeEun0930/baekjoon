import sys

for chs in sys.stdin.readline().rstrip():

    if chs.isalpha():
        if chs.upper()==chs:
            if ord(chs)+13 <=90:
                print(chr(ord(chs)+13),end='')
            elif ord(chs)+13 >90:
                print(chr((ord(chs)+13)%90 + 64),end='')
        elif chs.lower()==chs:
            if ord(chs)+13 <=122:
                print(chr(ord(chs)+13),end='')
            elif ord(chs)+13 >122:
                print(chr((ord(chs)+13)%122 + 96),end='')

    else:
        print(chs,end='')

# Upp: 65 ~ 90
# low: 97 ~ 122