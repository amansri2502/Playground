#include<iostream>
using namespace std;
int main()
{
  int n,i,p=2;
  cin>>n;
  cout<<p<<" ";
  for(i=1;i<n;i++){
    p=p*p-1;
  	cout<<p<<" ";
  }
  
}