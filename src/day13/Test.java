package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Ivan Duran");
        User user2 = new User("Egor Creed");
        User user3 = new User("Tito Arteries");

        user1.sendMessage(user2, "Hello , my dear friend!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi, Ivan");
        user2.sendMessage(user1, "I am fine!");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Hey, my name is Tito");
        user3.sendMessage(user1, "Do you remember me?");
        user3.sendMessage(user1, "We went to the same school");

        user1.sendMessage(user3, "Of course I remember you ;-) ");

        MessageDatabase.showDialog(user1,user3);
    }
}
