package com.enesk.corestock.data.mapper

import com.enesk.corestock.data.remote.dto.IntradayInfoDto
import com.enesk.corestock.domain.model.IntradayInfo
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun IntradayInfoDto.toIntradayInfo(): IntradayInfo {
    val pattern = "dd-MM-yyyy HH:mm:ss"
    val formatter = SimpleDateFormat(pattern,Locale.getDefault())
    val localDateTime = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(formatter.parse("2022/02/01 14:23:05")!!)
    return IntradayInfo(
        date = localDateTime,
        close = close
    )
}

//val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss",Locale.getDefault())
//val date = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(simpleDateFormat.parse("2022/02/01 14:23:05")!!)