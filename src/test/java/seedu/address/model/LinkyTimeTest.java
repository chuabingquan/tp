package seedu.address.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalMeetingEntries.CS2103;
import static seedu.address.testutil.TypicalMeetingEntries.getTypicalLinkyTime;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import seedu.address.model.meetingentry.MeetingEntry;
import seedu.address.model.meetingentry.exceptions.DuplicateMeetingEntryException;
import seedu.address.model.module.Module;

public class LinkyTimeTest {
    private final LinkyTime linkyTime = new LinkyTime();

    @Test
    public void constructor() {
        assertEquals(Collections.emptyList(), linkyTime.getMeetingEntryList());
    }

    @Test
    public void resetData_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> linkyTime.resetData(null));
    }

    @Test
    public void resetData_withValidReadOnlyLinkyTime_replacesData() {
        LinkyTime newData = getTypicalLinkyTime();
        linkyTime.resetData(newData);
        assertEquals(newData, linkyTime);
    }

    @Test
    public void resetData_withDuplicateMeetings_throwsDuplicateMeetingEntryException() {
        // Two meetings with the same identity fields
        List<MeetingEntry> newMeetings = Arrays.asList(CS2103, CS2103);
        LinkyTimeStub newData = new LinkyTimeStub(newMeetings);

        assertThrows(DuplicateMeetingEntryException.class, () -> linkyTime.resetData(newData));
    }

    @Test
    public void hasMeeting_nullMeeting_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> linkyTime.hasMeetingEntry(null));
    }

    @Test
    public void hasMeeting_meetingNotInLinkyTime_returnsFalse() {
        assertFalse(linkyTime.hasMeetingEntry(CS2103));
    }

    @Test
    public void hasMeeting_meetingInLinkyTime_returnsTrue() {
        linkyTime.addMeetingEntry(CS2103);
        assertTrue(linkyTime.hasMeetingEntry(CS2103));
    }

    @Test
    public void getMeetingList_modifyList_throwsUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, () -> linkyTime.getMeetingEntryList().remove(0));
    }

    /**
     * A stub ReadOnlyLinkyTime whose meeting list can violate interface constraints.
     */
    private static class LinkyTimeStub implements ReadOnlyLinkyTime {
        private final ObservableList<MeetingEntry> meetings = FXCollections.observableArrayList();
        private final ObservableList<Module> modules = FXCollections.observableArrayList();

        LinkyTimeStub(Collection<MeetingEntry> meetings) {
            this.meetings.setAll(meetings);
        }
        @Override
        public ObservableList<MeetingEntry> getMeetingEntryList() {
            return meetings;
        }
        @Override
        public ObservableList<Module> getModuleList() {
            return modules;
        }
    }

}
