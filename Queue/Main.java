#include<iostream>
using namespace std;
int main()
{
  int n,m,i,j;
  cin>>n>>m;
  int a[20];
  for(int i=0;i<n;i++){
  	cin>>a[i];
  }
   j=m;
  int count=1;
  for(int i=0;i<n;i++){
  	if(j>=a[i]){
      j=j-a[i];
    }
    else{
    	count++;
      j=m;
      j=j-a[i];
    }
      
      
  }
  cout<<count;
}