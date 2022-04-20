package bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Servicedetails")

public class servicedetails {

@Id
        @Column(name = "service_Id")
        private String  service_id;

        @Column(name = "sport_Id")
        private String  sport_id;

        @Column(name = "start time")
        private String start_time;

        @Column(name = "end time")
        private String end_time;

        @Column(name = "cost")
        private String cost;

        @Column(name = "total Players")
        private String total_players;

        public String getService_id() {
                return service_id;
        }

        public void setService_id(String service_id) {
                this.service_id = service_id;
        }

        public String getSport_id() {
                return sport_id;
        }

        public void setSport_id(String sport_id) {
                this.sport_id = sport_id;
        }

        public String getStart_time() {
                return start_time;
        }

        public void setStart_time(String start_time) {
                this.start_time = start_time;
        }

        public String getEnd_time() {
                return end_time;
        }

        public void setEnd_time(String end_time) {
                this.end_time = end_time;
        }

        public String getCost() {
                return cost;
        }

        public void setCost(String cost) {
                this.cost = cost;
        }

        public String getTotal_players() {
                return total_players;
        }

        public void setTotal_players(String total_players) {
                this.total_players = total_players;
        }
}
