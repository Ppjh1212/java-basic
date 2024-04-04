package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview parkpark = new MovieReview();

        parkpark.title = "파크파크";
        parkpark.review = "정말 재밌었어요.";

        System.out.println("영화 제목 : " + parkpark.title + ", 리뷰 : " + parkpark.review);
    }
}
