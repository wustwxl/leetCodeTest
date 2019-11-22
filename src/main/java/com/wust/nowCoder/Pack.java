package com.wust.nowCoder;

/**
 * @author wxl
 * @date 2019/11/22
 * @description 背包问题  动态规划
 */
public class Pack {

    /**
     * @param m : 表示背包的最大容量
     * @param n : 表示商品的个数
     * @param w : 表示商品重量数组
     * @param p : 表示商品价值数组
     *
     */
    public static int[][] bag(int m,int n,int w[],int p[]) {

        //c[i][m] 表示前i件物品恰好放入重量为m的背包时的最大价值
        int c[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
                if (w[i - 1] <= j) {
                    if (c[i - 1][j] < c[i - 1][j - w[i - 1]] + p[i - 1]) {
                        c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
                    } else {
                        c[i][j] = c[i - 1][j];
                    }

                } else {
                    c[i][j] = c[i - 1][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {

        int[] weight = {3,4,5};
        int[] value = {4,5,6};
        //背包的最大容量
        int m = 10;
        //商品个数
        int n = 3;

        int[][] arr = bag(m, n, weight, value);

        //输出物品价值矩阵
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
