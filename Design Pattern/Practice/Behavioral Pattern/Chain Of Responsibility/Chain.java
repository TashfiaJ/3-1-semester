public interface Chain {
    public void setNextChain(Chain nextChain);

    public void messagePassing(Message msg);
}
