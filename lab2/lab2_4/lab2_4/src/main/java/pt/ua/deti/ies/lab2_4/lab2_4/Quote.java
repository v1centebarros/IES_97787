package pt.ua.deti.ies.lab2_4.lab2_4;

public class Quote {
    private String quote;
    private String role;
    private String show;

    public Quote(String quote, String role, String show) {
        this.quote = quote;
        this.role = role;
        this.show = show;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quote='" + quote + '\'' +
                ", role='" + role + '\'' +
                ", show='" + show + '\'' +
                '}';
    }
}
