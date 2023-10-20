// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ResultList extends TeaModel {
    // 结果列表
    @NameInMap("risk_results")
    @Validation(required = true)
    public java.util.List<RiskResult> riskResults;

    // 入参列表，数组
    @NameInMap("biz_params")
    @Validation(required = true)
    public java.util.List<BizParam> bizParams;

    public static ResultList build(java.util.Map<String, ?> map) throws Exception {
        ResultList self = new ResultList();
        return TeaModel.build(map, self);
    }

    public ResultList setRiskResults(java.util.List<RiskResult> riskResults) {
        this.riskResults = riskResults;
        return this;
    }
    public java.util.List<RiskResult> getRiskResults() {
        return this.riskResults;
    }

    public ResultList setBizParams(java.util.List<BizParam> bizParams) {
        this.bizParams = bizParams;
        return this;
    }
    public java.util.List<BizParam> getBizParams() {
        return this.bizParams;
    }

}
