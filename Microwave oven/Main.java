#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n>>t;
  switch(n){
    case 1:cout<<t;
      break;
    case 2:cout<<t+0.5*t;
      break;
    case 3:cout<< 2*t;
      break;
    default:cout<<"Number of items is more";  
  }
    
}
