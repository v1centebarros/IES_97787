package pt.ua.deti.ies.lab2_4.lab2_4;

public class Show {
    private String name;
    private String slug;

    Show(int id, String name, String slug) {
        this.name = name;
        this.slug = slug;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }


}
