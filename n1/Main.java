public class Main {
public static void main(String[] args) {

        Node<Integer> linkedListHead = new Node<>(1);
        linkedListHead
                .setNextNode(new Node<>(2))
                .setNextNode(new Node<>(3))
                .setNextNode(new Node<>(4));
        reverse(linkedListHead);
    }

    private static void print(Node<Integer> head) {

        Node<Integer> curNode = head;
        while (curNode != null) {

            System.out.print(curNode.value);

            curNode = curNode.getNextNode();
            if (curNode != null) System.out.print("->");
        }
    }

    private static Node<Integer> reverse(Node<Integer> head) {
        if(head != null){
            Node<Integer> nextNode = null;
            Node<Integer> prevNode = null;
            Node<Integer> curNode = head;
             while (curNode != null ){
                nextNode = curNode.getNextNode();
                 if(prevNode == null){
                     curNode.setNextNode(null);
                 }
                 if(prevNode != null) {
                     curNode.setNextNode(prevNode);
                 }
                 prevNode = curNode;
                 curNode = nextNode;
            }
            head = prevNode;

            print(head);
        }
        return null;
    }
}
