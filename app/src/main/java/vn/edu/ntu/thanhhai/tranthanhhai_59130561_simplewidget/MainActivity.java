package vn.edu.ntu.thanhhai.tranthanhhai_59130561_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
//import android.widget.TextView;
import android.widget.Toast;

import java.lang.invoke.MethodHandles;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtNgaySinh, edtKhac;
    RadioGroup rdgSoThich, rdgGioiTinh;
    Button btnXacNhan;
    CheckBox cbPhim, cbNhac, cbCafe ,cbHome, cbNauAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        rdgSoThich = findViewById(R.id.rdgSoThich);
        edtKhac = findViewById(R.id.edtKhac);
        cbPhim = findViewById(R.id.cbPhim);
        cbNhac = findViewById(R.id.cbNhac);
        cbCafe = findViewById(R.id.cbCafe);
        cbHome = findViewById(R.id.cbHome);
        cbNauAn = findViewById(R.id.cbNauAn);
    }

    private void addEvents()
    {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienThi();
            }
        });
    }

    private void hienThi()
    {
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rbNam:
                Toast.makeText(getApplicationContext(),"Nam",Toast.LENGTH_SHORT).show();
            case R.id.rbNu:
                Toast.makeText(getApplicationContext(),"Nu",Toast.LENGTH_SHORT).show();
        }

    }
}
