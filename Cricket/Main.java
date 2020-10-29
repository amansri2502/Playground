#include<iostream>
using namespace std;

float round(float var) 
{ 
    // 37.66666 * 100 =3766.66 
    // 3766.66 + .5 =3767.16    for rounding off value 
    // then type cast to int so value is 3767 
    // then divided by 100 so the value converted into 37.67 
    float value = (int)(var * 10 + .5); 
    return (float)value / 10; 
} 

int main()
{
int w,x,y,z,q;
float p,r,s,k,b,l;
float t = 6;
  cin>>w>>x>>y>>z;
  b=(z%6);
  p = w/6;
  q = z/t;
  l = z/t;
  k=q+(b/10);
  r = y/k;
  
  s = x/p;
  cout<<p<<"\n";
  cout<<k<<"\n";
  cout<<round(r)<<"\n";
  cout<<round(s)<<"\n";
  if(r>s){
    cout<<"Eligible to Win";
  }
  else{
  cout<<"Not Eligible to Win";
  }
  return 0;
}