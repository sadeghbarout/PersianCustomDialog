package com.hamedjj.persiancustomdialog;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity {

	/**رنگ های دیالوگ**/
	private static final String HALLOWEEN_BLUE = "#0066FF";
	private static final String HALLOWEEN_ORANGE = "#FF7F27";
	private static final String HALLOWEEN_PINK = "#FF00FF";
	
	/**ساختن دیالوگ های مختلف**/
	private OnClickListener mShowDialogbtn1 = new OnClickListener() {		
		@Override
		public void onClick(View v) {
			PersianDialogBuilder persianDialogBuilder = new PersianDialogBuilder(v.getContext()).
					setTitle(R.string.title).
				    setTitleColor(HALLOWEEN_BLUE).
				    setDividerColor(HALLOWEEN_BLUE).
				    setMessage(R.string.message).
				    setIcon(getResources().getDrawable(R.drawable.ic_launcher));
			
			persianDialogBuilder.show();
		}
	};
	
	private OnClickListener mShowDialogbtn2 = new OnClickListener() {		
		@Override
		public void onClick(View v) {
			PersianDialogBuilder persianDialogBuilder = new PersianDialogBuilder(v.getContext()).
					setTitle(R.string.title).
				    setTitleColor(HALLOWEEN_PINK).
				    setDividerColor(HALLOWEEN_PINK).
				    setMessage(R.string.message).
				    setIcon(getResources().getDrawable(R.drawable.ic_launcher)).
					setCustomView(R.layout.example_layout, v.getContext());
					
			persianDialogBuilder.show();
		}
	};
	
	private OnClickListener mShowDialogbtn3 = new OnClickListener() {		
		@Override
		public void onClick(View v) {
			PersianDialogBuilder persianDialogBuilder = new PersianDialogBuilder(v.getContext()).
					setTitle(R.string.title).
				    setTitleColor(HALLOWEEN_ORANGE).
				    setDividerColor(HALLOWEEN_ORANGE).
				    setMessage(R.string.message).
				    setIcon(getResources().getDrawable(R.drawable.ic_launcher)).
					setCustomView(R.layout.example_layout, v.getContext());
					
			 		persianDialogBuilder.setPositiveButton(R.string.ok, null);
			 		persianDialogBuilder.setNegativeButton(R.string.Cancel, null);
			 		
			persianDialogBuilder.show();
		}
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		/**اجرای دستور نمایش دیالوگ ها**/
		Button btn1 = (Button) findViewById(R.id.button1);
			btn1.setOnClickListener(mShowDialogbtn1);
		Button btn2 = (Button) findViewById(R.id.button2);
			btn2.setOnClickListener(mShowDialogbtn2);
		Button btn3 = (Button) findViewById(R.id.button3);
			btn3.setOnClickListener(mShowDialogbtn3);


	}
}
