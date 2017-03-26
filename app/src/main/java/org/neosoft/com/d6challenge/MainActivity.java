package org.neosoft.com.d6challenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4;
    String mResult,mResult1,mResult2,mResult3,mResult4;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=(CheckBox) findViewById(R.id.cB1) ;
        cb2=(CheckBox) findViewById(R.id.cB2) ;
        cb3=(CheckBox) findViewById(R.id.cB3) ;
        cb4=(CheckBox) findViewById(R.id.cB4) ;

        result= (TextView)findViewById(R.id.txtResult);

        findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean c1= cb1.isChecked();
                boolean c2= cb2.isChecked();
                boolean c3= cb3.isChecked();
                boolean c4= cb4.isChecked();

                mResult = null;


                if(c1){
                    mResult1 = "Check one";
                    if (!TextUtils.isEmpty(mResult)){
                        mResult = mResult + " and "+ mResult1;
                    }else{
                        mResult = mResult1;
                    }
                }
                if(c2){
                    mResult2 = "Check two";
                    if (!TextUtils.isEmpty(mResult)){
                        mResult = mResult + " and "+ mResult2;
                    }else{
                        mResult = mResult2;
                    }
                }
                if(c3){
                    mResult3 = "Check three";
                    if (!TextUtils.isEmpty(mResult)){
                        mResult = mResult + " and "+mResult3;
                    }else{
                        mResult = mResult3;
                    }
                }
                if(c4){
                    mResult4 = "Check four";
                    if (!TextUtils.isEmpty(mResult)){
                        mResult = mResult + " and "+mResult4;
                    }else{
                        mResult = mResult4;
                    }
                }

                if (!c1&&!c2&&!c3&&!c4){
                    result.setText("Select at least one check box");
                }else{
                    result.setText(mResult+" Selected");
                }

            }
        });
    }
}
