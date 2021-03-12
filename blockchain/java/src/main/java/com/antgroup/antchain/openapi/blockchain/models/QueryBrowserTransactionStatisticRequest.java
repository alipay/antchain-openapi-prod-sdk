// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBrowserTransactionStatisticRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizid
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 截止时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    public static QueryBrowserTransactionStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBrowserTransactionStatisticRequest self = new QueryBrowserTransactionStatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryBrowserTransactionStatisticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBrowserTransactionStatisticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBrowserTransactionStatisticRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryBrowserTransactionStatisticRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryBrowserTransactionStatisticRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
