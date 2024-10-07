package hu.margareta.bejegyzes;

import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private Integer likeok=0;
    private LocalDateTime letrejott = LocalDateTime.now();
    private LocalDateTime szerkesztve = LocalDateTime.now();

    public Bejegyzes(String szerzo,String tartalom){
        this.szerzo = szerzo;
        this.tartalom = tartalom;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public Integer getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        this.szerkesztve = LocalDateTime.now();
    }

    public void like(){
        this.likeok++;
    }

    @Override
    public String toString() {
        if(letrejott != szerkesztve){
            return
                    szerzo + '-' + likeok + letrejott + '\''+
                            ", Szerkesztve: " + szerkesztve + '\'' +
                            tartalom ;
        }
        return
                szerzo + '-' + likeok + letrejott + '\''+
                        tartalom ;
    }
}
