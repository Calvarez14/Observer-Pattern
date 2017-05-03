interface Observable{

  public void observe(Message message);

  State rootLevel;

  String property = System.getPorperty("Log rot level")
  if(property.equals("Warning"))
    rootLevel = State.Warn;

    if(message.state => rootLevel)
    setProperty(Message)
}
