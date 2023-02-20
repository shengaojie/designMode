package behavior.observer;


public interface Subject {

    //添加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知所有的订阅者更新消息
    void notify(String message);
}
