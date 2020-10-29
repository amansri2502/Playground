#include<iostream>
using namespace std;
void sort(int n,int a[]){
for(int i=0;i<n-1;i++){
	for(int j=0;j<n-1;j++){
      if(a[j]>a[j+1]){
      		int temp;
       		temp=a[j];
        	a[j]=a[j+1];
        	a[j+1]=temp;
      	}
    	}
  
	}
}
int main()
{
  int n,sum=0,i;
  cin>>n;
  int a[n],b[n];
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  for(i=0;i<n;i++){
  	cin>>b[i];
  }
  sort(n,a);
  sort(n,b);
  for(int i=0;i<n;i++){
  	sum=sum+a[i]*b[i];
  }
  cout<<sum;
  
}