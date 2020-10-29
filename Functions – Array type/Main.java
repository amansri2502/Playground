#include<iostream>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array"<<endl;
  int n,i,count=0,flag=0;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  for(i=0;i<n;i++){
  	if(a[i]%2==0){
    	count++;
    }
    else{
    	flag++;
    }
  
  }
  if(count==n)
    cout<<"The array is Even";
  else if (flag==n)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
    
  
}