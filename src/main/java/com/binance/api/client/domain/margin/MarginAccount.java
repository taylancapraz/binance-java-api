package com.binance.api.client.domain.margin;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.account.AssetBalance;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Account information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginAccount {

  /**
   * Maker commission.
   */
  private boolean borrowEnabled;

  /**
   * Taker commission.
   */
  private String marginLevel;

  /**
   * Buyer commission.
   */
  private String totalAssetOfBtc;

  /**
   * Seller commission.
   */
  private String  totalLiabilityOfBtc;

  /**
   * Whether or not this account can trade.
   */
  private String totalNetAssetOfBtc;

  /**
   * Whether or not it is possible to withdraw from this account.
   */
  private boolean tradeEnabled;

  /**
   * Whether or not it is possible to deposit into this account.
   */
  private boolean transferEnabled;

  /**
   * List of asset balances of this account.
   */
  private List<MarginAccountBalance> userAssets;

  public boolean isBorrowEnabled() {
    return borrowEnabled;
  }

  public void setBorrowEnabled(boolean borrowEnabled) {
    this.borrowEnabled = borrowEnabled;
  }

  public String getMarginLevel() {
    return marginLevel;
  }

  public void setMarginLevel(String marginLevel) {
    this.marginLevel = marginLevel;
  }

  public String getTotalAssetOfBtc() {
    return totalAssetOfBtc;
  }

  public void setTotalAssetOfBtc(String totalAssetOfBtc) {
    this.totalAssetOfBtc = totalAssetOfBtc;
  }

  public String getTotalLiabilityOfBtc() {
    return totalLiabilityOfBtc;
  }

  public void setTotalLiabilityOfBtc(String totalLiabilityOfBtc) {
    this.totalLiabilityOfBtc = totalLiabilityOfBtc;
  }

  public String getTotalNetAssetOfBtc() {
    return totalNetAssetOfBtc;
  }

  public void setTotalNetAssetOfBtc(String totalNetAssetOfBtc) {
    this.totalNetAssetOfBtc = totalNetAssetOfBtc;
  }

  public boolean isTradeEnabled() {
    return tradeEnabled;
  }

  public void setTradeEnabled(boolean tradeEnabled) {
    this.tradeEnabled = tradeEnabled;
  }

  public boolean isTransferEnabled() {
    return transferEnabled;
  }

  public void setTransferEnabled(boolean transferEnabled) {
    this.transferEnabled = transferEnabled;
  }

  public List<MarginAccountBalance> getUserAssets() {
    return userAssets;
  }

  public void setUserAssets(List<MarginAccountBalance> userAssets) {
    this.userAssets = userAssets;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("borrowEnabled", borrowEnabled)
        .append("marginLevel", marginLevel)
        .append("totalAssetOfBtc", totalAssetOfBtc)
        .append("totalLiabilityOfBtc", totalLiabilityOfBtc)
        .append("totalNetAssetOfBtc", totalNetAssetOfBtc)
        .append("tradeEnabled", tradeEnabled)
        .append("transferEnabled", transferEnabled)
        .append("userAssets", userAssets)
        .toString();
  }
}
