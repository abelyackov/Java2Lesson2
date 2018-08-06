public class Bmi {
    int weight;
    double height;
    int bmi;

    public Bmi(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Bmi() {

    }

    public void parseString(String s) {
        int tmp1;
        double tmp2;
        int index1 = 1;
        int index2 = 0;
        String tmpString1;
        String tmpString2;

        while (true) {
            tmpString2 = String.valueOf(s.charAt(index2));

            do {
                tmpString1 = String.valueOf(s.charAt(index1));
                tmpString2 += tmpString1;
                index1++;
            } while (s.charAt(index1) != ' ');

            tmp1 = Integer.parseInt(tmpString2);

            index2 = index1;
            tmpString2 = String.valueOf(s.charAt(index2));

            do {
                tmpString1 = String.valueOf(s.charAt(index2));
                tmpString2 += tmpString1;
                index2++;
            } while (s.charAt(index2) != '\n');

            tmp2 = Double.parseDouble(tmpString2);

            index1 = index2 + 2;
            index2 = index2 + 1;

            System.out.println(bmi(tmp1,tmp2));
        }
    }

    public double bmi(int weight, double height) {
        return weight / (height * height);
    }
}
