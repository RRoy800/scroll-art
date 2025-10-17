import java.util.Random;


public class Ascii {


    static final int WIDTH = getTerminalWidth() - 1;
    static final int GEM_WIDTH = 10;
    static final int GEM_HEIGHT = 8;
    static final Random rand = new Random();





    public static void main(String[] args) throws InterruptedException {
        while(true){
            char[][] img = GEM();
            int spaces = rand.nextInt(WIDTH);
            for (int y = 0; y < GEM_HEIGHT; y = y + 1){
                System.out.print(" ".repeat(spaces));
                for (int x = 0; x < GEM_WIDTH; x = x + 1){
                    System.out.print(img[y][x]);
                }
                System.out.println();
            }
            Thread.sleep(200);
        }
    }
       static char[][] GEM () {
        char[][] img = new char[GEM_HEIGHT][GEM_WIDTH];
        for (int y = 0; y < GEM_HEIGHT; y = y + 1) {
            for (int x = 0; x < GEM_WIDTH; x = x + 1) {
                img[y][x] = ' ';
            }
        }
        img[0][2] = '_';
        img[0][3] = '_';
        img[0][4] = '_';
        img[0][5] = '_';
        img[0][6] = '_';
        img[0][7] = '_';

        img[1][1] = '/';
        img[1][2] = '_';
        img[1][3] = '_';
        img[1][4] = '_';
        img[1][5] = '_';
        img[1][6] = '_';
        img[1][7] = '_';
        img[1][8] = '\\';

        img[2][0] = '/';
        img[2][1] = '/';
        img[2][3] = 'R';
        img[2][4] = 'R';
        img[2][8] = '\\';
        img[2][9] = '\\';

        img[3][0] = '\\';
        img[3][1] = '\\';
        img[3][8] = '/';
        img[3][9] = '/';

        img[4][1] = '\\';
        img[4][2] = '\\';
        img[4][5] = 'R';
        img[4][6] = 'R';
        img[4][7] = '/';
        img[4][8] = '/';

        img[5][2] = '\\';
        img[5][3] = '\\';
        img[5][6] = '/';
        img[5][7] = '/';

        img[6][3] = '\\';
        img[6][4] = '\\';
        img[6][5] = '/';
        img[6][6] = '/';

        img[7][4] = '\\';
        img[7][5] = '/';




        return img;
    }
     public static int getTerminalWidth() {
        String os = System.getProperty("os.name").toLowerCase();


        if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            return getUnixTerminalWidth();
        } else {
            return 80;
        }
    }
    private static int getUnixTerminalWidth() {
        try {
           
            String columns = System.getenv("COLUMNS");
            if (columns != null && !columns.isEmpty()) {
                return Integer.parseInt(columns);
            }


            ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "stty size </dev/tty");
            pb.redirectErrorStream(true);
            Process process = pb.start();
            java.io.BufferedReader reader = new java.io.BufferedReader(
                    new java.io.InputStreamReader(process.getInputStream()));
            String output = reader.readLine();
            if (output != null && !output.isEmpty()) {
                String[] parts = output.trim().split(" ");
                return Integer.parseInt(parts[1]);
            }
        } catch (Exception ignored) {
           
        }
        return 80;
    }
}


