// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class GwVerifyViewResult extends TeaModel {
    // 核身上下文id
    @NameInMap("verify_id")
    @Validation(required = true)
    public String verifyId;

    // 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 核身分组
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // 返回结果
    @NameInMap("response_params")
    @Validation(required = true)
    public java.util.List<NameValuePair> responseParams;

    // 核身渲染是否调用成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 返回码
    @NameInMap("result_code")
    public String resultCode;

    // 返回信息
    @NameInMap("result_msg")
    public String resultMsg;

    public static GwVerifyViewResult build(java.util.Map<String, ?> map) throws Exception {
        GwVerifyViewResult self = new GwVerifyViewResult();
        return TeaModel.build(map, self);
    }

    public GwVerifyViewResult setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public GwVerifyViewResult setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GwVerifyViewResult setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GwVerifyViewResult setResponseParams(java.util.List<NameValuePair> responseParams) {
        this.responseParams = responseParams;
        return this;
    }
    public java.util.List<NameValuePair> getResponseParams() {
        return this.responseParams;
    }

    public GwVerifyViewResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GwVerifyViewResult setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GwVerifyViewResult setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
