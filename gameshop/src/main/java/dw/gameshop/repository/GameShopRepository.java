package dw.gameshop.repository;

import dw.gameshop.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameShopRepository extends JpaRepository<Game, Long> { // Entity, Primary key
    @Query("select g1 from Game g1 where g1.price = (select MAX(g2.price) from Game g2)")
    Game getGameWithMaxPrice();

    @Query("select g1 from Game g1 order by g1.price desc")
    public List<Game> getGameWithMaxPriceTop3();
}
