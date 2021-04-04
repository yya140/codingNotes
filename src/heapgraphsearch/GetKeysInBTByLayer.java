package heapgraphsearch;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class GetKeysInBTByLayer {
    public List<List<Integer>> layerByLayer(TreeNode root){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> curLayer = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                curLayer.add(cur.key);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
            }
            list.add(curLayer);
        }
        return list;
    }
}
