package Queue;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class FindingDepth {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int count = 0;
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            count++;
            for(int i=0; i<levelNum; i++){
                Node node = q.poll();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
        return count;
    }
    public static void main(String[] args) {
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.right = new Node(8);

        FindingDepth i = new FindingDepth();
        System.out.println("Tree Height " + i.maxDepth(root));

    }
}
