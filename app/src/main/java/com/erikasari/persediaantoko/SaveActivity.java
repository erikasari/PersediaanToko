package com.erikasari.persediaantoko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.erikasari.persediaantoko.models.Transaction;

public class SaveActivity extends AppCompatActivity {

    private EditText descriptionInput;
    private EditText amountInput;
    private EditText stockInput;
    private RadioGroup typeRadioGroup;
    private Transaction item;
    private int index;
//    private ImageView photoInput;
//
//    private static final int GALLERY_REQUEST_CODE = 1;
//    private int PICK_IMAGE_REQUEST = 1;
//    private Uri mImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        descriptionInput = findViewById(R.id.input_description);
        amountInput = findViewById(R.id.input_amount);
        stockInput = findViewById(R.id.input_stok);
        typeRadioGroup = findViewById(R.id.group_type);
//        photoInput = findViewById(R.id.txt_photo);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            item = extras.getParcelable(MainActivity.TRANSACTION_KEY);
            index = extras.getInt(MainActivity.INDEX_KEY, 0);
            descriptionInput.setText(item.getDescription());
            amountInput.setText(String.valueOf(item.getAmount()));
            stockInput.setText(item.getStock());


            if (item.getType() == Transaction.Type.TERSEDIA){
                typeRadioGroup.check(R.id.radio_kosong);
            } else if (item.getType() == Transaction.Type.KOSONG){
                typeRadioGroup.check(R.id.radio_ready);
            }
        }
    }

    private Transaction.Type getCheckedType(){
        if (typeRadioGroup.getCheckedRadioButtonId() == R.id.radio_kosong){
            return Transaction.Type.TERSEDIA;
        } else if (typeRadioGroup.getCheckedRadioButtonId() == R.id.radio_ready){
            return Transaction.Type.KOSONG;
        }
        return Transaction.Type.EMPTY;
    }

    public void handleSubmit(View view) {
        String description = descriptionInput.getText().toString();
        int amount = Integer.parseInt(amountInput.getText().toString());
        String stock = stockInput.getText().toString();
        Transaction.Type type = getCheckedType();

        item.setDescription(description);
        item.setAmount(amount);
        item.setStock(stock);
        item.setType(type);

        if(description.equals("")|| (amount) ==0 || stock.equals("")){
            Toast.makeText(this, "data tidak boleh kososng", Toast.LENGTH_SHORT).show();
        } else if(typeRadioGroup.getCheckedRadioButtonId()==-1){
            Toast.makeText(this, "data tidak boleh kososng", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent();
            intent.putExtra(MainActivity.TRANSACTION_KEY, item);
            intent.putExtra(MainActivity.INDEX_KEY, index);
            setResult(RESULT_OK, intent);
            finish();
        }
    }

//        public void handlePhoto(View view) {
//            Intent intent = new Intent();
//            intent.setType("image/*");
//            intent.setAction(Intent.ACTION_GET_CONTENT);
//            startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
//    }
}
