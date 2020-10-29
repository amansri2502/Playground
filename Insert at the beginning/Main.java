#include<iostream>
using namespace std;
struct node{
	int data;
  	node *next;
};
node *head;
void insert(int n){
	node *temp=new node();
  	temp->data=n;
  	temp->next=head;
  	head=temp;
}
void print(){
	node *temp=head;
  	while(temp!=NULL){
    printf("%d\n",temp->data);
    temp=temp->next;  
      
 }
  

}
int main()
{
  head=NULL;
  //type your code here
  int n;
  while(1){
    cin>>n;
  if(n>0){
    
  	insert(n);
  }
  else{
    break;
  }}
  print();
  return 0;
}