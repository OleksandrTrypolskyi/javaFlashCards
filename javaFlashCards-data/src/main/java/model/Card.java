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
    @Column(name = "creation_time")
    private LocalDateTime creationTime;
    @Column(name = "last_review")
    private LocalDateTime lastReviewTime;
    @ManyToOne
    @JoinColumn(name = "deck_id")
    private Deck deck;

    @Builder
    public Card(Long id, String originalText, String translatedText,
                LocalDateTime creationTime, LocalDateTime lastReviewTime,
                Deck deck) {
        super(id);
        this.originalText = originalText;
        this.translatedText = translatedText;
        this.creationTime = creationTime;
        this.lastReviewTime = lastReviewTime;
        this.deck = deck;
    }
}
