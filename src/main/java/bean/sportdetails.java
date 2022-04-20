package bean;

import javax.persistence.*;

@Entity
@Table(name = "sportdetails")
public class sportdetails {
    @Id
    @GeneratedValue
    @Column(name = "Player BookingId")
    private String PlayerBookingId;

    @Column(name = "userId")
    private String userId;

    @Column(name = "serviceId")
    private String serviceId;

    @Column(name = "status")
    private String status;

    public String getPlayerBookingId() {
        return PlayerBookingId;
    }

    public void setPlayerBookingId(String playerBookingId) {
        PlayerBookingId = playerBookingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
