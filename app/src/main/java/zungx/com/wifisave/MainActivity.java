package zungx.com.wifisave;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    private TextView tvHe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHe = (TextView) findViewById(R.id.tvHe);

        WifiHotSpots wifiHotSpots = new WifiHotSpots(this);
        String kq ="";
        for(int i=0; i<wifiHotSpots.getProfiles().size(); i++){
            kq = kq + "" + wifiHotSpots.getProfiles().get(i).SSID +
                    "<br>"+wifiHotSpots.getWifiPassword(wifiHotSpots.getProfiles().get(i).SSID) + "<br><br>";
//            Log.d("ZZZZZZZZZ", wifiHotSpots.getProfiles().get(i).SSID);
//            Log.d("ZZZZZZZZZ", wifiHotSpots.getWifiPassword(wifiHotSpots.getProfiles().get(i).SSID) + "");
        }

        tvHe.setText(Html.fromHtml(kq));
    }

}
