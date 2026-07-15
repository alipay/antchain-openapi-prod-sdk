// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryBiddingspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运行日期，yyyy-mm-dd
    @NameInMap("query_date")
    @Validation(required = true)
    public String queryDate;

    // 业务类型枚举，枚举范围如下
    // BIDDING_SPACE: 竞价空间
    // 
    @NameInMap("busi_type")
    @Validation(required = true)
    public String busiType;

    // 业务偏差类型枚举，枚举范围：
    // DAY_AHEAD_ACTUAL: 日前-实际
    // DAY_AHEAD_FORECAST: 日前-预测
    // PRE_CLEARING_ACTUAL: 预出清-实际
    // PRE_CLEARING_FORECAST: 预出清-预测
    // ACTUAL_FORECAST: 实际-预测
    // PRE_CLEARING: 预出清
    // DAY_AHEAD: 日前
    // REAL_TIME: 实时
    // ACTUAL: 实际
    @NameInMap("deviation_type")
    @Validation(required = true)
    public String deviationType;

    // 省地区编码，目前仅支持江苏省
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    public static QueryBiddingspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBiddingspaceRequest self = new QueryBiddingspaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryBiddingspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBiddingspaceRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

    public QueryBiddingspaceRequest setBusiType(String busiType) {
        this.busiType = busiType;
        return this;
    }
    public String getBusiType() {
        return this.busiType;
    }

    public QueryBiddingspaceRequest setDeviationType(String deviationType) {
        this.deviationType = deviationType;
        return this;
    }
    public String getDeviationType() {
        return this.deviationType;
    }

    public QueryBiddingspaceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
