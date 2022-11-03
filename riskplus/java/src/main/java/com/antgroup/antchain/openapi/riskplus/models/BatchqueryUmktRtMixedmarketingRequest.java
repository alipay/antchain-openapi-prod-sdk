// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRtMixedmarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id列表
    @NameInMap("scene_strategy_ids")
    @Validation(required = true)
    public java.util.List<Long> sceneStrategyIds;

    // 场景策略集合code，对标场景策略id列表，一般不可变
    @NameInMap("scene_strategy_set_code")
    public String sceneStrategySetCode;

    // 查询协议模版
    @NameInMap("query_template")
    @Validation(required = true)
    public String queryTemplate;

    // 查询的用户凭证列表
    @NameInMap("customer_keys")
    @Validation(required = true)
    public java.util.List<String> customerKeys;

    // 业务流水号，uuid
    @NameInMap("biz_serial_no")
    @Validation(required = true)
    public String bizSerialNo;

    public static BatchqueryUmktRtMixedmarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRtMixedmarketingRequest self = new BatchqueryUmktRtMixedmarketingRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRtMixedmarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktRtMixedmarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktRtMixedmarketingRequest setSceneStrategyIds(java.util.List<Long> sceneStrategyIds) {
        this.sceneStrategyIds = sceneStrategyIds;
        return this;
    }
    public java.util.List<Long> getSceneStrategyIds() {
        return this.sceneStrategyIds;
    }

    public BatchqueryUmktRtMixedmarketingRequest setSceneStrategySetCode(String sceneStrategySetCode) {
        this.sceneStrategySetCode = sceneStrategySetCode;
        return this;
    }
    public String getSceneStrategySetCode() {
        return this.sceneStrategySetCode;
    }

    public BatchqueryUmktRtMixedmarketingRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public BatchqueryUmktRtMixedmarketingRequest setCustomerKeys(java.util.List<String> customerKeys) {
        this.customerKeys = customerKeys;
        return this;
    }
    public java.util.List<String> getCustomerKeys() {
        return this.customerKeys;
    }

    public BatchqueryUmktRtMixedmarketingRequest setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
        return this;
    }
    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

}
