package info.lma1980.example;
import picocli.CommandLine;
@CommandLine.Command(name = "HelloWord", mixinStandardHelpOptions = true, version = "1.0")
public class Helloworld implements Runnable {
    @Override
    public void run() {
        System.out.println("HelloWorld!");
    }
    public static void main(String... args) {
        new CommandLine(new Helloworld()).execute(args);
    }
}
