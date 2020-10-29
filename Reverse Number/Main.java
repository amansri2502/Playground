#include <iostream>
using namespace std;
int main() 
{
	int n,i=0,p,sum=0,d;
  	cin>>n;
  	p=n;
  while(p>0){
  d=p%10;
  sum=sum*10+d; 
    p=p/10;
  }
  cout<<sum;
  
	return 0;
}