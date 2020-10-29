#include<iostream>
using namespace std;
int main()
{
  int age;
  float t;
  cin>>age>>t;
  t=int(t);
  if(t==13)
  {
  	if(age>13)
      cout<<"$5.00";
    else
      cout<<"$2.00";
    
  }
  if(t!=13)
  {
    if(age>13)
      cout<<"$8.00";
    else
      cout<<"$4.00";
  }
}