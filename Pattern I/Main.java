#include<iostream>
using namespace std;
main(){
int n,i,num,j,k;
  cin>>n;
  num=n;
  
  for(i=1;i<=4;i++){
 	 
  		for(j=0;j<i;j++)
          cout<<num;
        cout<<endl;
    		num++;
  		}
num=num-1;
  for(k=0;k<=i+1;k++){
  for(j=0;j<i-1;j++){
    cout<<num;
  }cout<<endl;
    num--;
    i--;
  }
//   
  
}