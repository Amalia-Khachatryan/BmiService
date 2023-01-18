public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculator(65, 165);
        System.out.println("Индекс массы тела (65 кг,165 см): " + bmi);
//        System.out.println("Индекс массы тела (50.5 кг,160.4 см): " +  service.calculator(50.5,160.4));
//        System.out.println("Индекс массы тела (80 кг,180 см): " + service.calculator(80,180));
    }
}
