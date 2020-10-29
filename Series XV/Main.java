#include<iostream>
using namespace std;
int main()
{ int n,p=3,q=8,i,r;
 cin>>n;
 if(n==1)
   cout<<p;
 if(n>=2)
   cout<<p<<" "<<q<<" ";
 if(n>2){
 for(i=2;i<n;i++){
   r=p+q+i;
 	cout<<r<<" ";
   p=q;
   q=r;
 }
 
 }
}