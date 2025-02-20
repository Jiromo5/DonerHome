package com.jiromo5.donerhome.main.profile.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.jiromo5.donerhome.activities.main.profile.AddressesActivity;

public class AddressesButtonListener implements View.OnClickListener {

    private Context context;

    public AddressesButtonListener(Context context){
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        replaceActivity();
    }

    private void replaceActivity(){
        Intent intent = new Intent(context, AddressesActivity.class);
        context.startActivity(intent);
    }
}
