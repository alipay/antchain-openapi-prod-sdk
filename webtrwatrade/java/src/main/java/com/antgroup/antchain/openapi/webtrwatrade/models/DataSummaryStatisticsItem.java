// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class DataSummaryStatisticsItem extends TeaModel {
    // 日期
    /**
     * <strong>example:</strong>
     * <p>2024-01-01</p>
     */
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 原始币种资产价值
    @NameInMap("total_value_list")
    @Validation(required = true)
    public java.util.List<MultiCurrencyMoney> totalValueList;

    public static DataSummaryStatisticsItem build(java.util.Map<String, ?> map) throws Exception {
        DataSummaryStatisticsItem self = new DataSummaryStatisticsItem();
        return TeaModel.build(map, self);
    }

    public DataSummaryStatisticsItem setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public DataSummaryStatisticsItem setTotalValueList(java.util.List<MultiCurrencyMoney> totalValueList) {
        this.totalValueList = totalValueList;
        return this;
    }
    public java.util.List<MultiCurrencyMoney> getTotalValueList() {
        return this.totalValueList;
    }

}
