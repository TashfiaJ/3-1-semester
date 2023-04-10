public class Main {
    public static void main(String[] args) {
        Chain chain1 = new PhoneHandler();
        Chain chain2 = new EmailHandler();
        Chain chain3 = new LiveChatHandler();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        Message msg = new Message("live chat");
        Message msg1 = new Message("email");
        chain1.messagePassing(msg);
        chain2.messagePassing(msg1);
    }
}
