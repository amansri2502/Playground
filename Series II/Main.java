#include<iostream>
using namespace std;
int main()
{
  int p,i,n;
  cin>>n;
  p=121;
  cout<<p<<" ";
  for(i=1;i<n;i++){
    p=p+72+32*i;
  	cout<<p<<" ";
  }

}