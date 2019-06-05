package test.ShujujiegoAndsf.Erchashu;

public class Tree {
    //根
    private Node root;


    public Node getRoot() {
        return root;
    }

    //插入方法
    public void insert(int keyData, int otherData) {
        Node newNode = new Node(keyData, otherData);
        //如果没有节点
        if (root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (keyData < current.getKeyData()) {
                    current = current.getLeftNode();
                    if (current == null) {
                        parent.setLeftNode(newNode);
                        return;
                    }
                } else {
                    current = current.getRightNode();
                    if (current == null) {
                        parent.setRightNode(newNode);
                        return;
                    }
                }
            }
        }
    }

    //查找方法
    public Node find(int keyData) {
        Node current = root;
        while (keyData != current.getKeyData()) {
            if (keyData < current.getKeyData()) {
                current = current.getLeftNode();
            } else {
                current = current.getRightNode();
            }
            if (current == null)
                return null;
        }
        return current;
    }

    //删除方法
    public void delet(int keyData) {

    }

    //修改方法
    public void change(int keyData, int otherData) {
        Node findNode = find(keyData);
        findNode.setOtherData(otherData);
    }

    //先序遍历
    public void preOrderDisplay(Node node) {
        if (node != null) {
            node.display();
            preOrderDisplay(node.getLeftNode());
            preOrderDisplay(node.getRightNode());
        }
    }

    //先序遍历
    public void inOrderDisplay(Node node) {
        if (node != null) {
            inOrderDisplay(node.getLeftNode());
            node.display();
            inOrderDisplay(node.getRightNode());
        }
    }

    //后序遍历
    public void endOrderDisplay(Node node) {
        if (node != null) {
            endOrderDisplay(node.getLeftNode());
            endOrderDisplay(node.getRightNode());
            node.display();
        }
    }
}
