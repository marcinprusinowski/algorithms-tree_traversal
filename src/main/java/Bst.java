public class Bst {
    private BstNode core =null;
    private int size= 0;


    public void insert(int value){
        core = add(core ,value);
        size++;
    }

    private BstNode add(BstNode current, int value) {
        if (current == null) {
            return new BstNode(value);
        }

        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public boolean search(int value) {
        return find(core, value);
    }

    private boolean find(BstNode current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }

        if (value < current.value){
            return find(current.left, value);
        }else{
            return find(current.right, value);
        }

    }
    public void delete(int value) {
        core = remove(core, value);
        size--;
    }

    private BstNode remove(BstNode current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = getSmallest(current.right);
            current.value = smallestValue;
            current.right = remove(current.right, smallestValue);
            return current;

        }
        if (value < current.value) {
            current.left = remove(current.left, value);
        }else {
            current.right = remove(current.right, value);
        }
        return current;


    }
    private int getSmallest(BstNode root) {
        if (root.left == null){
            return root.value;
        }else{
            return getSmallest(root.left);
        }
    }
    public void print(){
        System.out.println(core.value);
    }
    public int getSize() {
        return size;
    }
    public int getMax(){
        int max = max(core);
        return max;
    }
    private int max(BstNode root){
        if (root.right == null){
            return root.value;
        }else{
            return max(root.right);
        }
    }
    public void postOrder(){
        printPostOrder(core);
    }

    private void printPostOrder(BstNode node){
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + " ");
    }
    public void inOrder(){
        printInOrder(core);
    }

    private void printInOrder(BstNode node){
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }

    public void preOrder(){
        printPreOrder(core);
    }

    private void printPreOrder(BstNode node){
        if (node == null)
            return;

        System.out.print(node.value + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
