#include<iostream>
using namespace std;
int main()
{
  int n,i,p,q;
  cin>>n;
  p=9;
  q=11;
  if(n==1)
    cout<<p;
  else{
  cout<<p<<" "<<q<<" ";
  for(i=2;i<n;i++){
    int r=p+q;
    cout<<r<<" ";
  	p=q;
  q=r;}}
}