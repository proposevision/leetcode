package tree;

public class PopulatingNextRightPointersinEachNode116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node start = root;
        Node current;
        while (start.left != null) {
            current = start;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            start = start.left;
        }
        return root;
    }
    /*
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        final Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            final int currentSize = queue.size();
            Node previous = null;
            for (int size = 0; size < currentSize; size++) {
                final Node current = queue.poll();
                if (previous != null) {
                    previous.next = current;
                }
                previous = current;
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return root;
    }
     */

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;
}