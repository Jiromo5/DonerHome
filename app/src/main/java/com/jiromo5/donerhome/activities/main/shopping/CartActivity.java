package com.jiromo5.donerhome.activities.main.shopping;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jiromo5.donerhome.R;
import com.jiromo5.donerhome.main.menu.OrderDetails;
import com.jiromo5.donerhome.main.navigation.NavigationBarController;
import com.jiromo5.donerhome.main.navigation.listeners.CartsClickListener;
import com.jiromo5.donerhome.main.navigation.listeners.DealsClickListener;
import com.jiromo5.donerhome.main.navigation.listeners.HomeClickListener;
import com.jiromo5.donerhome.main.navigation.listeners.ProfileClickListener;
import com.jiromo5.donerhome.main.shopping.CartManager;
import com.jiromo5.donerhome.main.shopping.listeners.BuyButtonListener;

public class CartActivity extends AppCompatActivity {

    private ImageButton homeButton;
    private ImageButton dealsButton;
    private ImageButton cartButton;
    private ImageButton profileButton;

    private ImageView cartLogo;
    private TextView welcome;
    private LinearLayout orderList;

    private TextView totalPrice;
    private ImageButton buyButton;

    private NavigationBarController navigationBarController;
    private CartManager cartManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        overridePendingTransition(0,0);

        homeButton = findViewById(R.id.home_button);
        dealsButton = findViewById(R.id.deals_button);
        cartButton = findViewById(R.id.cart_button);
        profileButton = findViewById(R.id.profile_button);
        welcome = findViewById(R.id.welcome);
        cartLogo = findViewById(R.id.cart_logo);
        orderList = findViewById(R.id.order_list);
        totalPrice = findViewById(R.id.total_price);
        buyButton = findViewById(R.id.buy_button);

        cartManager = new CartManager(this, welcome, cartLogo, totalPrice, buyButton);
        cartManager.addItemToCart(orderList);
        cartManager.removeItemFromCart(orderList);
        cartManager.toggleVisibility();

        cartEventHandler();

        navigationBarController = new NavigationBarController(homeButton, dealsButton, cartButton, profileButton);
        navigationBarController.updateButtonState();
    }

    private void cartEventHandler(){
        HomeClickListener homeClickListener = new HomeClickListener(this);
        DealsClickListener dealsClickListener = new DealsClickListener(this);
        CartsClickListener cartsClickListener = new CartsClickListener(this);
        ProfileClickListener profileClickListener = new ProfileClickListener(this);
        BuyButtonListener buyButtonListener = new BuyButtonListener(this);

        homeButton.setOnClickListener(homeClickListener);
        dealsButton.setOnClickListener(dealsClickListener);
        cartButton.setOnClickListener(cartsClickListener);
        profileButton.setOnClickListener(profileClickListener);
        buyButton.setOnClickListener(buyButtonListener);
    }
}
