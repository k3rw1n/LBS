//package ppsucMap.demo;
//
//import android.app.Activity;
//import ppsucMap.demo.R;
//import android.app.Activity;
//import android.content.Context;
//import android.graphics.drawable.Drawable;
//import android.os.Bundle;
//import android.util.AttributeSet;
//import android.util.Log;
//import android.view.Menu;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//import android.widget.RadioGroup;
//import android.widget.RadioGroup.OnCheckedChangeListener;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.baidu.location.BDLocation;
//import com.baidu.location.BDLocationListener;
//import com.baidu.location.LocationClient;
//import com.baidu.location.LocationClientOption;
//import com.baidu.mapapi.BMapManager;
//import com.baidu.mapapi.map.LocationData;
//import com.baidu.mapapi.map.MKMapTouchListener;
//import com.baidu.mapapi.map.MapController;
//import com.baidu.mapapi.map.MapView;
//import com.baidu.mapapi.map.MyLocationOverlay;
//import com.baidu.mapapi.map.MyLocationOverlay.LocationMode;
//import com.baidu.mapapi.map.PopupClickListener;
//import com.baidu.mapapi.map.PopupOverlay;
//import com.baidu.platform.comapi.basestruct.GeoPoint;
//
//public class IntellgenceLife extends Activity {
//
//	LocationClient LoClient;
//	LocationData locData = null;
//	
//	MapView mMapView=null;
//	private MapController mMapContoller=null;
//	Button requestLoc=null;
//	boolean isRequest=false,isFirstLoc=true;
//	
//	
///**
// * 这些是定位相关的东西使用了接口实现一些功能
// */
//	public MyLocationListenner myListener = new MyLocationListenner();
//	 public class MyLocationListenner implements BDLocationListener {
//	    	
//	        @Override
//	        public void onReceiveLocation(BDLocation location) {
//	            if (location == null)
//	                return ;
//	            
//	            locData.latitude = location.getLatitude();
//	            locData.longitude = location.getLongitude();
//	            //如果不显示定位精度圈，将accuracy赋值为0即可
//	            locData.accuracy = 0;//location.getRadius();
//	            // 此处可以设置 locData的方向信息, 如果定位 SDK 未返回方向信息，用户可以自己实现罗盘功能添加方向信息。
//	            locData.direction = location.getDerect();
//	            //更新定位数据
//	            myLocationOverlay.setData(locData);
//	            //更新图层数据执行刷新后生效
//	            mMapView.refresh();
//	            //是手动触发请求或首次定位时，移动到定位点
//	            if (isRequest || isFirstLoc){
//	            	//移动地图到定位点
//	            	Log.d("LocationOverlay", "receive location, animate to it");
//	            	mMapContoller.animateTo(new GeoPoint((int)(locData.latitude* 1e6), (int)(locData.longitude *  1e6)));
//	                isRequest = false; 
//	                myLocationOverlay.setLocationMode(LocationMode.NORMAL);
////					requestLocButton.setText("跟随");
////	                mCurBtnType = E_BUTTON_TYPE.FOLLOW;
//	            }
//	            //首次定位完成
//	            isFirstLoc = false;
//	        }
//	        
//	        public void onReceivePoi(BDLocation poiLocation) {
//	            if (poiLocation == null){
//	                return ;
//	            }
//	        }
//	    }
//	
//	locationOverlay myLocationOverlay = null;
//	public class locationOverlay extends MyLocationOverlay{
//
//  		public locationOverlay(MapView mapView) {
//  			super(mapView);
//  			// TODO Auto-generated constructor stub
//  		}
////  		@Override
////  		protected boolean dispatchTap() {
//////  			 TODO Auto-generated method stub
//////  			处理点击事件,弹出泡泡
////  			popupText.setBackgroundResource(R.drawable.popup);
////			popupText.setText("我的位置");
////			pop.showPopup(BMapUtil.getBitmapFromView(popupText),
////					new GeoPoint((int)(locData.latitude*1e6), (int)(locData.longitude*1e6)),
////					8);
////  			return true;
////  		}
//  		
//  	}
//	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//		
//		DemoApplication app = (DemoApplication)this.getApplication();
//        if (app.mBMapManager == null) {
//            app.mBMapManager = new BMapManager(getApplicationContext());
//            /**
//             * 如果BMapManager没有初始化则初始化BMapManager
//             */
//            app.mBMapManager.init(new DemoApplication.MyGeneralListener());
//        }
//        setContentView(R.layout.intellgence);
//        CharSequence titleLable="地理闹钟位置";
//        setTitle(titleLable);
//        requestLoc = (Button)findViewById(R.id.button1);
//        
//        OnClickListener btnClickListener = new OnClickListener() {
//        	public void onClick(View v) {
//					//手动定位请求
//					requestLocClick();
//	         }
//        	public void requestLocClick(){
//            	isRequest = true;
//            	LoClient.requestLocation();
//                Toast.makeText(IntellgenceLife.this, "正在定位……", Toast.LENGTH_SHORT).show();
//            }
//        };
//	
//
//	}
//	public void modifyLocationOverlayIcon(Drawable marker){
//    	//当传入marker为null时，使用默认图标绘制
//    	myLocationOverlay.setMarker(marker);
//    	//修改图层，需要刷新MapView生效
//    	mMapView.refresh();
//    }
//	
//	   modifyLocationOverlayIcon(getResources().getDrawable(R.drawable.icon_geo));
//	   mMapView = (MyLocationMapView)findViewById(R.id.bmapView);
//       mMapController = mMapView.getController();
//       mMapView.getController().setZoom(14);
//       mMapView.getController().enableClick(true);
//       mMapView.showScaleControl(true);
//       mMapView.setBuiltInZoomControls(false);
//}
