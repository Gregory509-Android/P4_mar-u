package com.example.maru.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.maru.R;
import com.example.maru.databinding.ActivityMeetingListBinding;
import com.example.maru.databinding.ActivityMeetingListItemBinding;
import com.example.maru.di.DI;
import com.example.maru.events.DeleteMeetingEvent;
import com.example.maru.model.Meeting;
import com.example.maru.service.MeetingApiService;
import com.example.maru.ui.adapters.MeetingListRecyclerViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MeetingListActivity extends AppCompatActivity {
    private ActivityMeetingListBinding mBinding;
    private MeetingApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMeetingListBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mApiService = DI.getMeetingApiService();

        mBinding.floatingAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), AddMeetingActivity.class));
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        initRecycler();
    }

    private void initRecycler() {
        List<Meeting> meetingList = mApiService.getMeetings();
        MeetingListRecyclerViewAdapter adapter = new MeetingListRecyclerViewAdapter(meetingList);
        mBinding.recyclerView.setAdapter(adapter);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDeleteMeeting(DeleteMeetingEvent event) {
        mApiService.deleteMeeting(event.meeting);
        initRecycler();

    }

}

