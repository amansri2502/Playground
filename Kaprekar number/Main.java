#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,s,count=0,sum1=0,sum2=0,sum=0,d,p,i,a;
  cin>>n;
  s=n*n;
  p=n;
  while(p>0)
  {
	count++;
    p=p/10;
  }
  p=count;
  i=0;
  while(p>0)
  {
	d=s%10;
    sum1=sum1+pow(10,i)*d;
    s=s/10;
    p--;
    i++;
    
  }
  i=0;
  while(s>0){
  d=s%10;
     sum2=sum2+pow(10,i)*d;;
    s=s/10;
    i++;
   
  }
  sum=sum1+sum2;
  if(sum==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}