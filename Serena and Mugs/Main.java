#include<iostream>
using namespace std;
int main()
{
 	int n,volume;
  	cin>>n>>volume;
  	int a[n];
  	for(int i=0;i<n;i++)
      cin>>a[i];
  	for(int i=0;i<n;i++){
    volume=volume-a[i];
    }
  	if(volume<0){
      cout<<"NO";
    }
  else{
  cout<<"YES";
  }
  
}