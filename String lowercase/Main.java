#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  transform(s.begin(),s.end(),s.begin(),::tolower);
  cout<<"String in lowercase is "<<s;
  
}