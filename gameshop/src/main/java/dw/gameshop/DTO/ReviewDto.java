package dw.gameshop.DTO;

import dw.gameshop.model.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter // DTO에서는 @NoArgsConstructor랑 @Setter를 잘 안쓴다
public class ReviewDto {
    private long gameId;
    private String gameName;
    private String userId;
    private int reviewPoint;
    private String reviewText;

    // Review 엔티티를 ReviewDto 타입으로 형변환하는 메서드
    // 이런 식의 형변환 코드를 내장하는 것이 더 효율적임
    public ReviewDto toReviewDtoFromReview(Review review) {
        ReviewDto reviewDto = new ReviewDto();
        reviewDto.setReviewPoint(review.getPoint());
        reviewDto.setReviewText(review.getReviewText());
        reviewDto.setGameId(review.getGame().getId());
        reviewDto.setGameName(review.getGame().getTitle());
        reviewDto.setUserId(review.getUser().getUserId());
        return reviewDto;
    }

    // ReviewDto를 Review 엔티티로 형변환하는 메서드
}
