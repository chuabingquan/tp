package seedu.address.testutil.typical;

import static seedu.address.logic.commands.CommandTestUtil.VALID_DATETIME_LECTURE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DATETIME_TUTORIAL;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DURATION_LECTURE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DURATION_TUTORIAL;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MODULE_LECTURE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MODULE_TUTORIAL;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_LECTURE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_TUTORIAL;
import static seedu.address.logic.commands.CommandTestUtil.VALID_RECURRING_LECTURE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_RECURRING_TUTORIAL;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_LECTURE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_TUTORIAL;
import static seedu.address.logic.commands.CommandTestUtil.VALID_URL_LECTURE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_URL_TUTORIAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.meeting.Meeting;
import seedu.address.testutil.meeting.MeetingBuilder;

/**
 * A utility class containing a list of {@code Meeting} objects to be used in tests.
 */
public class TypicalMeetings {
    public static final Meeting CS2105 = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("2-02-2022 1:00pm").withDuration("2")
            .withModule("CS2105").withIsRecurring("N")
            .withTags("roger").build();
    public static final Meeting CS2106 = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("3-02-2022 1:00pm").withDuration("2")
            .withModule("CS2106").withIsRecurring("N")
            .withTags("colin").build();
    public static final Meeting CS2030 = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("4-02-2022 1:00pm").withDuration("2")
            .withModule("CS2030").withIsRecurring("N")
            .withTags("ooi").build();
    public static final Meeting CS2040 = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("5-02-2022 1:00pm").withDuration("1")
            .withModule("CS2040").withIsRecurring("N")
            .withTags("CKF").build();
    public static final Meeting CS2100 = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("6-02-2022 1:00pm").withDuration("15")
            .withModule("CS2100").withIsRecurring("N")
            .withTags("aaron").build();
    public static final Meeting CS2107 = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("7-02-2022 1:00pm").withDuration("1.7")
            .withModule("CS2107").withIsRecurring("N")
            .withTags("sufatrio").build();

    // Manually added
    public static final Meeting PC1221 = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("7-02-2022 1:00pm").withDuration("2")
            .withModule("PC1221").withIsRecurring("N")
            .withTags("proftay").build();

    public static final Meeting CS1101S = new MeetingBuilder().withName("Lecture")
            .withUrl("https://www.zoom.com").withDateTime("7-02-2022 1:00pm").withDuration("1.5")
            .withModule("CS1101S").withIsRecurring("N")
            .withTags("hartinmenz").build();

    // Manually added - Meeting's details found in {@code CommandTestUtil}
    public static final Meeting CS2101 = new MeetingBuilder().withName(VALID_NAME_TUTORIAL)
            .withUrl(VALID_URL_TUTORIAL).withDateTime(VALID_DATETIME_TUTORIAL).withDuration(VALID_DURATION_TUTORIAL)
            .withModule(VALID_MODULE_TUTORIAL).withIsRecurring(VALID_RECURRING_TUTORIAL)
            .withTags(VALID_TAG_TUTORIAL).build();
    public static final Meeting CS2103 = new MeetingBuilder().withName(VALID_NAME_LECTURE)
            .withUrl(VALID_URL_LECTURE).withDateTime(VALID_DATETIME_LECTURE).withDuration(VALID_DURATION_LECTURE)
            .withModule(VALID_MODULE_LECTURE).withIsRecurring(VALID_RECURRING_LECTURE)
            .withTags(VALID_TAG_LECTURE).build();

    public static final String KEYWORD_MATCHING_TUTORIAL = "Tutorial"; // A keyword that matches TUTORIAL

    private TypicalMeetings() {
    } // prevents instantiation

    public static List<Meeting> getTypicalMeetings() {
        return new ArrayList<>(Arrays.asList(CS2101, CS2105, CS2106, CS2030, CS2040, CS2100, CS1101S));
    }
}