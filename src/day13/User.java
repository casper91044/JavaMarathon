package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User currentUser : subscriptions) {
            if(currentUser.getUserName().equals(user.getUserName()))
                return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User { " +
                "userName='" + userName + '\'' +
                '}';
    }

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

}
