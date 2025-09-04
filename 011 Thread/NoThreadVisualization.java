public class NoThreadVisualization {
    public static void main(String[] args) {
        // Run 3 "workers" sequentially in the same thread
        for (int workerId = 1; workerId <= 3; workerId++) {
            runWorker(workerId);
        }
    }

    private static void runWorker(int id) {
        String name = "Worker-" + id;
        for (int i = 0; i <= 20; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j <= 20; j++) {
                if (j == i) {
                    line.append(">");
                } else {
                    line.append(".");
                }
            }
            System.out.println(name + " " + line);

            try {
                Thread.sleep(100); // simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " finished\n");
    }
}
