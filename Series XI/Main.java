#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  float p=95;
  	cout<<p<<" ";
  for(i=1;i<n;i++){
    p=p+18.5+2*i;
  	cout<<p<<" ";
  }
}