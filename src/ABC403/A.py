N = int(input())




inputList = []
ans = 0

for i in range(N):
    inputVal = int(input())
    inputList.append(inputVal)
    if i %2 == 0:
        ans += inputVal
print(ans)