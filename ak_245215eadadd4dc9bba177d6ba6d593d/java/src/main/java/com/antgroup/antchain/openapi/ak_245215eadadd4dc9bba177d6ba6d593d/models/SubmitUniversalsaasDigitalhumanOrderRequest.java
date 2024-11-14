// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class SubmitUniversalsaasDigitalhumanOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道类型
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 操作类型
    @NameInMap("action_type")
    @Validation(required = true)
    public String actionType;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务自定义信息
    @NameInMap("biz_data")
    @Validation(required = true)
    public String bizData;

    public static SubmitUniversalsaasDigitalhumanOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitUniversalsaasDigitalhumanOrderRequest self = new SubmitUniversalsaasDigitalhumanOrderRequest();
        return TeaModel.build(map, self);
    }

    public SubmitUniversalsaasDigitalhumanOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitUniversalsaasDigitalhumanOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitUniversalsaasDigitalhumanOrderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitUniversalsaasDigitalhumanOrderRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public SubmitUniversalsaasDigitalhumanOrderRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SubmitUniversalsaasDigitalhumanOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitUniversalsaasDigitalhumanOrderRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

}
