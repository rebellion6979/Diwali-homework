class DoubleLL{
    public  Node head =null;
    class Node
    {
        int data;
        Node prev;
        Node next;
        Node()
        {}
        Node(int d)
        {
            data =d;
            prev =next =null;
        }
    }

    public void insert(int new_data)
    {
        Node new_node = new Node(new_data);
       
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
    }

    public void display()
    {
        Node n =head;
        if(head ==null)
        {
            System.out.println("List is empty");
        }
        else
        {
        while(n!=null)
        {
            System.out.print("--"+n.data);
            n =n.next;
        }
        }

    }

    public void append(int new_data)
    {
        Node new_node =Node(new_data);
        Node temp =head;
        if (head ==null)
        {
            head =new_node;

        }
        else{
        while (temp.next !=null)
        {
            temp =temp.next;
        }
        temp.next =new_node;
        new_node.prev =temp;
        new_node.next =null;
        }

    }
    public static void main(String args[])
    {
        DoubleLL d1 =new DoubleLL();
        d1.insert(10);
        d1.insert(20);
        d1.insert(54);
        d1.insert(445);
        d1.append(4566);
        d1.append(2);
        d1.append(1);
        d1.append(0);
        d1.display();
    }

}