package com.example.kayma.resimlidugme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String mImageButtonMessageTemplate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons);
        mImageButtonMessageTemplate = getString(R.string.image_button_message_template);

    }
    public void showImageButton1Info(View clickedImageButton) {
        showImageButtonInfo(R.string.image_button_1_image);
    }
    public void showImageButton2Info(View clickedImageButton) {
        showImageButtonInfo(R.string.image_button_2_image);
    }
    public void showImageButton3Info(View clickedImageButton) {
        showImageButtonInfo(R.string.image_button_3_image);
    }
    private void showImageButtonInfo(int imageId){
        String image = getString(imageId);
        String message = String.format(mImageButtonMessageTemplate, image);
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

    }

}
