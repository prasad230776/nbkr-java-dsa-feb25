def isSubString(st1, st2):
    len1 = len(st1)
    len2 = len(st2)
    if len2 > len1:
        return "NO"
    isSub = False
    for index in range(len1 - len2 + 1):
        index2 = 0
        while index2 < len2:
            if st1[index + index2] != st2[index2]:
                break
            index2 += 1
        if index2 == len2:
            isSub = True
            break
    return "YES" if isSub else "NO"


st1 = input().strip()
st2 = input().strip()
print(isSubString(st1, st2))
