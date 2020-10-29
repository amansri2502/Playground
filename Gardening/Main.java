#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rown,coln,tnum;
  cin>>rown>>coln>>tnum;
  if(tnum>rown&&tnum<=rown+rown||tnum>((rown*rown)-rown-rown)&&tnum<=(rown*rown)-rown)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
    
  
}