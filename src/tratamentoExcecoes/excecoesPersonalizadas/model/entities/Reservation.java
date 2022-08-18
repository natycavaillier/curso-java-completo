package tratamentoExcecoes.excecoesPersonalizadas.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration() {
        Duration duration = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
        return duration.toDays();
    }

    public String updateDates(LocalDate checkIn, LocalDate checkOut) {

        if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
            return "Reservation dates for update must be future dates";
        }

        if (!checkOut.isAfter(checkIn)) {
            return "Check-out date must be after check-in date";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return null;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + checkIn.format(formatter)
                + ", check-out: "
                + checkOut.format(formatter)
                + ", "
                + duration()
                + " nights";
    }

}
