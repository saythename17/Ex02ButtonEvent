package com.icandothisallday2020.ex02buttonevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //안드로이드 안 뷰 객체들의 참조변수는 멤버변수로 선언할 것
    TextView tv;
    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//xml 문서를 읽어 뷰 객체 생성
        //xml 문서에서 만든 View 객체들을 id로 찾아와 참조변수에 대입
        tv=this.findViewById(R.id.tv);
        btn=findViewById(R.id.btn);//this. 생략가능
        et=findViewById(R.id.et);

        //Button click→ TextView 글씨 변경
        //버튼이 클릭되는 것을 듣는 class 생성
        View.OnClickListener listener=new View.OnClickListener() {
            //이 리스너 객체가 바라보는 버튼이 클릭되면 자동 실행되는 callback method
            @Override
            public void onClick(View v) {
                //tv.setText("You have been blessed with Lesser Panda.");
                //EditText 의 문자열을 TextView 에 설정
                String s=et.getText().toString();
                tv.setText(s);//입력받은 문자열 s를 TextView 에 넣기
            }
        };//View's inner class
        //위에서 만든 리스너객체를 버튼에게 설정
        btn.setOnClickListener(listener);
    }
}
