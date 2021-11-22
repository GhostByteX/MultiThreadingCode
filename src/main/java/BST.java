public class BST {
 
    private String data;
    private BST left;
    private BST right;
 
    public BST() {
        this.data = null;
        this.left = null;
        this.right = null;
    }
     
    public BST(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
 
    public static BST createTree( String content ) {
        BST bstree = new BST();
        if( content != null ) {
            //
            // Remove the punctuation from the content
            //
            content = content.replaceAll("(\\w+)\\p{Punct}(\\s|$)", "$1$2");
            String[] words = content.split( " " );
            bstree = new BST();
            for( int i = 0; i < words.length; i++ ) {
                bstree.addNode( words[i]);
            }
        }
        return bstree;
    }
 
     
    // As a convention, if the key to be inserted is less than the key of root
    // node, then key is inserted in
    // left sub-tree; If key is greater, it is inserted in right sub-tree. If it
    // is equal, as a convention, it
    // is inserted in right sub-tree
    public void addNode(String data) {
        if (this.data == null) {
            this.data = data;
        } else {
            if (this.data.compareTo(data) > 0) {
                if (this.left != null) {
                    this.left.addNode(data);
                } else {
                    this.left = new BST(data);
                }
 
            } else {
                if (this.right != null) {
                    this.right.addNode(data);
                } else {
                    this.right = new BST(data);
                }
 
            }
        }
    }
     
    public void traversePreOrder() {
        System.out.println(this.data);
        if (this.left != null) {
            this.left.traversePreOrder();
        }
        if (this.right != null) {
            this.right.traversePreOrder();
        }
    }
 
    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }
 
 
    public void traversePostOrder() {
        if (this.left != null) {
            this.left.traversePostOrder();
        }
        if (this.right != null) {
            this.right.traversePostOrder();
        }
        System.out.println(this.data);
    }
    
    public boolean search(String data) {
        return search(this, data);
    }

    private boolean search(BST root, String data) {
        if (root == null) {
            return false;
        }
        if(this.data.equalsIgnoreCase(data))
        	return true;
         else if (this.data.compareTo(data) < 0) {
            return search(root.left, data);
        }
        else if (this.data.compareTo(data) > 0) {
            return search(root.right, data);
        }
        else
        	return true;
      
    }
 
}