package asia.ienter.hcapp.views.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import asia.ienter.hcapp.R;
import asia.ienter.hcapp.apis.UserApi;
import asia.ienter.hcapp.interfaces.IUser;
import asia.ienter.hcapp.services.UserService;
import asia.ienter.hcapp.utils.MLog;
import butterknife.InjectView;

/**
 * Created by phamquangmanh on 9/6/16.
 */
public class LoginActivity extends AppCompatActivity{


    private static final String TAG = "LoginActivity";
    com.rey.material.widget.Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        initView();

        initService();

        getBundleData();



    }

    private void getBundleData() {

    }

    private void initService() {

    }

    private void initView() {
        btnLogin = (com.rey.material.widget.Button)findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MLog.d(TAG,"btnLogin Onclick");
                loginUser();
            }
        });
    }

    private void loginUser(){
        IUser callback = new UserApi().getClient().create(IUser.class);

        new UserService().login("123123","123123",callback);
    }



}
