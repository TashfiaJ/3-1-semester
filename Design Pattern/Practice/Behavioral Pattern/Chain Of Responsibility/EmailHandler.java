public class EmailHandler implements Chain{
    private Chain nextChain;
    @Override
    public void setNextChain (Chain nextChain) {
        this.nextChain = nextChain;
    }


    @Override
    public void messagePassing(Message msg) {

        if(msg.getMessage()=="email"){
            System.out.println("This message will be handled by email.");
        }
        else{
            nextChain.messagePassing(msg);
        }

    }
}
