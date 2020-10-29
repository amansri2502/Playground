#include<iostream>
using namespace std;
int main()
{
  int n,i,sum=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++){
  	cin>>a[i];
    sum=sum+a[i];
  }
  cout<<"The mean of the array is "<<sum/n;
  
  
  
}