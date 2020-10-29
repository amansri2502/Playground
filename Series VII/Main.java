#include<iostream>
using namespace std;
int main()
{
  int n,i,p=1;
  cin>>n;
  cout<<p<<" ";
  for(i=2;i<=n;i++)
    if(i%2==0){
      p=p*2;
    cout<<p<<" ";
    }
  else{
  	p=p*3/2;
    cout<<p<<" ";
  }
}