package tasks;

public class tasks1 {
    public static void main(String[] args) {
        System.out.printf("Task 1\n5 gallons -> %.3f l\n", convert(5));
        System.out.printf("3 gallons -> %.3f l\n", convert(3));
        System.out.printf("8 gallons -> %.3f l\n", convert(8));

        System.out.printf("\nTask 2\n15 min, 1 intensity -> %d calories\n", fitCalc(15, 1));
        System.out.printf("24 min, 2 intensity -> %d calories\n", fitCalc(24, 2));
        System.out.printf("41 min, 3 intensity -> %d calories\n", fitCalc(41, 3));

        System.out.printf("\nTask 3\n3 boxes, 4 bags, 2 barrels -> %d goods\n", containers(3, 4, 2));
        System.out.printf("5 boxes, 0 bags, 2 barrels -> %d goods\n", containers(5, 0, 2));
        System.out.printf("4 boxes, 1 bags, 4 barrels -> %d goods\n", containers(4, 1, 4));

        System.out.printf("\nTask 4\nx = 5, y = 5, z = 5 -> %s\n", triangleType(5, 5, 5));
        System.out.printf("x = 5, y = 4, z = 5 -> %s\n", triangleType(5, 4, 5));
        System.out.printf("x = 3, y = 4, z = 5 -> %s\n", triangleType(3, 4, 5));
        System.out.printf("x = 5, y = 1, z = 1 -> %s\n", triangleType(5, 1, 1));

        System.out.printf("\nTask 5\nb = 8, a = 4 -> %d\n", ternaryEvaluation(8, 4));
        System.out.printf("b = 1, a = 11 -> %d\n", ternaryEvaluation(1, 11));
        System.out.printf("b = 5, a = 9 -> %d\n", ternaryEvaluation(5, 9));

        System.out.printf("\nTask 6\nn = 22, w = 1.4, h = 2 -> %d items\n", howManyItems(22, 1.4f, 2f));
        System.out.printf("n = 45, w = 1.8, h = 1.9 -> %d items\n", howManyItems(45, 1.8f, 1.9f));
        System.out.printf("n = 100, w = 2, h = 2 -> %d items\n", howManyItems(100, 2f, 2f));

        System.out.printf("\nTask 7\n3! -> %d\n", factorial(3));
        System.out.printf("5! -> %d\n", factorial(5));
        System.out.printf("7! -> %d\n", factorial(7));

        System.out.printf("\nTask 8\nGCD(48, 18) -> %d\n", gcd(48, 18));
        System.out.printf("GCD(52, 8) -> %d\n", gcd(52, 8));
        System.out.printf("GCD(259, 28) -> %d\n", gcd(259, 28));

        System.out.printf("\nTask 9\n70, 1500 -> %d\n", ticketSeller(70, 1500));
        System.out.printf("24, 950 -> %d\n", ticketSeller(24, 950));
        System.out.printf("53, 1250 -> %d\n", ticketSeller(53, 1250));

        System.out.printf("\nTask 10\n5 students, 2 tables -> %d table(s) needed\n", tables(5, 2));
        System.out.printf("31 students, 20 tables -> %d table(s) needed\n", tables(31, 20));
        System.out.printf("123 students, 58 tables -> %d table(s) needed\n", tables(123, 58));
    }
    public static float convert(int gal)
    {
        return gal * 3.785f;
    }
    public static int fitCalc(int time, int intensity)
    {
        return time * intensity;
    }
    public static int containers(int boxes, int bags, int barrels)
    {
        return boxes * 20 + bags * 50 + barrels * 100;
    }
    public static String triangleType(int x, int y, int z)
    {
        if (x + y > z && x + z > y && y + z > x)
        {
            if (x == y && y == z)
            {
                return "isosceles";
            }
            if (x == y || x == z || y == z)
            {
                return "equilateral";
            }
            return "different-sided";
        }
        return "not a triangle";
    }
    public static int ternaryEvaluation(int a, int b)
    {
        return a > b ? a : b;
    }
    public static int howManyItems(int m, float w, float h)
    {
        return (int) (m / (w * h * 2));
    }
    public static int factorial(int num)
    {
        int res = 1;
        for (int i = 1; i <= num; i++)
        {
            res *= i;
        }
        return res;
    }
    public static int gcd(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }
    public static int ticketSeller(int tickets, int price)
    {
        return Math.round(tickets * price - tickets * price * 0.28f);
    }
    public static int tables(int students, int tables)
    {
        int studentsWOTable = students - tables * 2;
        if (studentsWOTable < 1)
        {
            return 0;
        }
        return Math.round(studentsWOTable / 2f);
    }
}
