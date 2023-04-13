public class App {
    public static void main(String[] args) throws Exception {
        double [] list = {1,2,3,4,5};
        double sum = 0.0;

        for(int i = 0; i< list.length; i++){
            sum += 1 /list[i];
        }

        System.out.println("Harmonik Ortalama : " + list.length / sum);
    }
}
