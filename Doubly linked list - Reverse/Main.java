#include<iostream>
using namespace std;
struct node{
	int data;
  	node* prev;
  	node* next;
};
int count=0;
node* head=NULL;
void insert(int n){
	node* temp=new node();
  	temp->data=n;
  	temp->next=NULL;
  	temp->prev=NULL;
  if(head==NULL){
    head=temp;
    count++;
  }
    
  else{
  	node* temp1=head;
    while(temp1->next!=NULL)
      	temp1=temp1->next;
    temp1->next=temp;
    temp->prev=temp1;
    count++;
  }
}
void print(){
	node* temp=head;
  	while(temp!=NULL){
    cout<<temp->data<<endl;
    temp=temp->next;
    }
}
void reverse(){

  node* temp=head;
  node* temp1;
  for(int i=0;i<count;i++){
  	temp1=temp->prev;
    temp->prev=temp->next;
    temp->next=temp1;
    if(i!=count-1)
    temp=temp->prev;
  }
  head=temp;

}

int main()
{
  int n;
  while(1){
  	cin>>n;
    if(n>0){
   	insert(n);
    }
    else
      break;
  }
  cout<<"Original order:"<<endl;
  print();
  cout<<"Reverse order:"<<endl;
  reverse();
  print();
  return 0;
}