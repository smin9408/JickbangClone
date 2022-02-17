package com.neppplus.jickbangclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangclone.adapters.RoomAdapter
import com.neppplus.jickbangclone.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: RoomAdapter
    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000,"서울시 동대문구",7,"1번째 방입니다.") )
        mRoomList.add( RoomData(27000,"안양시 만안구",6,"2번째 방입니다.") )
        mRoomList.add( RoomData(36000,"서울시 영등포구",15,"3번째 방입니다.") )
        mRoomList.add( RoomData(52000,"서울시 중구",33,"4번째 방입니다.") )
        mRoomList.add( RoomData(3000,"서울시 은평구",0,"5섯번째 방입니다.") )
        mRoomList.add( RoomData(12000,"서울시 강남구",3,"6섯번째 방입니다.") )
        mRoomList.add( RoomData(9500,"서울시 마포구",5,"7곱번째 방입니다.") )
        mRoomList.add( RoomData(3000,"서울시 관악구",-1,"8번째 방입니다.") )
        mRoomList.add( RoomData(67000,"서울시 금천구",27,"9번째 방입니다.") )
        mRoomList.add( RoomData(120000,"서울시 서초구",47,"10째 방입니다.") )
        mRoomList.add( RoomData(24000,"안양시 동안구",1,"11번째 방입니다.") )

        mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)

        }


    }
}