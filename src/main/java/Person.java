public class Person {
    private String name;
    private Mobile mobile;

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message){
        mobile.call(message);
    }
}
