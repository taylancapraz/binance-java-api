package com.binance.api.client.domain.margin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Account information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InterestListModel {
    private List<InterestModel> rows;

    public List<InterestModel> getRows() {
        return rows;
    }

    public void setRows(List<InterestModel> rows) {
        this.rows = rows;
    }
}
