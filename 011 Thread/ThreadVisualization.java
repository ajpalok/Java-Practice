public class ThreadVisualization {
    static class Worker extends Thread {
        private final int id;

        Worker(int id) {
            this.id = id;
            setName("Thread-" + id);
        }

        @Override
        public void run() {
            for (int i = 0; i <= 50; i++) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j <= 50; j++) {
                    if (j == i) {
                        line.append(">");
                    } else {
                        line.append(".");
                    }
                }
                System.out.println(getName() + " " + line);
                try {
                    Thread.sleep(100 + (int)(Math.random() * 200));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(getName() + " finished");
        }
    }

    public static void main(String[] args) {
        int numThreads = 5;
        for (int i = 1; i <= numThreads; i++) {
            new Worker(i).start();
        }
    }
}
