class Caretaker{

  ArrayList<observer>observers

  add(Message message){
    caretaker.add(message);
    observers.parallelStream().forEach(observer)->observer.observe(message);
  }

  Caretaker(){
    this.observers = new Arraylist();
    this.observers.add(new ConsoleLogger);
  }
}
