#include<iostream>
using namespace std;
int main()
{
  int n,m,suma=0,sumb=0;
  cin>>n>>m;
  int a[n],b[m];
   for(int i=0;i<n;i++)
  cin>>a[i];
   for(int i=0;i<m;i++)
     cin>>b[i];
  for(int i=0;i<n;i++){
  suma=suma+a[i];
  }
   for(int i=0;i<m;i++){
  sumb=sumb+b[i];
  }
  if(suma==sumb && m==n)
    cout<<"Same";
  else
    cout<<"Not Same";
  
}