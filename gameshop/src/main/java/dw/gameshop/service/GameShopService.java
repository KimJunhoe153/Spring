package dw.gameshop.service;

import dw.gameshop.exception.ResourceNotFoundException;
import dw.gameshop.model.Game;
import dw.gameshop.model.User;
import dw.gameshop.repository.GameShopRepository;
import dw.gameshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameShopService {
    GameShopRepository gameShopRepository; // 게임 데이터에 접근히기 위한 레포지토리 인터페이스
    UserRepository userRepository; // 사용자 데이터에 접근하기 위한 레포지토리 인터페이스

    public GameShopService(GameShopRepository gameShopRepository, UserRepository userRepository) {
        // 서비스를 생성할 때 게임과 사용자 관련 레포지토리 인터페이스를 초기화. 의존성 주입을 통해 구현됨.
        this.gameShopRepository = gameShopRepository;
        this.userRepository = userRepository;
    }

    public List<Game> getAllGames() { // 반환타입 : 게임 전체 목록을 반환한다.
        return gameShopRepository.findAll(); // 데이터베이스에서 모든 게임 목록을 조회
    }

    public Game getGameById(long id) { // Game(반환타입) : 특정 ID를 가진 게임을 반환함
        Optional<Game> gameOptional = gameShopRepository.findById(id); // 결과가 없는 경우(null)를 안전하게 처리
        if (gameOptional.isPresent()) {
            return gameOptional.get();
        } else {
            return null;
        }
    }

    public Game updateGameById(long id, Game game) { // Game(반환타입) : 특정 ID를 가진 게임을 반환
        Optional<Game> gameOptional = gameShopRepository.findById(id);
        if (gameOptional.isPresent()) {
            Game temp = gameOptional.get();
            temp.setTitle(game.getTitle());
            temp.setGenre(game.getGenre());
            temp.setPrice(game.getPrice());
            temp.setImage(game.getImage());
            temp.setText(game.getText());
            gameShopRepository.save(temp);
            return temp;
        } else {
            return null;
        }
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // 제일 비싼 게임의 정보
    public Game getGameWithMaxPrice() {
        List<Game> games = gameShopRepository.findAll();
        //  람다식이 아닌 일반 Java코드 사용 예
//        if (games.size() <= 0) {
//            throw new ResourceNotFoundException("Max Price", " ", " ");
//        }
//        Game max = games.get(0);
//        for (int i = 0; i < games.size(); i++) {
//            if (games.get(i).getPrice() > games.get(i + 1).getPrice()) {
//                max = games.get(i);
//            }
//        }
//        return max;

        //  람다식 사용 예
        return games.stream()
                .sorted(Comparator.comparingInt((Game game) -> game.getPrice())
                        .reversed()).findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Max Price", " ", " "));
    }

    // 제일 비싼 게임 Top 3
    public List<Game> getGameWithMaxPriceTop3() {
        List<Game> games = gameShopRepository.findAll();
//        games.sort(Comparator.comparingInt((Game game) -> game.getPrice()).reversed()); // sort 쓰는 법 외우자
//        List<Game> newGames = new ArrayList<>();
//        newGames.add(games.get(0));
//        newGames.add(games.get(1));
//        newGames.add(games.get(2));
//        return newGames;

//        return games.stream()
//                .sorted(Comparator.comparingInt(Game::getPrice).reversed())
//                .limit(3)
//                .collect(Collectors.toList());
//    }

        // JPQL로 사용 예
        return gameShopRepository.getGameWithMaxPriceTop3()
                .stream().limit(3).collect(Collectors.toList());
    }
}

// Optional 사용 : 'findById'메소드가 반환하는 'Optional'객체를 사용하여 게임 정보가 존재하지 않을 때의 예외처리를 구현
// 업데이트 로직 : 게임 정보를 업데이트할 때 기존의 객체를 가져와서 필드를 하나씩 수정한 다음 저장하는 방식을 사용