#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,na,nc,ta,tc,t;
  cin>>w>>na>>nc;
  ta=na*75;
  tc=nc*30;
  t=ta+tc;
  if(t>w)
    cout<<"Boat will drow";
  else
    cout<<"Boat is stable";
  
  
  
}