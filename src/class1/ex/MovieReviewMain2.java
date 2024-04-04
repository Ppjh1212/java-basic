package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];
        
        MovieReview parkpark = new MovieReview();
        parkpark.title = "파크파크";
        parkpark.review = "정말 재밌었어요.";
        reviews[0] = parkpark;

        MovieReview pikupiku = new MovieReview();
        pikupiku.title = "피쿠피쿠";
        pikupiku.review = "정말 무서웠어요.";
        reviews[1] = pikupiku;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목 : " + review.title + ", 리뷰 : " + review.review);

        }

    }
}
