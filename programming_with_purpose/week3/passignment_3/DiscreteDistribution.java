public class DiscreteDistribution {
    public static void main(String[] args) {
        int numofidx = Integer.parseInt(args[0]);

        int[] dist = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            dist[i - 1] = Integer.parseInt(args[i]);
        }

        int sum = 0;
        for (int v : dist) {
            sum += v;
        }

        // System.out.println(sum);

        // cumsum
        int[] cumsum = new int[dist.length];
        cumsum[0] = dist[0];
        for (int i = 1; i < dist.length; i++) {
            cumsum[i] = cumsum[i - 1] + dist[i];
        }

        int[] outidx = new int[numofidx];
        for (int i = 0; i < numofidx; i++) {
            double idx = Math.random() * cumsum[dist.length - 1];
            for (int j = 0; j < cumsum.length; j++) {
                if (idx < cumsum[j]) {
                    // System.out.print(j + "=" + cumsum[j] + " ");
                    outidx[i] = j + 1;
                    break;
                }
            }
        }

        for (int v : outidx) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

}
