class TwoStacks
{
int size;
int top1;
int top2;
int a[];
TwoStacks(int n)
{
size=n;
a=new int[size];
top1=-1;
top2=size;
}
void push1(int n)
{
	if(top1<top2-1)
	{
		top1++;
		a[top1]=n;
	}else
		System.out.println("OverFlow");
}
void push2(int n)
{
	if(top1<top2-1)
	{
		top2--;
		a[top2]=n;
	}else
		System.out.println("OverFlow");
}
int pop1()
{
	if(top1>=0)
	{
		int x=a[top1];
		top1--;
		return x;
	}
	else
	{
		System.out.println("Underflow");
	}
	return 0;
}
int pop2()
{
	if(top2 <size)
	{
		int x=a[top2];
		top2++;
		return x;
	}
	else
	{
	System.out.println("Underflow");
	}
	return 0;
} public static void main(String args[])
{
	TwoStacks obj=new TwoStacks(5);
	obj.push1(5);
	obj.push2(10);
	obj.push2(15);
	obj.push1(11);
	obj.push2(7);
	
	System.out.println("Popped element from stack1 is "+obj.pop1());
	obj.push2(40);
	System.out.println("Popped element from stack2 is "+obj.pop2());
}
}