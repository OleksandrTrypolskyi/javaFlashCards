package model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "decks")
public class Deck extends BaseEntity{
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deck")
    private Set<Card> cards = new HashSet<>();

    @Builder
    public Deck(Long id, String name, Set<Card> cards) {
        super(id);
        this.name = name;
        this.cards = cards;
    }
}
