#include<iostream>
using namespace std;
int main()
{
  int i,n,p=2;
  cin>>n;
  cout<<p<<" ";
  for(i=1;i<n;i++){
  	p=p*2+1;
    cout<<p<<" ";
  }
}