#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fc,aa,ad,ac,sa,sd,sc;
  float dis;
  cin>>fa>>fd>>fc>>sa>>sd>>sc>>aa>>ad>>ac;
  dis=fa*(float)(fd/100.0);
  fa=fa-dis;
  fa=fa+fc;
   dis=aa*(ad/100.0);
  aa=aa-dis;
  aa=aa+ac;
   dis=sa*(sd/100.0);
  sa=sa-dis;
  sa=sa+sc;
  cout<<"In Flipkart Rs."<<fa<<endl;
  cout<<"In Snapdeal Rs."<<sa<<endl;
    cout<<"In Amazon Rs."<<aa<<endl;
  if(sa<fa && sa<aa)
    cout<<"He will prefer Snapdeal";
  else if(fa<=sa && fa<=aa)
    cout<<"He will prefer Flipkart";
  else
    cout<<"He will prefer Amazon";
  
  
  
}