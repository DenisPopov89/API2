import org.example.FormDate;
import org.example.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setName("Иван");
        post.setSurname("Иванов");
        post.setPatronymic("Иванович");
        post.setPassport("4444 № 44444444");
        post.setPhone("+7 (999)-999-99-99");
        post.setSubscription(true);

        FormDate birthday = new FormDate(13, 6, 1999);
        post.setBirthday(birthday);
    }
}