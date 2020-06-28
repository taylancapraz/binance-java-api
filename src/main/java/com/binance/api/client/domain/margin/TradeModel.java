package com.binance.api.client.domain.margin;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Account information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TradeModel {

    /**
     * Maker commission.
     */
    private String commission;

    /**
     * Taker commission.
     */
    private String commissionAsset;

    /**
     * Buyer commission.
     */
    private String id;

    /**
     * Seller commission.
     */
    private Boolean isBestMatch;

    /**
     * Whether or not this account can trade.
     */
    private Boolean isBuyer;

    /**
     * Whether or not this account can trade.
     */
    private Boolean isMaker;

    /**
     * Whether or not it is possible to withdraw from this account.
     */
    private Long orderId;

    /**
     * Whether or not it is possible to deposit into this account.
     */
    private String price;


    /**
     * Whether or not it is possible to deposit into this account.
     */
    private String qty;


    /**
     * Whether or not it is possible to deposit into this account.
     */
    private String symbol;


    /**
     * Whether or not it is possible to deposit into this account.
     */
    private Long time;

    /**
     * List of asset balances of this account.
     */
    private List<MarginAccountBalance> userAssets;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("commission", commission)
                .append("commissionAsset", commissionAsset)
                .append("id", id)
                .append("isBestMatch", isBestMatch)
                .append("isBuyer", isBuyer)
                .append("isMaker", isMaker)
                .append("orderId", orderId)
                .append("price", price)
                .append("qty", qty)
                .append("symbol", symbol)
                .append("time", time)
                .toString();
    }
}
