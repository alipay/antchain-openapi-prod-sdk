// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CallbackThingServicebyeventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
    @NameInMap("biz_type")
    public String bizType;

    // 回复日期
    @NameInMap("submit_date")
    public String submitDate;

    // 物模型服务回复数据的模型ID
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // 物模型服务回复数据的内容，格式遵循dataModelId约定的格式
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static CallbackThingServicebyeventRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackThingServicebyeventRequest self = new CallbackThingServicebyeventRequest();
        return TeaModel.build(map, self);
    }

    public CallbackThingServicebyeventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackThingServicebyeventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackThingServicebyeventRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CallbackThingServicebyeventRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CallbackThingServicebyeventRequest setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
        return this;
    }
    public String getSubmitDate() {
        return this.submitDate;
    }

    public CallbackThingServicebyeventRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public CallbackThingServicebyeventRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
