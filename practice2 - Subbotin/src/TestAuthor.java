public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Ivan Popov", "ivPopov@somewhere.com", 'm');

        System.out.println(author);
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());

        author.setEmail("anIvanova@somewhere.com");
        
        System.out.println(author.getEmail());
    }
}
