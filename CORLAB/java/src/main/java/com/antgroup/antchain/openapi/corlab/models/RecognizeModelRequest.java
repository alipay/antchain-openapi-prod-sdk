// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class RecognizeModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部业务唯一标识id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务域
    @NameInMap("domain_code")
    @Validation(required = true)
    public String domainCode;

    // 模型状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 待计算的模型uuid
    @NameInMap("model_uuid")
    @Validation(required = true)
    public String modelUuid;

    // map的映射的json字符串
    @NameInMap("input_context")
    @Validation(required = true)
    public String inputContext;

    public static RecognizeModelRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeModelRequest self = new RecognizeModelRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RecognizeModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RecognizeModelRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RecognizeModelRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public RecognizeModelRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RecognizeModelRequest setModelUuid(String modelUuid) {
        this.modelUuid = modelUuid;
        return this;
    }
    public String getModelUuid() {
        return this.modelUuid;
    }

    public RecognizeModelRequest setInputContext(String inputContext) {
        this.inputContext = inputContext;
        return this;
    }
    public String getInputContext() {
        return this.inputContext;
    }

}
