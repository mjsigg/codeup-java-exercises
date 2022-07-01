package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = getName(name);
        this.category = getCategory(category);
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory(String category) {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
