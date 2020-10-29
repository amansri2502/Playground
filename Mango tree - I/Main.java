#include<iostream>
using namespace std;
int main()
{
  int r,c,tn;
  cin>>r>>c>>tn;
  if(tn<c || tn%c==1||tn%c==0)
    cout<<"Yes";
  else
    cout<<"No";
}