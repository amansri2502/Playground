#include<iostream>
using namespace std;
main(){
	int n,i,j,flag=0,count=0;
	cin>>n;
	int a[n],b[n];
	for( i=0;i<n;i++){
		cin>>a[i];
	}
	for( i=0;i<n;i++){
		flag=0;
		for( j=0;j<=count;j++){
			if(b[j]==a[i]){
				flag=1;
			}	
		}
		if(flag==0){
			b[count]=a[i];
			count++;
		}
		
	}
	cout<<"There are "<<count<<" distinct element in the array.";	
}