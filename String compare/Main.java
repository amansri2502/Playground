#include<iostream>
#include<string>
using namespace std;
int main()
{
 string s,a;
  cin>>s>>a;
  if(s.compare(a)==0)
    cout<<"Strings are same";
  else
    cout<<"Strings are not same";
}