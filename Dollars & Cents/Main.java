#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  a=a+c;
  b=b+d;
  
  if(b%100>0){
    a=a+b/100;
    b=b%100;}
  cout<<a<<endl<<b;
}