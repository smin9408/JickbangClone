package com.neppplus.jickbangclone.datas

import java.text.NumberFormat
import java.util.*

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String

) {

    fun getFormattedPrice(): String {
        if (this.price < 10000) {
            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
        } else {
          //  return "${this.price / 10000}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price % 10000)}"

            val uk = this.price / 10000
            val rest = this.price % 10000

            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"

        }
    }

    fun getFormattedFloor(): String {

        if (this.floor > 0) {
            return "${this.floor}층"
        } else if (this.floor == 0) {
            return "반지하"
        } else {
            return "B${-this.floor}층"
        }

    }

}