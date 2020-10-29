#include<iostream>
using namespace std;
struct node{
	int data;
  	node* prev;
  	node* next;
};
node *head=NULL;
void insert(int n){
	node *temp1=head;
	node* temp=new node();
  	temp->data=n;
  temp->prev=NULL;
  temp->next=NULL;
  if(head==NULL)
  head=temp;
  else{
    
  while(temp1->next!=NULL){
    temp1=temp1->next;}
    temp->prev=temp1;
    temp1->next=temp;
  
  } } 
  
void print(){
	node* temp=head;
  	while(temp!=NULL){
    	cout<<temp->data<<endl;
      	temp=temp->next;
    }
}

int main()
{
  //type your code here
  int n;
  while(1){
  	cin>>n;
    if(n>0)
      insert(n);
   else
     break;
  }
  print();
  return 0;
}