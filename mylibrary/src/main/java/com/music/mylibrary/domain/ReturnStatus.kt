package com.music.mylibrary.domain

import androidx.annotation.StringRes
import com.music.mylibrary.R

enum class ReturnStatus(@StringRes val description: Int) {
    ACTIVE(R.string.active),
    CANCELED(R.string.canceled),
    CREATING(R.string.creating),
    PENDING(R.string.pending),
    PROCESSING(R.string.processing),
    STALE(R.string.stale),
    COMPLETE(R.string.complete),
    DENIED(R.string.denied),
}