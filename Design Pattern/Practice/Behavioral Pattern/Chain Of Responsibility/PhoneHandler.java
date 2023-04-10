public class PhoneHandler implements Chain{
    private Chain nextChain;
    @Override
    public void setNextChain (Chain nextChain) {
        this.nextChain = nextChain;
    }


    @Override
    public void messagePassing(Message msg) {


        if(msg.getMessage().equals("phone")){
            System.out.println("This message will be handled by phone.");
        }
        else{
            nextChain.messagePassing(msg);
        }

    }
}
