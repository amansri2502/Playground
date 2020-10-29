#include<iostream>
using namespace std;
int main(){
	int n,i,j,k,temp;
	int a[20];
	cin>>n;
	for(i=0;i<n;i++){
		cin>>a[i];
	}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a[i]==a[j]){
				for(k=j;k<n;k++){
					a[k]=a[k+1];
					
				}
				n--;
				j--;
			}
		}
	}
	for(i=0;i<n;i++){
		cout<<a[i]<<endl;
	}
}