// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCutpaymentSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 入参加密模式：
    // "0"（默认值）：不加密；
    // "6"：AES加密
    // 默认为"0"
    @NameInMap("encrypt_type")
    public String encryptType;

    // 加密密钥
    @NameInMap("encrypt_token")
    public String encryptToken;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 预签约返回的预签约唯一码
    @NameInMap("pre_bind_sn")
    @Validation(required = true)
    public String preBindSn;

    // 签约短信验证码
    @NameInMap("sms_code")
    @Validation(required = true)
    public String smsCode;

    public static BindCutpaymentSignRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCutpaymentSignRequest self = new BindCutpaymentSignRequest();
        return TeaModel.build(map, self);
    }

    public BindCutpaymentSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindCutpaymentSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindCutpaymentSignRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public BindCutpaymentSignRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public BindCutpaymentSignRequest setEncryptToken(String encryptToken) {
        this.encryptToken = encryptToken;
        return this;
    }
    public String getEncryptToken() {
        return this.encryptToken;
    }

    public BindCutpaymentSignRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BindCutpaymentSignRequest setPreBindSn(String preBindSn) {
        this.preBindSn = preBindSn;
        return this;
    }
    public String getPreBindSn() {
        return this.preBindSn;
    }

    public BindCutpaymentSignRequest setSmsCode(String smsCode) {
        this.smsCode = smsCode;
        return this;
    }
    public String getSmsCode() {
        return this.smsCode;
    }

}
