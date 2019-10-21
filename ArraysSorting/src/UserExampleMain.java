public class UserExampleMain {
    public static void main(String[] args) {
        UserExample myUser = new UserExample();
        myUser.setName("Sibel");
        myUser.setAge(28);
        myUser.setAdress("Orlando");
        myUser.setEmai("sibelguler@gmail.com");
        myUser.setLastName("Tas");

        UserSave mySave = new UserSave();
        mySave.save(myUser);

        for (UserExample user : DbClass.userList) {
            System.out.println(user.getName());
            System.out.println(user.getAdress());
            System.out.println(user.getAge());
            System.out.println(user.getEmail());
            System.out.println(user.getLastName());
        }

    }
}
