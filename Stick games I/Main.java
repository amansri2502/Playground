#include<iostream>
using namespace std;
int main()
{
  int m,n,mul,sum,count=0;
  cin>>n>>m;
  while(m*n>0){
  	sum=m+n;
    mul=m*n;
    count++;
    m--;
    n--; 
  }
  if(count%2==0){
  	
    cout<<"Jaime Lannister";
  }
  else{
    cout<<"Tyrion Lannister";
  }
}