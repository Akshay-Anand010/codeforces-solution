t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    a.sort()
    ok=True
    p=bool(ok)
    for i in range(1,n):
        p &= (a[i] - a[i - 1] <= 1)
    if(p):
        print("YES")
    else:
        print("NO")