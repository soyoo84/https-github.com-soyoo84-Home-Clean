package homeclean;

public class 결제취소됨 extends AbstractEvent {

    private Long id;
    private String reservationId;


    public 결제취소됨(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getreservationId() {
        return reservationId;
    }

    public void setreservationId(String reservationId) {
        this.reservationId = reservationId;
    }
}
