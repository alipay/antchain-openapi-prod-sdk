// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRtMarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景营销策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 用户列表传输模版
    @NameInMap("query_template")
    public String queryTemplate;

    // 用户查询凭证列表
    @NameInMap("customer_keys")
    @Validation(required = true)
    public java.util.List<String> customerKeys;

    // 业务方流水号
    @NameInMap("biz_serial_no")
    @Validation(required = true)
    public String bizSerialNo;

    // 访问类型，PROD/TEST，正式流量/测试流量
    @NameInMap("visit_type")
    public String visitType;

    // 圈客阈值干预参数，json-map格式
    @NameInMap("biz_properties")
    public String bizProperties;

    public static BatchqueryUmktRtMarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRtMarketingRequest self = new BatchqueryUmktRtMarketingRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRtMarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktRtMarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktRtMarketingRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public BatchqueryUmktRtMarketingRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public BatchqueryUmktRtMarketingRequest setCustomerKeys(java.util.List<String> customerKeys) {
        this.customerKeys = customerKeys;
        return this;
    }
    public java.util.List<String> getCustomerKeys() {
        return this.customerKeys;
    }

    public BatchqueryUmktRtMarketingRequest setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
        return this;
    }
    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

    public BatchqueryUmktRtMarketingRequest setVisitType(String visitType) {
        this.visitType = visitType;
        return this;
    }
    public String getVisitType() {
        return this.visitType;
    }

    public BatchqueryUmktRtMarketingRequest setBizProperties(String bizProperties) {
        this.bizProperties = bizProperties;
        return this;
    }
    public String getBizProperties() {
        return this.bizProperties;
    }

}
