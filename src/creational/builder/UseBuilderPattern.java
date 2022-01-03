package creational.builder;

public class UseBuilderPattern {


    public static void main(String[] args) {

        BuilderPattern builderPattern = BuilderPattern.builder()
                .name("")
                .age(1)
                .build();
    }
}
