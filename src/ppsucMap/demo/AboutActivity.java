package ppsucMap.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity {
	private TextView aboutText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		setContentView(R.layout.about_activity);
		
		aboutText=(TextView)findViewById(R.id.about);
		StringBuffer tem = new StringBuffer(256);
		tem.append("顺道儿 V1.0\n\n");
		tem.append("--基于地理位置的智能生活雏形\n\n");
		tem.append("本程序由中国人民公安大学网络安全保卫学院 \n周之童、吴凡、刘奇飞、王嘉男 开发\n");
		tem.append("地图数据来源于百度，程序版权所有以及最终解释权归本作者团队\n");
		tem.append("本程序可在安卓2.3及以上版本使用，使用过程中有任何建议请联系\nzhouzhitong2012@163.com\n\n");
		tem.append("谢谢您的使用");
		aboutText.setText(tem);
		
//	  <i>顺道儿</i>\n\n
//    <b>基于地理位置的智能生活雏形</b>\n
//    <i>本程序由公安大学网络安全保卫学院 12级周之童 吴凡 刘奇飞 王嘉男 开发</i>\n\n
//    <b>地图数据来源于百度，程序版权所有以及最终解释权归本作者团队所有。</b>\n
//    <i>本程序可在安卓2.3及以上版本使用，使用过程中有任何建议请联系zhouzhitong2012@163.com</i>\n
//    <b>谢谢您的使用</b>
		
		super.onCreate(savedInstanceState);
	}

	

}
