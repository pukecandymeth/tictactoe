import java.util.Scanner;
class ttt2 {
    public static int isFull(String[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == null || grid[i][j].isEmpty())
                    return 0; // Not full
            }
        }
        return 1; // Full
    }

    public static void printGrid(String[][] grid) {
        System.out.println("\t\t\t   " + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2]);
        System.out.println("\t\t\t" + "--+--+--");
        System.out.println("\t\t\t   " + grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2]);
        System.out.println("\t\t\t" + "--+--+--");
        System.out.println("\t\t\t   " + grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2] + "\n");
    }

    public static void place(String[][] grid, int position, String symbol) {
        switch (position) {
            case 1: 
                grid[0][0] = symbol; 
                break;
            case 2: 
                grid[0][1] = symbol;
                break;
            case 3: 
                grid[0][2] = symbol; 
                break;
            case 4: 
                grid[1][0] = symbol; 
                break;
            case 5:     
                grid[1][1] = symbol; 
                break;
            case 6: 
                grid[1][2] = symbol; 
                break;
            case 7:     
                grid[2][0] = symbol; 
                break;
            case 8: 
                grid[2][1] = symbol; 
                break;
            case 9: 
                grid[2][2] = symbol; 
                break;
            default: 
                System.out.println("Invalid"); 
                break;
        }
    }

    public static boolean isPositionEmpty(String[][] grid, int position) {
        switch (position) {
            case 1: 
                return grid[0][0] == null || grid[0][0].isEmpty();
            case 2: 
                return grid[0][1] == null || grid[0][1].isEmpty();
            case 3: 
                return grid[0][2] == null || grid[0][2].isEmpty();
            case 4: 
                return grid[1][0] == null || grid[1][0].isEmpty();
            case 5: 
                return grid[1][1] == null || grid[1][1].isEmpty();
            case 6: 
                return grid[1][2] == null || grid[1][2].isEmpty();
            case 7: 
                return grid[2][0] == null || grid[2][0].isEmpty();
            case 8: 
                return grid[2][1] == null || grid[2][1].isEmpty();
            case 9: 
                return grid[2][2] == null || grid[2][2].isEmpty();
            default: 
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("\t\t\tTIC TAC TOE\n");
        Scanner scan = new Scanner(System.in);
        int turn = 0;
        String symbol;
        String[][] grid = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = "";
            }
        }

        do {
            printGrid(grid); 
            symbol = (turn == 0) ? "X" : "O";
            System.out.println("\nPlayer:" + symbol);
            System.out.println("\nWhere to place your " + symbol + "? (CHOOSE FROM 1-9)");

            int position = scan.nextInt();

            if (isPositionEmpty(grid, position)) {
                place(grid, position, symbol);
                turn = 1 - turn;
            } else {
                System.out.println("Choose another.");
            }
        } while (isFull(grid) == 0);

        printGrid(grid);
        System.out.println("\nGame Over");
        scan.close();
    }
}