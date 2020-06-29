package com.binance.api.client.domain.margin;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Account information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InterestModel {
    private String asset;
    private String interest;
    private Long interestAccuredTime;
    private String interestRate;
    private String principal;
    private String type;

  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }

  public Long getInterestAccuredTime() {
    return interestAccuredTime;
  }

  public void setInterestAccuredTime(Long interestAccuredTime) {
    this.interestAccuredTime = interestAccuredTime;
  }

  public String getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(String interestRate) {
    this.interestRate = interestRate;
  }

  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("asset", asset)
                .append("interest", interest)
                .append("interestAccuredTime", interestAccuredTime)
                .append("interestRate", interestRate)
                .append("principal", principal)
                .append("type", type)
                .toString();
    }
}
