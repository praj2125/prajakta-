
class DLL2
{	
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	}
	
	void insert(int new_data)
{
	Node new_node = new Node(new_data);
	new_node.next = head;
	new_node.prev=null;
	if(head != null )
		head.prev = new_node;
	head = new_node;
	
}

void display(Node n)
{
	Node p =null;
	System.out.println("Forward Display:");
	while( n != null)
	{
		System.out.print(n.data+ "--> ");
		p=n;
		n=n.next;
	}
	System.out.println("----------------");
	System.out.println("Reverse Display:");
	while( p != null)
	{
		System.out.print(p.data+"<-- ");
		p=p.prev;
	}
}

void insertAfter(Node prev,int new_data)
{
	if(prev == null)
		{return;}
	Node new_node = new Node(new_data);
	new_node.next = prev.next;
	prev.next = new_node;
	new_node.prev = prev;
	new_node.next.prev = new_node;
	
}

void append(int new_data)
{
	Node new_node = new Node(new_data);
	Node n = head;
	new_node.next = null;
	if(head == null)
	{
		new_node.prev = null;
		head = new_node;
		return;
		
	}
	while(n.next != null)
	{
		n=n.next;
	}
	n.next = new_node;
	new_node.prev = n;
	

}	
public static void main(String args[])
{	
	DLL2 d1 = new DLL2();
	
	d1.append(90);
	
	d1.insert(21);
	d1.insert(11);
	d1.insert(5);
	d1.display(d1.head);
	System.out.println();
	
	d1.insertAfter(d1.head, 45);
	d1.insertAfter(d1.head, 56);
	d1.insertAfter(d1.head, 75);
	d1.display(d1.head);
	System.out.println();
	
	
	d1.append(78);
	d1.display(d1.head);
	System.out.println();
	
	
}

}