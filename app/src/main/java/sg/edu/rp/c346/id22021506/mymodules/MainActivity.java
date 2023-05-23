package sg.edu.rp.c346.id22021506.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvC346;
    TextView tvC218;
    TextView tvC206;
    TextView tvC203;
    TextView tvC235;
    TextView tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC203=findViewById(R.id.tvC203);
        tvC206=findViewById(R.id.tvC206);
        tvC346=findViewById(R.id.tvC346);
        tvC218=findViewById(R.id.tvC218);
        tvC235=findViewById(R.id.tvC235);
        tvG953=findViewById(R.id.tvG953);
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C235");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C218");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C206");
                startActivity(intent);
            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C203");
                startActivity(intent);
            }
        });
        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "G953");
                startActivity(intent);
            }
        });
    }
}