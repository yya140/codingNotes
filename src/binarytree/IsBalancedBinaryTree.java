//package binarytree;
//
//import com.sun.source.tree.Tree;
//
//import java.lang.*;
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//class TreeNode{
//    int value;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int key) {
//        value = key;
//    }
//}
//
//public class IsBalancedBinaryTree {
//    public static boolean isBalancedTree(TreeNode root)  {
//        return helper(root) != -1;
//    }
//
//    private static int helper(TreeNode root) {
//        if (root  == null) {
//            return 0;
//        }
//        int left = helper(root.left) ;
//        int right = helper(root.right) ;
//        if (left == -1 || right == -1) {
//            return -1;
//        } else {
//            return Math.max(left, right) + 1;
//        }
//    }
//
////    public static TreeNode constructTree(Integer[] array){
////
////    }
////
////    public Integer[] destructTree(TreeNode root){
////
////    }
////
////    public TreeNode buildHeap(int[] array){
////
////    }
////
////    public static void main(String[] arg){
////        Integer[] array = new Integer[]{5,3,8,1,4,11};
////        TreeNode root = constructTree(array);
////        System.out.println(isBalancedTree(root));
//
//
//
//
//
//
//
//
//    }
//}
//
//
