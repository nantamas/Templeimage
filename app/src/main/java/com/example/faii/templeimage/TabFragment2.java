package com.example.faii.templeimage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by FAII on 20/02/2016.
 */
public class TabFragment2 extends Fragment implements OnMapReadyCallback {
    private View view;
    private GoogleMap mMap;
    public static TabFragment2 newInstance() {
        TabFragment2 fragment = new TabFragment2();
        return fragment;
    }
    //พิกัดวัดใหญ่ชัยมงคล
    private static final LatLng WAT_YAI_CHAI_MONG_KON = new LatLng(14.345590, 100.592362);

    //วัดพนัญเชิงวรวิหาร
    private static final LatLng WAT_Phanan_Worawihan = new LatLng(14.344327, 100.578978);

    //วัดมหาธาตุ
    private static final LatLng Wat_Mahathat = new LatLng(14.356918, 100.567554);

    private static final LatLng Wat_Phra_Sri_Sanphet = new LatLng(14.355891, 100.558623);

    //วัดภูเขาทอง
    private static final LatLng Wat_Phu_Khao_Thong = new LatLng(14.368938, 100.539744);

    //วัดมเหยงคณ์
    private static final LatLng Wat_Mahaeyong = new LatLng(14.363704, 100.594328);

    //วัดไชยวัฒนาราม
    private static final LatLng Wat_Chai_Watthanaram = new LatLng(14.342968, 100.541832);

    //วัดหน้าพระเมรุ
    private static final LatLng Wat_Naphra_Meru = new LatLng(14.362839, 100.559073);

    //วัดโลกยสุธาราม
    private static final LatLng Wat_Lokayasutharam = new LatLng(14.355569, 100.552931);

    //วัดพระราม
    private static final LatLng Wat_Phra_Ram = new LatLng(14.354023, 100.560795);
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab_fragment_2, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.fragment2);
        mapFragment.getMapAsync(this);

        return view;
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //สร้างหมุดสำหรับวัดใหญ่ชัยมงคล
        MarkerOptions mowatyai = new MarkerOptions();
        mowatyai.position(WAT_YAI_CHAI_MONG_KON);
        mowatyai.title("วัดใหญ่ชัยมงคล (Wat Yai Chaimngkol)");
        mowatyai.snippet("ตำบล คลองสวนพลู อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatyai);


        //สร้างหมุดสำหรับวัดพนัญเชิงวรวิหาร
        MarkerOptions mowatphananworawihan = new MarkerOptions();
        mowatphananworawihan.position(WAT_Phanan_Worawihan);
        mowatphananworawihan.title("วัดพนัญเชิงวรวิหาร (WAT Phanan Worawihan)");
        mowatphananworawihan.snippet("ตำบล หอรัตนไชย อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatphananworawihan);

        //สร้างหมุดวัดมหาธาตุ
        MarkerOptions mowatmahathat = new MarkerOptions();
        mowatmahathat.position(Wat_Mahathat);
        mowatmahathat.title("วัดมหาธาตุ (Wat Mahathat)");
        mowatmahathat.snippet("ตำบล ท่าวาสุกรี อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatmahathat);

        //สร้างหมุดวัดพระศรีสรรเพชญ์
        MarkerOptions mowatphrasrisanphet = new MarkerOptions();
        mowatphrasrisanphet.position(Wat_Phra_Sri_Sanphet );
        mowatphrasrisanphet.title("วัดพระศรีสรรเพชญ์ (Wat Phra Sri Sanphet)");
        mowatphrasrisanphet.snippet("ตำบล ประตูชัย อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatphrasrisanphet);

        //สร้างหมุดวัดภูเขาทอง
        MarkerOptions mowatphukhaothong = new MarkerOptions();
        mowatphukhaothong.position(Wat_Phu_Khao_Thong );
        mowatphukhaothong.title("วัดภูเขาทอง (Wat Phu Khao Thong)");
        mowatphukhaothong.snippet("ตำบล ภูเขาทอง อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatphukhaothong);

        //สร้างหมุดวัดมเหยงคณ์
        MarkerOptions mowatmahaeyong = new MarkerOptions();
        mowatmahaeyong.position(Wat_Mahaeyong);
        mowatmahaeyong.title("วัดมเหยงคณ์ (Wat Mahaeyong)");
        mowatmahaeyong.snippet("ตำบล หันตรา อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatmahaeyong);

        //สร้างหมุดวัดไชยวัฒนาราม
        MarkerOptions mowatchaiwatthanaram = new MarkerOptions();
        mowatchaiwatthanaram.position(Wat_Chai_Watthanaram );
        mowatchaiwatthanaram.title("วัดไชยวัฒนาราม (Wat Chai Watthanaram)");
        mowatchaiwatthanaram.snippet("ตำบล บ้านป้อม อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatchaiwatthanaram);

        //สร้างหมุดวัดหน้าพระเมรุ
        MarkerOptions mowatnaphrameru = new MarkerOptions();
        mowatnaphrameru.position(Wat_Naphra_Meru );
        mowatnaphrameru.title("วัดหน้าพระเมรุ (Wat Naphra Meru)");
        mowatnaphrameru.snippet("ตำบล ลุมพลี อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatnaphrameru);

        //สร้างหมุดวัดโลกยสุธาราม
        MarkerOptions mowatlokayasutharam = new MarkerOptions();
        mowatlokayasutharam.position(Wat_Lokayasutharam );
        mowatlokayasutharam.title("วัดโลกยสุธาราม (Wat Lokayasutharam)");
        mowatlokayasutharam.snippet("ตำบล ประตูชัย อำเภอ พระนครศรีอยุธยา,พระนครศรีอยุธยา 13000");
        mMap.addMarker(mowatlokayasutharam);

        //สร้างหมุดดวัดพระราม
        MarkerOptions mowatphraram = new MarkerOptions();
        mowatphraram.position(Wat_Phra_Ram );
        mowatphraram.title("วัดพระราม (Wat Phra Ram )");
        mowatphraram.snippet(" ตำบลประตูชัย อำเภอพระนครศรีอยุธยา จังหวัดพระนครศรีอยุธยา");
        mMap.addMarker(mowatphraram);



        //ย้ายกล้องไปที่วัดใหญ่ชัยมงคล
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(WAT_YAI_CHAI_MONG_KON, 5));

        //ซูมที่ระดับ13 แบบมีแอนิเมชั่น
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13), 2000, null);
    }

}