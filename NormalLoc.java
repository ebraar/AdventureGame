public class NormalLoc extends Location {

    public NormalLoc(Player player) {
        super(player, player.getName());
    }

    @Override
    public boolean onLocation(){
        return true;
    }

}
