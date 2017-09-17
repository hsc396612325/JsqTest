package com.example.jxqdome;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.jxqdome.R;

import java.lang.reflect.Array;
import java.util.Arrays;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.jxqdome.R.id.decor_content_parent;
import static com.example.jxqdome.R.id.textView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private StringBuilder pending=new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN , WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        textView = (TextView)findViewById(R.id.textView);//类似定义和赋值
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        Button buttonAdd = (Button)findViewById(R.id.buttonAdd);
        Button buttonSign = (Button)findViewById(R.id.buttonSign);
        Button buttonMul = (Button)findViewById(R.id.buttonMul);
        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);
        Button buttonEqual = (Button)findViewById(R.id.buttonEqual);
        Button buttonDot= (Button)findViewById(R.id.buttonDot);
        Button buttonRightBracket = (Button)findViewById(R.id.buttonRightBracket);
        Button buttonLeftBracket = (Button)findViewById(R.id.buttonLeftBracket);
        Button buttonBack = (Button)findViewById(R.id.buttonBack);
        Button buttonAC = (Button)findViewById(R.id.buttonAC);

        button0.setOnClickListener(this);//调用监听器
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        buttonAdd.setOnClickListener(this);
        buttonSign.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonRightBracket.setOnClickListener(this);
        buttonLeftBracket.setOnClickListener(this);
        buttonBack.setOnClickListener(this);
        buttonAC.setOnClickListener(this);

    }
    @Override
    //监听器
    public void onClick(View v){
        //当前字符串的最后一个和倒数第二个
        int last = 0;
        int last_q =0;
        if(pending.length()!=0)
        {
            last = pending.codePointAt(pending.length()-1);
            if (pending.length()>1)
                last_q =pending.codePointAt(pending.length()-2);
        }
        switch (v.getId()) {
            case R.id.button0:
                if(last!=')'){
                    pending = pending.append("0");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"0");
                }
                textView.setText(pending);
                break;
            case R.id.button1:
                if(last!=')'){
                    pending = pending.append("1");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"1");
                }
                textView.setText(pending);
                break;
            case R.id.button2:
                if(last!=')'){
                    pending = pending.append("2");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"2");
                }
                textView.setText(pending);
                break;
            case R.id.button3:
                if(last!=')'){
                    pending = pending.append("3");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"3");
                }
                textView.setText(pending);
                break;
            case R.id.button4:
                if(last!=')'){
                    pending = pending.append("4");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"4");
                }
                textView.setText(pending);
                break;
            case R.id.button5:
                if(last!=')'){
                    pending = pending.append("5");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"5");
                }
                textView.setText(pending);
                break;
            case R.id.button6:
                if(last!=')'){
                    pending = pending.append("6");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"6");
                }
                textView.setText(pending);
                break;
            case R.id.button7:
                if(last!=')'){
                    pending = pending.append("7");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"7");
                }
                textView.setText(pending);
                break;
            case R.id.button8:
                if(last!=')'){
                    pending = pending.append("8");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"8");
                }
                textView.setText(pending);
                break;
            case R.id.button9:
                if(last!=')'){
                    pending = pending.append("9");
                }
                else {
                    pending = pending.replace(pending.length()-1,pending.length(),"9");
                }
                textView.setText(pending);
                break;
            case R.id.buttonAdd: // +加
                if(last>='0' &&last<='9' ||last==')') {
                    pending = pending.append("+");
                }
                else if(pending.length()>1&&last!='('){
                    pending = pending.replace(pending.length()-1,pending.length(),"+");
                }
                if(pending.length()>1&&last=='-'&&(last_q=='*'||last_q=='/')){
                    pending = pending.replace(pending.length()-2,pending.length(),"+");
                }
                textView.setText(pending);
                break;
            case R.id.buttonSign:// -减
                if(last>='0' &&last<='9' ||last==')'||last=='*'||last=='/'||pending.length()==0) {
                    pending = pending.append("-");
                }
                else  if(pending.length()>1&&last!='('){
                    pending = pending.replace(pending.length()-1,pending.length(),"-");
                }
                if(pending.length()>1&&last=='-'&&(last_q=='*'||last_q=='/')){
                    pending = pending.replace(pending.length()-2,pending.length(),"-");
                }
                textView.setText(pending);
                break;
            case R.id.buttonMul: // *乘
                if(last>='0' &&last<='9' ||last==')') {
                    pending = pending.append("*");
                }
                else if(pending.length()>1&&last!='(')
                {
                    pending = pending.replace(pending.length()-1,pending.length(),"*");
                }
                if(pending.length()>1&&last=='-'&&(last_q=='*'||last_q=='/')){
                    pending = pending.replace(pending.length()-2,pending.length(),"*");
                }
                textView.setText(pending);
                break;
            case R.id.buttonDiv: // /除
                if(last>='0' &&last<='9' ||last==')') {
                    pending = pending.append("/");
                }
                else if(pending.length()>1&&last!='('){
                    pending = pending.replace(pending.length()-1,pending.length(),"/");
                }
                if(last=='-'&&(last_q=='*'||last_q=='/')){
                    pending = pending.replace(pending.length()-2,pending.length(),"/");
                }
                textView.setText(pending);
                break;
            case R.id.buttonEqual: // =等于
                if((last>='0' &&last<='9' ||last==')')&&judje2()==0) {
                    InfixInToDuffix inf = new InfixInToDuffix();
                        String jieguo;
                        String a="0";
                    try {
                        a = inf.toSuffix(pending);
                        jieguo=inf.dealEquation(a);

                    }
                    catch (Exception ex){
                        jieguo = "出错";
                    }
                    textView.setText(pending+"="+jieguo);
                    pending = pending.delete(0, pending.length());
                    if(Character.isDigit(jieguo.charAt(0))||jieguo.charAt(0)=='-') {
                        pending = pending.append(jieguo);
                    }
                }
                break;
            case R.id.buttonDot:// 。小数点
                if(last>='0' &&last<='9'&&judje1()) {
                    pending = pending.append(".");
                    textView.setText(pending);
                }
                break;
            case R.id.buttonRightBracket:// )右括号
                if((last>='0' &&last<='9'||last==')')&&judje2()==1) {
                    pending = pending.append(")");
                    textView.setText(pending);
                }
                break;
            case R.id.buttonLeftBracket:// （左括号
                if((last<'0' ||last>'9')&&last!='.'&&last!=')') {
                    pending = pending.append("(");
                    textView.setText(pending);
                }
                break;
            case R.id.buttonBack: //删除
                if(pending.length()!=0) {
                    pending = pending.delete(pending.length()-1,pending.length());
                    textView.setText(pending);
                }
                break;
            case R.id.buttonAC: //清空
                    pending = pending.delete(0, pending.length());
                    textView.setText(pending);
                break;
            default:
                break;
        }
        //彩蛋
        String love ="520";
        if(love.contentEquals(pending)){
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

            dialog.setMessage("\n(〃'▽'〃)哈呀，虽然我只是个计算器，但我也爱你哟");
            dialog.setCancelable(false);
            dialog.setPositiveButton("嗯，我知道啦", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog , int whith){
                }
            });
            dialog.show();
        }

    }
    private boolean judje1(){
        String a="+-*/().";
        int[] b = new int[a.length()];
        int max;
        for (int i = 0;i < a.length();i++ )
        {
            String c =""+a.charAt(i);
            b[i] = pending.lastIndexOf(c);
        }
        Arrays.sort(b);
        if(b[a.length()-1]==-1){
            max = 0;
        }
        else{
            max = b[a.length()-1];
        }
        if(pending.indexOf(".",max)==-1){
            return true;
        }
        else{
            return false;}
    }
    private int judje2(){
        int a=0,b=0;
        for(int i = 0 ; i < pending.length() ;i++){
            if(pending.charAt(i)=='(' ) {
                a++;
            }
            if(pending.charAt(i)==')' ) {
                b++;
            }
        }
        if(a == b)
            return 0;
        if(a > b)
            return 1;
        return 2;
    }


}