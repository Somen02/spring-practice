package DataStructure.arrays;

class EquilibriumIndex {
    // Function to find equilibrium point in the array
    public static int equilibriumPoint(long arr[]) {
        int n = arr.length;
        if (n == 1)
            return 1;

        // Arrays to store prefix and suffix sums
        long[] prefix = new long[n];
        long[] suffix = new long[n];

        // Initialize prefix sum
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Initialize suffix sum
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        // Check for equilibrium index
        for (int i = 0; i < n; i++) {
            if (prefix[i] == suffix[i]) {
                return i + 1; // return 1-based index
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        long arr[] = { -7, 1, 5, 2, -4, 3, 0 };

        // Function call
        System.out.println(equilibriumPoint(arr));
        System.out.println(equilibriumPointSecondApproach(arr));
    }

    private static int equilibriumPointSecondApproach(long[] arr) {

        int sum=0;
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        for (int i=0;i<arr.length;i++){
            sum-=arr[i];

            if(sum==leftSum){
                return i+1;
            }
            leftSum+=arr[i];
        }

        return -1;
    }
}
