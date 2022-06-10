// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class InitVerifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
    @NameInMap("verify_scene")
    @Validation(required = true)
    public GwVerifyScene verifyScene;

    // 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 调用方传入，存放业务扩展参数（callback参数也写入此）
    @NameInMap("extern_params")
    public java.util.List<NameValuePair> externParams;

    // 调用方传入，指定核身完成后的回调类型
    @NameInMap("callback_enum")
    public String callbackEnum;

    // 核身产品列表
    @NameInMap("validate_flows")
    @Validation(required = true)
    public java.util.List<GwValidateProduct> validateFlows;

    public static InitVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitVerifyRequest self = new InitVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitVerifyRequest setVerifyScene(GwVerifyScene verifyScene) {
        this.verifyScene = verifyScene;
        return this;
    }
    public GwVerifyScene getVerifyScene() {
        return this.verifyScene;
    }

    public InitVerifyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitVerifyRequest setExternParams(java.util.List<NameValuePair> externParams) {
        this.externParams = externParams;
        return this;
    }
    public java.util.List<NameValuePair> getExternParams() {
        return this.externParams;
    }

    public InitVerifyRequest setCallbackEnum(String callbackEnum) {
        this.callbackEnum = callbackEnum;
        return this;
    }
    public String getCallbackEnum() {
        return this.callbackEnum;
    }

    public InitVerifyRequest setValidateFlows(java.util.List<GwValidateProduct> validateFlows) {
        this.validateFlows = validateFlows;
        return this;
    }
    public java.util.List<GwValidateProduct> getValidateFlows() {
        return this.validateFlows;
    }

}
