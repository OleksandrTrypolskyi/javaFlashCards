package model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Deck extends BaseEntity{
    private String name;
    private Set<Card> cards = new HashSet<>();

    @Builder
    public Deck(Long id, String name, Set<Card> cards) {
        super(id);
        this.name = name;
        this.cards = cards;
    }
}
