#include<iostream>
using namespace std;
int top1=-1,top2=-1;;
void enqueue(int x,int a[]){
  top1++;
  a[top1]=x;
}
void dequeue(int a[],int b[]){
  while(top1!=-1){
    top2++;
  	b[top2]=a[top1];
    top1--;
  }
  cout<<b[top2]<<" ";
  top2--;
  while(top2!=-1){
  	top1++;
    a[top1]=b[top2];
    top2--;
  }
  
}

int main()
{
  int n;
  cout<<"Enter the size of stack:"<<endl;
  cin>>n;
  if(n==0)
    return 0;
    
  int a[n],b[n];
 cout<<"Enter the stack values:"<<endl;
  for(int i=0;i<n;i++){
    cin>>a[i];
    enqueue(a[i],a);
  }
  cout<<"Queue elements are:"<<endl;
  for(int i=0;i<n;i++){
  	dequeue(a,b);
  }
  return 0;
}