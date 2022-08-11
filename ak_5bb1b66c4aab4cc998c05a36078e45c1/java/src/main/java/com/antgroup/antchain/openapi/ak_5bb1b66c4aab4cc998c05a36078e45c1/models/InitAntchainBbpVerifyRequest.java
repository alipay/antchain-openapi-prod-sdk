// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class InitAntchainBbpVerifyRequest extends TeaModel {
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

    // 核身id
    @NameInMap("verify_id")
    public String verifyId;

    // 核身请求地址url
    @NameInMap("verify_url")
    public String verifyUrl;

    // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
    @NameInMap("verify_status")
    public String verifyStatus;

    // 可用产品集合
    @NameInMap("valid_prod")
    public java.util.List<GwValidateProduct> validProd;

    public static InitAntchainBbpVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainBbpVerifyRequest self = new InitAntchainBbpVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitAntchainBbpVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntchainBbpVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntchainBbpVerifyRequest setVerifyScene(GwVerifyScene verifyScene) {
        this.verifyScene = verifyScene;
        return this;
    }
    public GwVerifyScene getVerifyScene() {
        return this.verifyScene;
    }

    public InitAntchainBbpVerifyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitAntchainBbpVerifyRequest setExternParams(java.util.List<NameValuePair> externParams) {
        this.externParams = externParams;
        return this;
    }
    public java.util.List<NameValuePair> getExternParams() {
        return this.externParams;
    }

    public InitAntchainBbpVerifyRequest setCallbackEnum(String callbackEnum) {
        this.callbackEnum = callbackEnum;
        return this;
    }
    public String getCallbackEnum() {
        return this.callbackEnum;
    }

    public InitAntchainBbpVerifyRequest setValidateFlows(java.util.List<GwValidateProduct> validateFlows) {
        this.validateFlows = validateFlows;
        return this;
    }
    public java.util.List<GwValidateProduct> getValidateFlows() {
        return this.validateFlows;
    }

    public InitAntchainBbpVerifyRequest setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public InitAntchainBbpVerifyRequest setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

    public InitAntchainBbpVerifyRequest setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public String getVerifyStatus() {
        return this.verifyStatus;
    }

    public InitAntchainBbpVerifyRequest setValidProd(java.util.List<GwValidateProduct> validProd) {
        this.validProd = validProd;
        return this;
    }
    public java.util.List<GwValidateProduct> getValidProd() {
        return this.validProd;
    }

}
