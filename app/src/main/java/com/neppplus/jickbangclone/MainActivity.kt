package com.neppplus.jickbangclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangclone.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000,"서울시 동대문구",7,"1번째 방입니다.") )
        mRoomList.add( RoomData(27000,"안양시 만안구",6,"2번째 방입니다.") )
        mRoomList.add( RoomData(36000,"서울시 영등포구",15,"3번째 방입니다.") )
        mRoomList.add( RoomData(52000,"서울시 중구",33,"4번째 방입니다.") )
        mRoomList.add( RoomData(3000,"서울시 은평구",-1,"5섯번째 방입니다.") )
        mRoomList.add( RoomData(12000,"서울시 강남구",3,"6섯번째 방입니다.") )
        mRoomList.add( RoomData(9500,"서울시 마포구",5,"7곱번째 방입니다.") )
        mRoomList.add( RoomData(3000,"서울시 관악구",-1,"8번째 방입니다.") )
        mRoomList.add( RoomData(67000,"서울시 금천구",27,"9번째 방입니다.") )
        mRoomList.add( RoomData(120000,"서울시 서초구",47,"10째 방입니다.") )
        mRoomList.add( RoomData(24000,"안양시 동안구",1,"11번째 방입니다.") )


    }
}