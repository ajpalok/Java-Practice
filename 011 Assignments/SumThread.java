public class SumThread extends Thread {
    int[] arr;
   	int left;
   	int right;
    	int partialSum;

    public SumThread(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
        this.partialSum = 0;
    }

    @Override
    public void run() {

        for (int i = left; i <= right; i++) {
            partialSum += arr[i];
        }
    }

    public static void main(String[] args) {
    
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int numThreads = 4;
        int len = arr.length;
        int step = len / numThreads;

        SumThread[] threads = new SumThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int left = i * step;
            int right = (i == numThreads - 1) ? (len - 1) : (left + step - 1);
            threads[i] = new SumThread(arr, left, right);
            threads[i].start();
        }

        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            totalSum += threads[i].partialSum;
        }

        System.out.println("Total sum = " + totalSum);
     }
}
