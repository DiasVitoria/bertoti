import java.util.List;

public class Chamado {

    private List<Observer> observers;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String msg){
        observers.stream().forEach((k) -> {
            k.notify(msg);
        });
    }

    public void avaliarChamado(String msg){
        notifyObservers(msg);
    }
}