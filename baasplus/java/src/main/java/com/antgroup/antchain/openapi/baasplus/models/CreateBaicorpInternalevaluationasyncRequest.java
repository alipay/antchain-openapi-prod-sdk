// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CreateBaicorpInternalevaluationasyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 内部的业务代码
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 回调地址。由于存在异步调用，部分结果通过回调返回数据。例如图片和视频。
    @NameInMap("callback")
    public String callback;

    // 回调参数
    @NameInMap("callback_param")
    public String callbackParam;

    // 业务自定义id，便于识别返回数据对应关系
    @NameInMap("custom_id")
    @Validation(required = true)
    public String customId;

    // 待检测内容RAW数据，目前仅用于text类型，entity_url和entity_data不可同时存在
    @NameInMap("entity_data")
    public String entityData;

    // 待评估内容类型
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 检测内容url，支持HTTPS, entity_url和entity_data不可同时存在
    @NameInMap("entity_url")
    public String entityUrl;

    public static CreateBaicorpInternalevaluationasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaicorpInternalevaluationasyncRequest self = new CreateBaicorpInternalevaluationasyncRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaicorpInternalevaluationasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaicorpInternalevaluationasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaicorpInternalevaluationasyncRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBaicorpInternalevaluationasyncRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public CreateBaicorpInternalevaluationasyncRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public CreateBaicorpInternalevaluationasyncRequest setCallbackParam(String callbackParam) {
        this.callbackParam = callbackParam;
        return this;
    }
    public String getCallbackParam() {
        return this.callbackParam;
    }

    public CreateBaicorpInternalevaluationasyncRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CreateBaicorpInternalevaluationasyncRequest setEntityData(String entityData) {
        this.entityData = entityData;
        return this;
    }
    public String getEntityData() {
        return this.entityData;
    }

    public CreateBaicorpInternalevaluationasyncRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateBaicorpInternalevaluationasyncRequest setEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
        return this;
    }
    public String getEntityUrl() {
        return this.entityUrl;
    }

}
