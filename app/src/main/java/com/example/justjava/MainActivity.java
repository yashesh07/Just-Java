package com.example.justjava;



import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int i = 0;
    public void submitOrder(View view) {
        TextView orderStatus = (TextView) findViewById(R.id.order_status);
        orderStatus.setText("Ordered Successfully");
        i = 0;
        display(i);
    }
    public void cancelOrder(View view){
        TextView orderStatus = (TextView) findViewById(R.id.order_status);
        orderStatus.setText("Order Cancelled");
        i = 0;
        display(i);
    }
    public void incrementCoffee(View view){
        i++;
        display(i);
        TextView orderStatus = (TextView) findViewById(R.id.order_status);
        orderStatus.setText("Order Pending...");
    }
    public void decrementCoffee(View view){
        if(i>0){
            i--;
            display(i);
        }
        else display(0);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        TextView totalPrice = (TextView) findViewById(R.id.total_price);
        quantityTextView.setText("" + number);
        totalPrice.setText("$ " + number*10);
    }
}
