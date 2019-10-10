public class Iphone extends Mobile {

    @Override
    public void call(String message){

        System.out.print("<Iphone>");
        super.call(message);
    }

    @Override
    public void getMobileSpecs(){
        System.out.println("name: " + getName() + ", color: " + getColor() + ", brand: " + getBrand());
    }
}
