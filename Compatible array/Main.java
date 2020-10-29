#include<iostream>
using namespace std;
int main()
{
  int n,m,i,flag=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  cin>>m;
  int b[m];
  for(i=0;i<n;i++){
  	cin>>b[i];
  }
  if(n==m){
    for(i=0;i<n;i++){
      if(a[i]<b[i])
         flag=1;
    }
    if(flag==0)
      cout<<"Compatible";
    else{
      cout<<"Incompatible"; 
    }
 
  }else{
  	cout<<"Incompatible";
  }
}