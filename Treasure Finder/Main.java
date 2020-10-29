#include<iostream>
using namespace std;
int gcd (int m,int n){
  int rem;
  while(n!=0)
  {
    rem=m%n;
    m=n;
    n=rem;
  }
  return m;
}

  
int main()
{
  int a,b,c,gcd1,gcd2;
  cin>>a>>b>>c;
  if(a>b && a>c)
  {
    if(b>c){
     cout<<"The treasure is in box which has number ";
    cout<<b;}
    else{
      cout<<"The treasure is in box which has number ";
    cout<<c;}
  }
  else if(b>a && b>c)
  { if(a>c){
     cout<<"The treasure is in box which has number ";
    cout<<a;}
    else{
      cout<<"The treasure is in box which has number ";
    cout<<c;}
  }
  else
  {
   if(a>b){
     cout<<"The treasure is in box which has number ";
    cout<<a;}
    else{
      cout<<"The treasure is in box which has number ";
    cout<<b;
  }
  }
  gcd1=gcd(a,b);
  gcd2=gcd(c,gcd1);
  cout<<endl;
  cout<<"The code to open the box is ";
  cout<<gcd2;
  
 
}