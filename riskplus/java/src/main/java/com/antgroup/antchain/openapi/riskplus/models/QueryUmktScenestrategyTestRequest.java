// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktScenestrategyTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 查询模版
    @NameInMap("query_template")
    public String queryTemplate;

    // 用户查询凭证列表
    // 
    @NameInMap("customer_keys")
    @Validation(required = true)
    public java.util.List<String> customerKeys;

    // 业务方流水号
    @NameInMap("biz_serial_no")
    @Validation(required = true)
    public String bizSerialNo;

    // 伪装租户id
    @NameInMap("pretend_tenant")
    @Validation(required = true)
    public String pretendTenant;

    public static QueryUmktScenestrategyTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktScenestrategyTestRequest self = new QueryUmktScenestrategyTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktScenestrategyTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktScenestrategyTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktScenestrategyTestRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public QueryUmktScenestrategyTestRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public QueryUmktScenestrategyTestRequest setCustomerKeys(java.util.List<String> customerKeys) {
        this.customerKeys = customerKeys;
        return this;
    }
    public java.util.List<String> getCustomerKeys() {
        return this.customerKeys;
    }

    public QueryUmktScenestrategyTestRequest setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
        return this;
    }
    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

    public QueryUmktScenestrategyTestRequest setPretendTenant(String pretendTenant) {
        this.pretendTenant = pretendTenant;
        return this;
    }
    public String getPretendTenant() {
        return this.pretendTenant;
    }

}
