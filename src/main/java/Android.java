public class Android extends Mobile{

    @Override
    public void call(String message){
        System.out.print("<Android>");
        super.call(message);
    }

    @Override
    public void getMobileSpecs(){
        System.out.println("name: " + getName() + ", color: " + getColor() + ", brand: " + getBrand());
    }
}
