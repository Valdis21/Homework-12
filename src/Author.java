public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName();
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Author author = (Author) object;
        return java.util.Objects.equals(name, author.name) && java.util.Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), name, lastName);
    }
}
