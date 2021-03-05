package az.enkapsulyasiya;
/**
 *
 * @author NUBAR
 */
public class Masin {
   private String color="mavi";
   private int power=700;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("masinin rengi");
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power>100 && power<0) {
            System.out.println("bele guc mumkun deyil");
        } else {
            System.out.println("masinin gucu ");
              this.power = power;
        }
//        this.power = power;
    }
}
