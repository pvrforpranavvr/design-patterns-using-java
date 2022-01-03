package creational.builder;

public class BuilderPattern {

    private String name;
    private int age;

    public BuilderPattern(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class Builder {

        private String name;
        private int age;


        public Builder() {
        }

        public Builder name(String name) {

            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderPattern build() {

            return new BuilderPattern(name, age);
        }


    }

    public static Builder builder() {

        return new Builder();
    }
}
