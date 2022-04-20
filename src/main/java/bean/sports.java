package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports")
public class sports {
    @Id
    @Column(name = "name of the sport")
    private String nameofsport;

    @Column(name = "time")
    private String time;

    @Column(name = "number of players")
    private String numberofplayers;

    public String getNameofsport() {
        return nameofsport;
    }

    public void setNameofsport(String nameofsport) {
        this.nameofsport = nameofsport;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumberofplayers() {
        return numberofplayers;
    }

    public void setNumberofplayers(String numberofplayers) {
        this.numberofplayers = numberofplayers;
    }
}
