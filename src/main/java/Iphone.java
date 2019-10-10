public class Iphone extends Mobile {

    @Override
    public void call(String message){
        System.out.println("<Iphone>");
        super.call(message);
    }
}
