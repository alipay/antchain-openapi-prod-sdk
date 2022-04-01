// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class CostInfo extends TeaModel {
    // 成本法原因
    @NameInMap("cost_reason")
    public String costReason;

    // 预期毛利率
    @NameInMap("predict_profit")
    public String predictProfit;

    public static CostInfo build(java.util.Map<String, ?> map) throws Exception {
        CostInfo self = new CostInfo();
        return TeaModel.build(map, self);
    }

    public CostInfo setCostReason(String costReason) {
        this.costReason = costReason;
        return this;
    }
    public String getCostReason() {
        return this.costReason;
    }

    public CostInfo setPredictProfit(String predictProfit) {
        this.predictProfit = predictProfit;
        return this;
    }
    public String getPredictProfit() {
        return this.predictProfit;
    }

}
