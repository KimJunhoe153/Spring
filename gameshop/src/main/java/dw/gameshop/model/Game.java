package dw.gameshop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100)
    private String title;
    @Column(length = 100)
    private String genre;
    @Column
    private int price;
    @Column(length = 65535)
    private String image;
    @Column(length = 65535)
    private String text;

    public Game() {
        super();
    }

    public Game(long id, String title, String genre, int price,
                String image, String text) {
        super();
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.image = image;
        this.text = text;
    }

}
