package DataStructure.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 2;

        towerOfHanoi(n, "TowerA","TowerB", "TowerC");
    }

        private static void towerOfHanoi(int n, String towerA, String towerB, String towerC) {

        if(n==1){
            System.out.println("block 1 moves from "+towerA +" to "+towerC);
            return;
        }


        towerOfHanoi(n-1,towerA,towerC,towerB);
        System.out.println("block "+n +" moves from "+towerA +" to "+towerC);
        towerOfHanoi(n-1,towerB,towerA,towerC);
    }
//    static void towerOfHanoi(int n, String from_rod,
//                             String to_rod, String aux_rod) {
//        if (n == 0) {
//            return;
//        }
//        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
//        System.out.println("Move disk " + n + " from rod "
//                + from_rod + " to rod "
//                + to_rod);
//        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
//    }
}
