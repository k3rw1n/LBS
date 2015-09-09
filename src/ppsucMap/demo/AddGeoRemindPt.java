package ppsucMap.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddGeoRemindPt extends Activity {
	private Button addreminder;
	private TextView addText;
	private TextView remindDistanceVlaue;
	private TextView profilesMode;
	private EditText remindVlaue;
	private Spinner selectDistance;
	private Spinner selectProfiles;
	private String[] Distance = { "小 500m", "中 500-5km", "大 5km-15km" };
	private String[] Profiles = { "不做改动", "设为静音", "设为震动", "设为响铃" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		setContentView(R.layout.add_geo_remind_pt);

		addText = (TextView) findViewById(R.id.remindchar);
		remindDistanceVlaue = (TextView) findViewById(R.id.TextView01);
		profilesMode = (TextView) findViewById(R.id.TextView02);
		addreminder = (Button) findViewById(R.id.button1);
		remindVlaue = (EditText) findViewById(R.id.remindbox);
		selectDistance = (Spinner) findViewById(R.id.spinner1);
		selectProfiles = (Spinner) findViewById(R.id.Spinner01);

		ArrayAdapter<String> distanceArray = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_dropdown_item, Distance);
		selectDistance.setAdapter(distanceArray);
		ArrayAdapter<String> profilesArray = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_dropdown_item, Profiles);

		android.view.View.OnClickListener addBtn = new android.view.View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(AddGeoRemindPt.this, AddList.class);
				startActivity(i);
			}
		};
		addreminder.setOnClickListener(addBtn);

		super.onCreate(savedInstanceState);
	}

}
