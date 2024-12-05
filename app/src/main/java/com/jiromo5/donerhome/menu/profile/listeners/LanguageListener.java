package com.jiromo5.donerhome.menu.profile.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.jiromo5.donerhome.activities.menu.profile.FeedBackActivity;
import com.jiromo5.donerhome.activities.menu.profile.LanguageActivity;

public class LanguageListener implements View.OnClickListener {

    private Context context;

    public LanguageListener(Context context){
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        replaceActivity();
    }

    private void replaceActivity(){
        Intent intent = new Intent(context, LanguageActivity.class);
        context.startActivity(intent);
    }
}