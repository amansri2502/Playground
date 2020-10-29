#include<iostream>
using namespace std;
void sort(int n,int a[]){
  int i,j;
	for(i=0;i<n-1;i++){
    	for(j=0;j<n-1;j++){
        	if(a[j]>a[j+1]){
            int temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
            }
        }	
    
    }
}
int main()
{
  cout<<"Enter the number of elements in the array"<<endl;
  int n,i,j,min,max;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  sort(n,a);
  cout<<"The range of the array is "<<a[n-1]-a[0];
  
}