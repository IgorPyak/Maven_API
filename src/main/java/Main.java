public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Игорь";
        post.passport = "18 16 345679";
        post.patronymic = "Вильгельмович";
        post.phone = "+7 (937) 999-99-99";
        post.surname = "Шпак";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 26;
        post.birthday.month = 11;
        post.birthday.year = 1998;
    }
}
