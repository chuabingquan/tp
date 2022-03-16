package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.meetingentry.MeetingEntry;
import seedu.address.model.modulecode.ModuleCode;

/**
 * Unmodifiable view of LinkyTime data
 */
public interface ReadOnlyLinkyTime {

    /**
     * Returns an unmodifiable view of the meeting entry list.
     * This list will not contain any duplicate meeting entries.
     */
    ObservableList<MeetingEntry> getMeetingEntryList();

    /**
     * Returns an unmodifiable view of the module code list.
     * This list will not contain any duplicate module codes.
     */
    ObservableList<ModuleCode> getModuleCodeList();
}
