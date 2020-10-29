#include <iostream>
using namespace std;
int main() {
    // Type your code here
   int n,i=1;
  cin>>n;
  while(i<=n){
    if(i%2==0){
    	int j=1;
    	cout<<i+1;  
    	while(j<n){
    	cout<<i;
          j++;
    	} 
      cout<<endl;
    	i++;    
    }
    else{
      int j=1;
      while(j<n){
    	cout<<i;
        j++;
    	} 
      cout<<i+1<<endl;
      i++;
    }
  
  }
}