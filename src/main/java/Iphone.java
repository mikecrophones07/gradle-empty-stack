public class Iphone extends Mobile {
    @Override
    public void call(String message){
        System.out.print("<Iphone>");
        if(message.length() > 15){
            System.out.println("Message cannot be sent");
            return;
        }
        super.call(message);
    }

}
