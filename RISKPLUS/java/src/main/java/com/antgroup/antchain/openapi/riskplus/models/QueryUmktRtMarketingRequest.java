// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktRtMarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id，决策重点
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 用户凭证模版
    @NameInMap("query_template")
    @Validation(required = true)
    public String queryTemplate;

    // 用户查询凭证
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 业务流水号
    @NameInMap("biz_serial_no")
    @Validation(required = true)
    public String bizSerialNo;

    public static QueryUmktRtMarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktRtMarketingRequest self = new QueryUmktRtMarketingRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktRtMarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktRtMarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktRtMarketingRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public QueryUmktRtMarketingRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public QueryUmktRtMarketingRequest setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public QueryUmktRtMarketingRequest setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
        return this;
    }
    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

}
