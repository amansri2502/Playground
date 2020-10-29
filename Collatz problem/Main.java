#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  cin>>n;
  cout<<n<<endl;
  for(;;)
  {
  if(n==1)break;  
  if(n%2==0)
    n=n/2;
  else 
   n=3*n+1;
   cout<<n<<endl;
   count++;
	}
  cout<<count;
}