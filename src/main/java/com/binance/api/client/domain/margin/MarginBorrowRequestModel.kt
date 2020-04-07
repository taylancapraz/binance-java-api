package com.binance.api.client.domain.margin

import com.binance.api.client.constant.BinanceApiConstants
import java.math.BigDecimal
import org.apache.commons.lang3.builder.ToStringBuilder

data class MarginBorrowRequestModel(
    val asset: String,
    val amount: BigDecimal,
    val recvWindow: Long = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW,
    val timestamp: Long = System.currentTimeMillis()
) {
    /**
     * Creates a new order with all required parameters.
     */
    override fun toString(): String {
        return ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("asset", asset)
            .append("amount", amount)
            .append("timestamp", timestamp)
            .append("recvWindow", recvWindow)
            .toString()
    }
}
