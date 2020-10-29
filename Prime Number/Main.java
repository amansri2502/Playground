#include<iostream>
#include <cmath>
using namespace std;
int fun(int n, int root ){
  
	if(root==1)
      return 1;
  else if(n%root==0){
    return 0;
  }
  fun(n,root-1); 
}
int main()
{
  int n,res,root;
  cin>>n;
  root=sqrt(n)-1;
  res=fun(n,root);
 	if(res==1)
      cout<<"Prime Number";
  else
    cout<<"Not a Prime Number";
}