package model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Card extends BaseEntity {
    private String originalText;
    private String translatedText;
    private LocalDateTime creationTime;
    private LocalDateTime last_reviewTime;
    private Deck deck;

    @Builder
    public Card(Long id, String originalText, String translatedText,
                LocalDateTime creationTime, LocalDateTime last_reviewTime,
                Deck deck) {
        super(id);
        this.originalText = originalText;
        this.translatedText = translatedText;
        this.creationTime = creationTime;
        this.last_reviewTime = last_reviewTime;
        this.deck = deck;
    }
}
