package com.binance.api.client.domain.margin;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.TransferType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

/**
 * A trade order to enter or exit a position.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginTransferRequestModel {

    /**
     * Symbol of transfer
     */
    private String asset;

    /**
     * Amount of transfer
     */
    private BigDecimal amount;

    /**
     * Type of transfer
     */
    private TransferType type;

    /**
     * Receiving window.
     */
    private Long recvWindow;

    /**
     * Order timestamp.
     */
    private long timestamp;

    public MarginTransferRequestModel(String asset, BigDecimal amount, TransferType type) {
        this.asset = asset;
        this.amount = amount;
        this.type = type;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

    public String getAsset() {
        return asset;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Integer getType() {
        if (type == TransferType.TO_MAIN) {
            return 1;
        } else {
            return 2;
        }
    }

    public Long getRecvWindow() {
        return recvWindow;
    }

    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Creates a new order with all required parameters.
     */

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("asset", asset)
                .append("amount", amount)
                .append("type", type)
                .append("timestamp", timestamp)
                .append("recvWindow", recvWindow)
                .toString();
    }
}
