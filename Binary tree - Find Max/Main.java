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
node* max( node* root){
	if(root==NULL)return root;
  	else if(root->right==NULL){
  		return root;
  	}
  	else{
    	root= max(root->right);
    }
  return root;

}
int main()
{
  node* root=NULL;
  int n;
  while(1){
  	cin>>n;
    if(n<0)
      break;
    root=insert(root,n);
    
    
  }
  node* maxnode=max(root);
 
  cout<<"Maximum element is "<<maxnode->data;
  
  return 0;
}