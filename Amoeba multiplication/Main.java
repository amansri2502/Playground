#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,t1=0,t2=1,next;
  cin>>n;
  for(int i=1;i<n-1;i++)
  {
    sum=sum+t1;
    next=t1+t2;
    t1=t2;
    t2=next;
  }
  cout<<sum+1;
  
}