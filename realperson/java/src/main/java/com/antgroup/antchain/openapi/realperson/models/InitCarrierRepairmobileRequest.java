// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class InitCarrierRepairmobileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 流程ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，用于流程串联。
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 运营商类型，取值如下：
    // CHINA_TELECOM：中国电信
    // CHINA_MOBILE：中国移动
    // CHINA_UNICOM：中国联通
    @NameInMap("carrier")
    @Validation(required = true)
    public String carrier;

    // 入参加密模式：
    // "0"（默认值）：不加密；
    // "2"：身份证号、曾用手机号字段都需填写SHA256加密后的字符串。
    // 默认未"0"
    @NameInMap("encrypt_type")
    public String encryptType;

    // 失联修复身份证号，使用入参加密模式加密
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 用户姓名，明文
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 曾用手机号码，使用入参加密模式加密
    @NameInMap("mobile")
    public String mobile;

    public static InitCarrierRepairmobileRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCarrierRepairmobileRequest self = new InitCarrierRepairmobileRequest();
        return TeaModel.build(map, self);
    }

    public InitCarrierRepairmobileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCarrierRepairmobileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitCarrierRepairmobileRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public InitCarrierRepairmobileRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public InitCarrierRepairmobileRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public InitCarrierRepairmobileRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public InitCarrierRepairmobileRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitCarrierRepairmobileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InitCarrierRepairmobileRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
