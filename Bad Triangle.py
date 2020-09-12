t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    a.sort()
    c=[]
    flag=0
    i=2
    while(i<n):
        if(a[i-1]+a[i-2]>a[i] ):
            flag=0
        else:
            c.append(i+1)
            c.append(i-1+1)
            c.append(i-2+1)
            flag=1
            break
        i+=2
    c.sort()
    if(flag==0):
        print("-1")
    elif (flag==1):
        for i in range(len(c)):
            print(c[i],end=' ')