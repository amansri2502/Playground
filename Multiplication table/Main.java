#include<iostream>
using namespace std;
int main()
{
  int n,m,i=1;
  cout<<"Enter n"<<endl;
  cin>>n;
  cout<<"Enter m"<<endl;
  cin>>m;
  cout<<"The multiplication table of "<<n<<" is"<<endl;
  while(i<=m){
  cout<<i<<'*'<<n<<'='<<i*n<<endl;
    i++;
  }
    
}