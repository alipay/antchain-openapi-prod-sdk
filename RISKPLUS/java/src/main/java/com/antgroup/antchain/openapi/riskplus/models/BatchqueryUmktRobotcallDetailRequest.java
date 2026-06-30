// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRobotcallDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传外呼任务返回的callId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 手机号
    @NameInMap("phone_numbers")
    @Validation(required = true)
    public java.util.List<String> phoneNumbers;

    // 手机号类型
    @NameInMap("template_type")
    @Validation(required = true)
    public String templateType;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 意向标签
    @NameInMap("intent_tags")
    public java.util.List<String> intentTags;

    // 开始外呼时间
    @NameInMap("call_date")
    public String callDate;

    // 结束外呼时间
    @NameInMap("end_call_date")
    public String endCallDate;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页数
    @NameInMap("page_size")
    public Long pageSize;

    public static BatchqueryUmktRobotcallDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRobotcallDetailRequest self = new BatchqueryUmktRobotcallDetailRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRobotcallDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktRobotcallDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktRobotcallDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BatchqueryUmktRobotcallDetailRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public BatchqueryUmktRobotcallDetailRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public BatchqueryUmktRobotcallDetailRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public BatchqueryUmktRobotcallDetailRequest setIntentTags(java.util.List<String> intentTags) {
        this.intentTags = intentTags;
        return this;
    }
    public java.util.List<String> getIntentTags() {
        return this.intentTags;
    }

    public BatchqueryUmktRobotcallDetailRequest setCallDate(String callDate) {
        this.callDate = callDate;
        return this;
    }
    public String getCallDate() {
        return this.callDate;
    }

    public BatchqueryUmktRobotcallDetailRequest setEndCallDate(String endCallDate) {
        this.endCallDate = endCallDate;
        return this;
    }
    public String getEndCallDate() {
        return this.endCallDate;
    }

    public BatchqueryUmktRobotcallDetailRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryUmktRobotcallDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
