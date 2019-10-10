public class Android extends Mobile{

    @Override
    public void call(String message){
        System.out.print("<Android>");
        super.call(message);
    }
}
