#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,d,p;
  cin>>n;
  p=n;
  while(p>0)
  {
    d=p%10;
    sum=sum+d;
    p=p/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}