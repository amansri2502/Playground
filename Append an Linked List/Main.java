#include<iostream>
#include<stdlib.h>
using namespace std;
struct node{
int a;
node *link;  
};
node *head=NULL;
void insert(int n)
{
	node *temp=new node();
  	temp->a=n;
  	temp->link=NULL;
  	if(head==NULL)
      head=temp;
  else{
    node *temp1;
    temp1=head;
  	while(temp1->link!=NULL)
      temp1=temp1->link;
    temp1->link=temp;
  }
}
int main()
{int b;
  while(1)
  {
    cin>>b;
    if(b<0)
      break;
    else
      insert(b);
  }
 node *temp1;
 temp1=head;
 cout<<temp1->a<<endl;
 while(temp1->link!=NULL){
  
   temp1=temp1->link;
   cout<<temp1->a<<endl;
    
 	
 }
  return 0;
}