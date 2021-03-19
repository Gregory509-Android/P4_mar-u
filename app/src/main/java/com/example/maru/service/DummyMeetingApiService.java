package com.example.maru.service;


import com.example.maru.model.Meeting;

import java.util.List;

public class DummyMeetingApiService implements MeetingApiService {

    private List<Meeting> meetingList = DummyMeetingRoomGenerator.DUMMY_MEETINGROOM;

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
}
