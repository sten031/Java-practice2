/*・「int」のランチ金額変数（lunchMoney）を任意の値で初期化
　・ランチ金額が800円以上の場合は、"チャーシューメンが食べれます"を出力
　・ランチ金額が600円より多く、800円よりも少ない場合は、"ラーメンが食べれます"を出力
　・その他の場合は、"どのラーメンも食べれません"を出力*/

public class Chapter07 {
    public static void main(String[] args) {
        int lunchMoney = 500;
        if (lunchMoney >= 800) {
            System.out.println("チャーシューメンが食べれます");
        } else if (lunchMoney > 600) {
            System.out.println("ラーメンが食べれます");
        } else {
            System.out.println("どのラーメンも食べれません");
        }
    }
}