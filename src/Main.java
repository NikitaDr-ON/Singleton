public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        AnotherTest anotherTest = new AnotherTest();
        Logger.getLogger().classLog(test,"this is test");
        Logger.getLogger().classLog(anotherTest,"this is another test");
    }
}