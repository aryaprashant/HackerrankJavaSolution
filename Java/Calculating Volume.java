class Calculate {
 VolumeCalculator output;
 BufferedReader br;
 Calculate() {
  br = new BufferedReader(new InputStreamReader(System.in));

  output = new VolumeCalculator();
 }
 static VolumeCalculator do_calc() {
  return new VolumeCalculator();

 }
 public int get_int_val() throws NumberFormatException, IOException {
  return Integer.parseInt(br.readLine().trim());
 }
 public double get_double_val() throws NumberFormatException, IOException {
  return Double.parseDouble(br.readLine());
 }


}
class VolumeCalculator {

 public double get_volume(int a) {
  if (a < -100 || a > 100)
   throw new NumberFormatException("Out of range");
  if (a <= 0) {
   //System.exit(0);
   throw new NumberFormatException("All the values must be positive");
  }

  return a * a * a;

 }

 public double get_volume(double r, double h) {
  if (r < -100 || r > 100 || h < -100 || h > 100)
   throw new NumberFormatException("Out of range");
  if (r <= 0 || h <= 0)
   throw new NumberFormatException("All the values must be positive");

  return Math.PI * r * r * h;
 }

 public double get_volume(double r) {
  if (r < -100 || r > 100)
   throw new NumberFormatException("Out of range");
  if (r <= 0)
   throw new NumberFormatException("All the values must be positive");
  return ((double) 2 / 3) * Math.PI * r * r * r;
 }

 public double get_volume(int l, int b, int h) {
  if (l < -100 || l > 100 || b < -100 || b > 100 || h < -100 || h > 100)
   throw new NumberFormatException("Out of range");
  if (l <= 0 || b <= 0 || h <= 0)
   throw new NumberFormatException("All the values must be positive");
  return l * b * h;
 }
 public void display(double volume) {
  System.out.printf("%.3f\n", volume);

 }

}