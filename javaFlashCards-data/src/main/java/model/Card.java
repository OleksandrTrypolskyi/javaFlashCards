package model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cards")
public class Card extends BaseEntity {
    @Column(name = "original_text")
    private String originalText;
    @Column(name = "translated_text")
    private String translatedText;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_review_at")
    private LocalDateTime lastReviewAt;
    @ManyToOne
    @JoinColumn(name = "deck_id")
    private Deck deck;

    @Builder
    public Card(Long id, String originalText, String translatedText,
                LocalDateTime createdAt, LocalDateTime lastReviewAt,
                Deck deck) {
        super(id);
        this.originalText = originalText;
        this.translatedText = translatedText;
        this.createdAt = createdAt;
        this.lastReviewAt = lastReviewAt;
        this.deck = deck;
    }
}
