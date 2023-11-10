// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktTaskDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传外呼任务返回的callId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 手机号列表
    @NameInMap("customer_keys")
    @Validation(required = true)
    public java.util.List<String> customerKeys;

    // 手机号类型
    @NameInMap("key_template")
    @Validation(required = true)
    public String keyTemplate;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 开始外呼时间，只可查询最近30天的日期
    @NameInMap("call_date")
    public String callDate;

    // 结束外呼时间
    @NameInMap("end_call_date")
    public String endCallDate;

    public static BatchqueryUmktTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktTaskDetailRequest self = new BatchqueryUmktTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktTaskDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktTaskDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktTaskDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BatchqueryUmktTaskDetailRequest setCustomerKeys(java.util.List<String> customerKeys) {
        this.customerKeys = customerKeys;
        return this;
    }
    public java.util.List<String> getCustomerKeys() {
        return this.customerKeys;
    }

    public BatchqueryUmktTaskDetailRequest setKeyTemplate(String keyTemplate) {
        this.keyTemplate = keyTemplate;
        return this;
    }
    public String getKeyTemplate() {
        return this.keyTemplate;
    }

    public BatchqueryUmktTaskDetailRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public BatchqueryUmktTaskDetailRequest setCallDate(String callDate) {
        this.callDate = callDate;
        return this;
    }
    public String getCallDate() {
        return this.callDate;
    }

    public BatchqueryUmktTaskDetailRequest setEndCallDate(String endCallDate) {
        this.endCallDate = endCallDate;
        return this;
    }
    public String getEndCallDate() {
        return this.endCallDate;
    }

}
