package leetcode0719;

/**
 * @author: celeste
 * @create: 2020-07-19 17:02
 * @description:
 **/
public class Test {
    public static void main(String[] args) {
        //200题测试
//        char[][] grid = {{'1','0','1','1','1'},
//                {'1','0','1','0','1'},
//        {'1','1','1','0','1'}};
//        NumIslands nu = new NumIslands();
//        nu.numIslands(grid);
// 84题测试
        int[] heights = {0, 9};
        LargestRectangleArea la = new LargestRectangleArea();
        la.largestRectangleArea(heights);
    }
}
