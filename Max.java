class Max {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0]; 
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println(max);
    }
}
