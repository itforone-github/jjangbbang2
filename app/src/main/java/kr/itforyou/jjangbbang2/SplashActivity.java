package kr.itforyou.jjangbbang2;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.os.Handler;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.List;

import util.PermissionCheck;

public class SplashActivity extends AppCompatActivity {
    //private static final int APP_PERMISSION_STORAGE = 9787;
    private final int APPS_PERMISSION_REQUEST=1000;
    final int SEC = 3000;//다음 화면에 넘어가기 전에 머물 수 있는 시간(초)
    PermissionCheck permissionCheck;
    String permissions[] = {
            Manifest.permission.WRITE_EXTERNAL_STORAGE, // 기기, 사진, 미디어, 파일 엑세스 권한
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA
            //Manifest.permission.ACTIVITY_RECOGNITION
    };
    private static final int MULTIPLE_PERMISSIONS = 101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        goHandler();

    }


    //핸들러로 이용해서 1초간 머물고 이동이 됨
    public void goHandler() {
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /*Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);*/
                MainActivity.is_splash=true;
                finish();

            }
        }, SEC);
    }


}