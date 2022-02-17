package com.neppplus.jickbangclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangclone.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.activity_view_room_detail.txtDescription
import kotlinx.android.synthetic.main.activity_view_room_detail.txtPrice
import kotlinx.android.synthetic.main.room_list_item.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)


        val roomData = intent.getSerializableExtra("roomInfo") as RoomData

        txtPrice.text = roomData.getFormattedPrice()
        txtDescription.text = roomData.description

        txtAddress.text = roomData.address
        txtFloor.text = roomData.getFormattedFloor()


    }
}