public class Android extends Mobile{

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message){
        System.out.print("<Android>");
        if(message.length() > 25){
            System.out.println("Message cannot be sent");
            return;
        }
        super.call(message);
    }

    @Override
    public void getMobileSpecs(){
        super.getMobileSpecs();
    }
}
