package com.jiromo5.donerhome.main.profile.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.jiromo5.donerhome.activities.main.profile.FeedBackActivity;

public class FeedBackListener implements View.OnClickListener {

    private Context context;

    public FeedBackListener(Context context){
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        replaceActivity();
    }

    private void replaceActivity(){
        Intent intent = new Intent(context, FeedBackActivity.class);
        context.startActivity(intent);
    }
}
