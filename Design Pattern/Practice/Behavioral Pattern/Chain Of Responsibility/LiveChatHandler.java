public class LiveChatHandler implements Chain {
    private Chain nextChain;
    @Override
    public void setNextChain (Chain nextChain) {
        this.nextChain = nextChain;
    }


    @Override
    public void messagePassing(Message msg) {

        if(msg.getMessage()=="live chat"){
            System.out.println("This message will be handled by live chat.");
        }
        else{
            System.out.println("This only handles phone, email or live chat problems.");
        }

    }
}
