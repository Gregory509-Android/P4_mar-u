package com.example.maru.service;


import com.example.maru.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class DummyMeetingApiService implements MeetingApiService {

    private List<Meeting> meetingList = DummyMeetingRoomGenerator.getDummyMeetingroom();

    @Override
    public List<Meeting> getMeetings() {
        return meetingList;
    }

    @Override
    public void deleteMeeting(Meeting meeting) {
        meetingList.remove(meeting);
    }

    @Override
    public void createMeeting(Meeting meeting) {
        meetingList.add(meeting);
    }

    /* Essai méthode filtrage
    @Override
    public void getFilteredMeeting (String Date, String Room){

        List<Meeting> mFilteredMeeting = new ArrayList<>();

        

        return;mFilteredMeeting;

    }

     */

}
