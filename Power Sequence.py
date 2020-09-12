n=int(input())
a=list(map(int,input().split()))
cost=0
a.sort()
p=a[0]//a[1]
for i in range(1,n):
    if(a[i]%a[i-1]!=0):
        cost+=abs(p^i-a[i])

print(cost,end='\n')