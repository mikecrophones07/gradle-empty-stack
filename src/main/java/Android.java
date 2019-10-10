public class Android extends Mobile{

    @Override
    public void call(String message){
        System.out.print("<Android>");
        if(message.length() > 10){
            System.out.println("Message cannot be sent");
            return;
        }
        super.call(message);
    }
}
