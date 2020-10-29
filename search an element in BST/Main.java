#include<iostream>
using namespace std;
struct node{
	int data;
  	node* left;
  	node* right;
};

node* insert(node* root,int x){
	node* temp=new node();
  	temp->data=x;
  	temp->left=NULL;
  	temp->right=NULL;
  	if(root==NULL){
    root=temp;
    }
  else if(x<root->data){
  	root->left=insert(root->left,x);
  }
  else{
   	root->right=insert(root->right,x);
  }
    return root;
}
  
bool search (node* root,int x){
	if(root==NULL)
  	return false;
  	else if( root->data==x){
    	return true;
    }
  	else if(root->data>x){
    search(root->left,x);
    }
  else{
  	search(root->right,x);
  }
}  
int main()
{
  node* root=NULL;
  int n;
  while(1){
  cin>>n;
    if(n<0)
      break;
  	else{
    root=insert(root,n);
    }
      
  }
  int p;
  cout<<"Enter the element to be searched:"<<endl;
  cin>>p;
  bool a=search(root,p);
  if(a)
    cout<<p<<" is present in the BST"<<endl;
  else{
  	cout<<p<<" is not present in the BST"<<endl;
  }
    
  
  
  return 0;
}