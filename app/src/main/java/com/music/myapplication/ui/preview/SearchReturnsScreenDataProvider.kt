package com.music.myapplication.ui.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.music.myapplication.model.BasicReturnDetails
import com.music.myapplication.model.SearchReturnsState
import com.music.mylibrary.domain.ReturnStatus

class SearchReturnsScreenDataProvider : PreviewParameterProvider<SearchReturnsState> {
    override val values: Sequence<SearchReturnsState> = sequenceOf(
        initialState,
        loadingState,
        withResultsState,
    )

    companion object {
        val basicReturnDetails1 = BasicReturnDetails(
            id = 1L,
            orderId = 56789L,
            customerEmail = "john.doe@example.com",
            customerName = "John Doe",
            orderExternalId = "EXT12345",
            rmaNumber = "RMA12345",
            status = ReturnStatus.PENDING,
        )

        val basicReturnDetails2 = BasicReturnDetails(
            id = 2L,
            orderId = 12345L,
            customerEmail = "jane.smith@example.com",
            customerName = "Jane Smith",
            orderExternalId = "EXT67890",
            rmaNumber = "RMA67890",
            status = ReturnStatus.PROCESSING,
        )

        val basicReturnDetails3 = BasicReturnDetails(
            id = 3L,
            orderId = 1003L,
            customerEmail = "john.doe@example.com",
            customerName = "John Doe",
            orderExternalId = "EXT1003",
            rmaNumber = "RMA1003",
            status = ReturnStatus.ACTIVE,
        )

        private val initialState = SearchReturnsState()
        private val loadingState = SearchReturnsState(isLoading = true)
        private val withResultsState = SearchReturnsState(
            searchResults = listOf(
                basicReturnDetails1,
                basicReturnDetails2,
                basicReturnDetails3
            )
        )
    }
}