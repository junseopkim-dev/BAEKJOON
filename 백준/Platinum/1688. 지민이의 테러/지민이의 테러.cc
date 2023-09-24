#include <bits/stdc++.h>
using namespace std;
 
typedef long long ll;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
 
ll gcd(ll a, ll b) { for (; b; a %= b, swap(a, b)); return a; }
 
pll p2v(pll a, pll b) // 두 점 A,B가 주어지면 벡터 AB를 반환
{
    return { b.first - a.first, b.second - a.second };
}
 
ll ccw(pll v1, pll v2) // 벡터 v1, v2의 CCW
{
    ll res = v1.first * v2.second - v1.second * v2.first;
 
    if (res > 0) return 1;
    else if (res < 0) return -1;
    else return 0;
}
 
int n;
vector <pll> CH;
 
bool isInside_nonconvex(vector <pll>& CH, pll point)
{
    int cnt = 0;
    for (int i = 0; i < CH.size(); i++)
    {
        // x축에 평행하고 point에서 시작하는 반직선과, 선분 p1 p2가 교차하는지 여부
        pll p1 = CH[i], p2 = CH[(i + 1) % CH.size()];
        if (p1.second < p2.second) swap(p1, p2);
 
        pll v1 = p2v(p1, point);
        pll v2 = p2v(point, p2);
 
        if (ccw(v1, v2) == 0)
        {
            // 일단 점이 선분위에 있는지 확인
            if (min(p1.first, p2.first) <= point.first && point.first <= max(p1.first, p2.first)
                && min(p1.second, p2.second) <= point.second && point.second <= max(p1.second, p2.second))
                return true;
        }
 
        if (max(p1.first, p2.first) < point.first) continue;
        if (p1.second <= point.second) continue; // 1
        if (p2.second > point.second) continue;  // 2 둘 중 하나에만 등호가 들어가야 한다.
        if (min(p1.first, p2.first) > point.first) cnt++;
        else if (ccw(v1, v2) > 0) cnt++;
    }
 
    return cnt % 2;
    // 홀수번 교차하면 다각형 내부이다.
}
 
int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);
 
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        ll x, y; cin >> x >> y;
        CH.push_back({ x,y });
    }
 
    for (int i = 0; i < 3; i++)
    {
        ll x, y; cin >> x >> y;
        if (isInside_nonconvex(CH, { x,y })) cout << "1\n";
        else cout << "0\n";
    }
}