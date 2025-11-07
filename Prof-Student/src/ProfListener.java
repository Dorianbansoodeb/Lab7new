import java.util.EventObject;

public interface ProfListener {
    /** Called when a prof announces a midterm. */
    void midtermAnnounced(ProfEvent e);

    /** Called when a prof postpones a previously announced midterm. */
    void midtermPostponed(ProfEvent e);
}


