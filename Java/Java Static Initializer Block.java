static int B, H;
static boolean flag = true;
static {

Scanner scan = new Scanner(System.in);
         B = scan.nextInt();
         H = scan.nextInt();
        scan.close();
    try {
  if (B <= 0 || H <= 0)
   throw new Exception("Breadth and height must be positive");
 } catch (Exception e) {
  System.out.println(e);
  System.exit(0);
 }
}
