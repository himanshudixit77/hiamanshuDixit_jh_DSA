import java.util.*;
class ReverseLinkedList
{
static node head;
static node head1;
static class node{
node next;
int data;

node(int data)
{
this.data=data;
next=null;
}}
void insertHead(int n)
{
	node obj=new node(n);
	if(head==null)
	{
		obj.next=head;
		head=obj;
	}
}
void insertLast(int n){
	node obj=new node(n);
	node temp=head;
	if(head==null)
	{   
		head=obj;
	}
	else
	{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		obj.next=null;
		temp.next=obj;
	}
}
node reverse(node n)
{
	node temp=n;
	node p=null;
	node q=null;
	while(temp!=null)
	{
		q=temp.next;
		temp.next=p;
		p=temp;
		temp=q;
	}
	n=p;
	return n;
}
void display( node p)
{
while(p!=null)
{
	System.out.print(p.data+ " ");
	p=p.next;
}
	System.out.println();
}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	ReverseLinkedList obj=new ReverseLinkedList();
	int test=sc.nextInt();

			for(int i=0;i<test;i++)
			{
				int n1=sc.nextInt();
				obj.insertLast(n1);
			}
			head1=obj.reverse(head);
			obj.display(head1);
}
}
	