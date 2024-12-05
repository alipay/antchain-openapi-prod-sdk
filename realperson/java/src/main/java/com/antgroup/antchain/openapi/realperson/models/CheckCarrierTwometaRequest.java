// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckCarrierTwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
    // 0：明文
    // 1：MD5
    @NameInMap("encrypt_type")
    public String encryptType;

    // 要素入参模式：
    // 1：手机号+姓名
    // 2：手机号+身份证号
    @NameInMap("meta_mode")
    @Validation(required = true)
    public String metaMode;

    // 手机号码「支持加密」
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名「支持加密」
    @NameInMap("cert_name")
    public String certName;

    // 身份证号「支持加密」
    @NameInMap("cert_no")
    public String certNo;

    // 运营商类型：
    // CHINA_TELECOM；
    // CHINA_MOBILE；
    // CHINA_UNICOM
    @NameInMap("carrier")
    public String carrier;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static CheckCarrierTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCarrierTwometaRequest self = new CheckCarrierTwometaRequest();
        return TeaModel.build(map, self);
    }

    public CheckCarrierTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCarrierTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckCarrierTwometaRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CheckCarrierTwometaRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public CheckCarrierTwometaRequest setMetaMode(String metaMode) {
        this.metaMode = metaMode;
        return this;
    }
    public String getMetaMode() {
        return this.metaMode;
    }

    public CheckCarrierTwometaRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CheckCarrierTwometaRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CheckCarrierTwometaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckCarrierTwometaRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public CheckCarrierTwometaRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
