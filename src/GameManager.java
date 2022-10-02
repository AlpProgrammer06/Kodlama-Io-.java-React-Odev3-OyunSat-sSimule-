public class GameManager implements IGameSevice{
    public void add(Game game){
        System.out.println(game.getGameName() +  " oyunu " + game.getPrice() + " tl fiyatla eklendi ");
    }
    public void update(Game game){
        System.out.println(game.getGameName() + " oyunu " + game.getPrice() + "tl fiyatla güncellendi ");
    }
    public  void delete(Game game){
        System.out.println(game.getGameName() + " oyunu" + " silindi ");
    }
}
