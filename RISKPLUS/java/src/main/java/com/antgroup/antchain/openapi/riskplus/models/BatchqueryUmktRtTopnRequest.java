// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRtTopnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 用户列表传输模版
    @NameInMap("query_template")
    @Validation(required = true)
    public String queryTemplate;

    // 用户凭证信息
    @NameInMap("customer_keys")
    @Validation(required = true)
    public java.util.List<String> customerKeys;

    // 业务流水号
    @NameInMap("biz_serial_no")
    @Validation(required = true)
    public String bizSerialNo;

    // 访问类型，PROD/TEST，正式流量/测试流量
    @NameInMap("visit_type")
    @Validation(required = true)
    public String visitType;

    public static BatchqueryUmktRtTopnRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRtTopnRequest self = new BatchqueryUmktRtTopnRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRtTopnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktRtTopnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktRtTopnRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public BatchqueryUmktRtTopnRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public BatchqueryUmktRtTopnRequest setCustomerKeys(java.util.List<String> customerKeys) {
        this.customerKeys = customerKeys;
        return this;
    }
    public java.util.List<String> getCustomerKeys() {
        return this.customerKeys;
    }

    public BatchqueryUmktRtTopnRequest setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
        return this;
    }
    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

    public BatchqueryUmktRtTopnRequest setVisitType(String visitType) {
        this.visitType = visitType;
        return this;
    }
    public String getVisitType() {
        return this.visitType;
    }

}
