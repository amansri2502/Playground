#include<iostream>
using namespace std;
main(){
	int n,i,j,temp;
	int a[40];
	cin>>n;
	for( i=0;i<n;i++){
		cin>>a[i];
	}
	for( i=0;i<n-1;i++){
		for( j=i+1;j<n;j++){
          if(a[i]>a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
          }
			
		}
	}
  cout<<"Sorted array is:"<<endl;
	for(int i=0;i<n;i++){
		cout<<a[i]<<endl;
	}
}