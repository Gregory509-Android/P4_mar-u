package com.example.maru.service;

import com.example.maru.model.Meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummyMeetingRoomGenerator {

    public static List<Meeting> DUMMY_MEETINGROOM = Arrays.asList(

            new Meeting(1, "Dessalines", "Haiti", null, null, 3),
            new Meeting(9, "Sanité Bélaire", "Ecuador", null, null, 6),
            new Meeting(7, "Bookman", "Ghana", null, null, 1 ),
            new Meeting(2, "Catherine Flow", "Cameroun", null, null, 5),
            new Meeting(3, "Mackandal", "Jamaica", null, null, 2),
            new Meeting(4, "Ndinda", "Bénin", null, null, 4),
            new Meeting(5, "Nzala Mpandu", "Ivory coast", null, null, 7),
            new Meeting(6, "Lauryn Hill", "Guyana", null, null, 8),
            new Meeting(8, "Louverture", "Nzambi", null, null, 9)

    );

    public static List<Meeting> getDummyMeetingroom() {
        return new ArrayList<>(DUMMY_MEETINGROOM);
    }
}
