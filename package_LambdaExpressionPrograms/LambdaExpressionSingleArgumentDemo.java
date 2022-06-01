package package_LambdaExpressionPrograms;

interface Sayble {

    public String say(String name, String working);
}

public class LambdaExpressionSingleArgumentDemo {

    public static void main(String[] args) {
        Sayble s1 = (name, working) -> {
            return "Hello, " + name + ". It is " + working + " Firm .";
        };
        System.out.println(s1.say("FUEL, Pune", "Java Training"));

        Sayble s2 = (name, working) -> {
            return "Hello, " + name + ". It is offered" + working;
        };
        System.out.println(s2.say("Deogiri College", " B.Tech ."));
    }
}
