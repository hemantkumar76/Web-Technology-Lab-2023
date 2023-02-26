class _6 {
    public static void main(String args[]) {
        int x = 0, y = 1, z;
        int i;
        int count = 0;
        System.out.print(x + " " + y);

        for (i = 2; i < count; ++i) {
            z = x + y;
            System.out.println(+z);
            x = y;
            y = z;
        }

    }
}