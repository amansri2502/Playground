#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,p,d,even=0,odd=0;
  cin>>n;
  p=n;
  while(p>0){
    d=p%10;
    if(d%2==0)
      even=even+d;
    else
      odd+=d;
    p=p/10;
}
  if(even==odd)
    cout<<"Yes";
  else 
    cout<<"No";
}