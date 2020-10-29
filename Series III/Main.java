#include<iostream>
using namespace std;
int main()
{
  int n,i,count=1,p;
  cin>>n;
  p=6;
  cout<<p<<" ";
  while(count<n){
    p=p+count*5;
    cout<<p<<" ";
    count++;
  }
}