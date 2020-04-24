package vn.edu.ntu.phamvuonglamnhac.phamvuonglamnhac_59131658_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTen;
    EditText edtNgaySinh;
    EditText edtSoThich;
    RadioGroup rdgGioiTinh;
    Button btnXacNhan;
    CheckBox checkboxPhim;
    CheckBox checkboxNhac;
    CheckBox checkboxCafe;
    CheckBox checkboxOnha;
    CheckBox checkboxBep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }
    private void addView()
    {
        edtTen=findViewById(R.id.edtTen);
        edtNgaySinh=findViewById(R.id.edtNgaySinh);
        edtSoThich=findViewById(R.id.edtSoThich);
        rdgGioiTinh=findViewById(R.id.rdgGioiTinh);
        checkboxPhim=findViewById(R.id.checkboxPhim);
        checkboxNhac=findViewById(R.id.checkboxNhac);
        checkboxCafe=findViewById(R.id.checkboxCafe);
        checkboxOnha=findViewById(R.id.checkboxOnha);
        checkboxBep=findViewById(R.id.checkboxBep);
        btnXacNhan=findViewById(R.id.btnXacNhan);
    }
    private void addEvents()
    {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayChuoi();
            }
        });
    }
    private void LayChuoi()
    {
        String gt="Giới Tính:";
        String Ten=edtTen.getText().toString();
        String NgaySinh=edtNgaySinh.getText().toString();
        String SoThich=edtSoThich.getText().toString();
        String laychuoi="Sở thích:";
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rbNam:
                gt+="Nam"+"\n";
                break;
            case R.id.rbNu:
                gt+="Nữ"+"\n";
                break;
        }
       if(checkboxPhim.isChecked()){
            laychuoi+=checkboxPhim.getText() +";";
       }
        if(checkboxNhac.isChecked()){
            laychuoi+=checkboxNhac.getText() +";";
        }
        if(checkboxCafe.isChecked()){
            laychuoi+=checkboxCafe.getText() +";";
        }
        if(checkboxOnha.isChecked()){
            laychuoi+=checkboxOnha.getText() +";";
        }
        if(checkboxBep.isChecked()){
            laychuoi+=checkboxBep.getText() +";";
        }

        Toast.makeText(this,Ten + "\n" +"Ngày Sinh:" +NgaySinh+"\n" + gt + laychuoi + SoThich , Toast.LENGTH_SHORT).show();
    }
}
