package bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "player")

public class Player implements Serializable {

    @Id
    @GeneratedValue
            @Column(name = "id")
            private long playerId;
    @Column(name = "name")

    private String name = "";

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    private  servicedetails servicedetails;


    @Column(name = " sport")
    private String sport;

    @Column(name = "coach")
    private String coach;

    @Column(name = "contact number")
    private String contactnumber;


    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
}
