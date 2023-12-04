package com.music.myapplication.model

import android.os.Parcelable
import com.music.mylibrary.domain.ReturnStatus
import kotlinx.parcelize.Parcelize

@Parcelize
class BasicReturnDetails(
    val id: Long,
    val orderId: Long,
    val customerEmail: String,
    val customerName: String,
    val orderExternalId: String,
    val rmaNumber: String,
    val status: ReturnStatus,
) : Parcelable
