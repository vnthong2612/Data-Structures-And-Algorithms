public class InorderTraversal {
    static class Node{
        public Node left, right;
        public  int val;
        //Constructor
        public Node(int x){
            val = x;
            left = right = null;
        }
    }
    static class inorderTraversal{
        Node root;
        public inorderTraversal(){
            root = null;
        }
        void duyet(Node node){
            if(node == null){
                return;
            }
            duyet(node.left);
            System.out.print(node.val + " ");
            duyet(node.right);
        }
        void duyet() { duyet(root); }


    }

    public static void main(String[] args) {
        InorderTraversal.inorderTraversal obj = new InorderTraversal.inorderTraversal();
        // Nốt gốc
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(5);
        obj.root.left.left = new Node(3);
        obj.root.left.right = new Node(4);
        obj.duyet();
    }
}
