class ConsoleLogger implements observer{

  public void observe(Message message){
    System.out.println(message);
  }
}
