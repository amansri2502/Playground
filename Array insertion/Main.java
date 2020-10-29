#include<iostream>
using namespace std;
int main()
{
  int n,i,num,index;
cout<<"Enter the number of elements in the array"<<endl;
  cout<<"Enter the elements in the array"<<endl;
  cout<<"Enter the location where you wish to insert an element"<<endl;
  
  
  
  
    cin>>n;
  int a[n],b[n+1];
  
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  cin>>index;
  
  if(index>n)
    cout<<"Invalid Input";
  else{
    cout<<"Enter the value to insert"<<endl;
    cin>>num;
  for(i=0;i<index-1;i++){
  	b[i]=a[i];
  }
  b[index-1]=num;
  for(i=index;i<=n+1;i++){
  	b[i]=a[i-1];
  }
  cout<<"Array after insertion is"<<endl;
  for(i=0;i<=n;i++){
  	cout<<b[i]<<endl;
  }
  
}}