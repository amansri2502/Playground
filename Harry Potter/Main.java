#include<iostream>
using namespace std;
int main()
{
  int num,n,a,b;
  cin>>num;
  n=num;
  a=n%10;
    n=n/10;
  n=n/10;
  n=n/10;
  b=n%10;
  
  b=n%10;
  cout<<a+b;
  
  
}