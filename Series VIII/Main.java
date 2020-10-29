#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,p;
  p=4;
  cin>>n;
  cout<<p<<" ";
  for(i=1;i<n;i++){
  	p=p+i*i;
     cout<<p<<" ";
  }
}