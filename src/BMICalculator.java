public class BMICalculator {
    double height;
    double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void BMI(double height, double weight) {
        double bmi = Math.round((weight / (height / 100 * height / 100) * 100.0)) / 100.0;
        if (bmi < 16.5) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (bmi < 18.49) {
            System.out.println("Недостаточная масса тела");
        } else if (bmi < 24.99) {
            System.out.println("Нормальная масса тела");
        } else if (bmi < 29.99) {
            System.out.println("Избыточная масса тела");
        } else if (bmi < 34.99) {
            System.out.println("Ожирение I степени");
        } else if (bmi < 39.99) {
            System.out.println("Ожирение II степени");
        } else {
            System.out.println("Ожирение III степени (морбидное)");
        }
    }
}
