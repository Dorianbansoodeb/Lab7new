import java.util.EventObject;

/**
 * Event object carrying details of a prof-driven event.  This class extends
 * java.util.EventObject so listeners can always retrieve the source (the Prof).
 */
class ProfEvent extends EventObject {
    private final String profName;
    private final String date;   // e.g., "Oct 15, 10:00am"
    private final String room;   // e.g., "ME 3220"
    private final String message;

    public ProfEvent(Object source, String profName, String date, String room, String message) {
        super(source);
        this.profName = profName;
        this.date = date;
        this.room = room;
        this.message = message;
    }

    public String getProfName() { return profName; }
    public String getDate() { return date; }
    public String getRoom() { return room; }
    public String getMessage() { return message; }
}