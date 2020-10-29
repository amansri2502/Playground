#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s,ss;
  cin>>s>>ss;
  s.append(ss);
  cout<<"The concatenated string is "<<s;
}