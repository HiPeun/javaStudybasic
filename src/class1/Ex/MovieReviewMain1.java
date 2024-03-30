package class1.Ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {


        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한은 for문";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title ="어바웃 타임";
        aboutTime.review = "시간 여행 영화";

        System.out.println("영화 제목:" + inception.title + ", 리뷰 : " + inception.review);
        System.out.println("영화 제목:" + aboutTime.title + ", 리뷰 : " + aboutTime.review);
    }
}