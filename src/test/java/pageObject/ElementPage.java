package pageObject;

public class ElementPage {
    public String name() {
        return "#userName";
    }

    public String email() {
        return "#userEmail";
    }

    public String addressCurrent(){
        return "#currentAddress";
    }

    public String addressPermanent(){
        return "#permanentAddress";
    }

    public String submit(){
        return "#submit";
    }
}
