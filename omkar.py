t=int(input())
res=[]
for _ in range(t):
    n,k=map(int,input().split())
    a=list(map(int,input().split()))
    d=max(a)
    if(len(a)==1):
        res.append([0])
    else:
        for i in range(k):
            for j in range(0,n):
                a[j]=d-a[j]
        res.append(a)
for i in range(len(res)):
    for j in range(len(res[i])):
        print(res[i][j],end=' ')
    print()