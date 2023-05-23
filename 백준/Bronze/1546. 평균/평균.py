n = int(input())
subjects=list(map(int,input().split()))
max_score = max(subjects)

newscore=[]
for score in subjects:
    newscore.append(score/max_score *100)
avg = sum(newscore)/n
print(avg)