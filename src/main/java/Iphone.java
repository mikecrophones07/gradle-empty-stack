public class Iphone extends Mobile {

    @Override
    public void call(String message){
        System.out.print("<Iphone>");
        super.call(message);
    }
}
