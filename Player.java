import javax.tools.Tool;
import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orijinalHealth;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;


    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};

        System.out.println("-------------------------------------------------------");

        for (GameChar gameChar : charList) {
            System.out.println("ID: " + gameChar.getId() +
                    "\t Karakter: " + gameChar.getName() +
                    "\t Hasar: " + gameChar.getDamage() +
                    "\t Sağlık: " + gameChar.getHealth() +
                    "\t Para: " + gameChar.getMoney());
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("Lütfen bir karakter seçiniz: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }

        /*System.out.println("Karakter: " + this.getCharName() +
               "Hasarınız: " + this.getDamage() +
               ", Sağlık: " + this.getHealth() +
               ", Para: " + this.getMoney());*/
    }

    public void printInfo(){
        System.out.println("Silah: " +this.getInventory().getWeapon().getName()+
                ", Zırh: " + this.getInventory().getArmor().getName() +
                ", Bloklama: " +this.getInventory().getArmor().getBlock()+
                ", Hasarınız: " + this.getTotalDamage() +
                ", Sağlık: " + this.getHealth() +
                ", Para: " + this.getMoney());
    }


    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrijinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getHealth());
        this.setCharName(gameChar.getName());
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }
}
