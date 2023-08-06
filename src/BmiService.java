public class BmiService {
    public int anthropometry (int weight, double height){
        double index;
        index = weight / (height * height);
        return (int) index;
    }
}
