// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryDeepsecRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区分不同应用
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // app_key
    @NameInMap("app_key")
    public String appKey;

    // 业务数据集合，包括业务数据如zimId，Map<String,String>
    @NameInMap("biz_data")
    @Validation(required = true)
    public String bizData;

    // 风险数据集合，包括加密的R风险数据、设备染色数据，Map<String, String>
    @NameInMap("risk_data")
    @Validation(required = true)
    public String riskData;

    public static QueryDeepsecRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeepsecRiskRequest self = new QueryDeepsecRiskRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeepsecRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeepsecRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeepsecRiskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDeepsecRiskRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public QueryDeepsecRiskRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public QueryDeepsecRiskRequest setRiskData(String riskData) {
        this.riskData = riskData;
        return this;
    }
    public String getRiskData() {
        return this.riskData;
    }

}
