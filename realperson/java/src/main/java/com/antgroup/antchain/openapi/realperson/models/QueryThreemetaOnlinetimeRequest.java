// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryThreemetaOnlinetimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求id
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 手机号码
    @NameInMap("phone_no")
    @Validation(required = true)
    public String phoneNo;

    // 是否区分运营商
    @NameInMap("div_carrier")
    public Boolean divCarrier;

    // 运营商类型
    @NameInMap("carrier")
    public String carrier;

    // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
    // 0：明文
    // 1：MD5
    @NameInMap("encrypt_type")
    public String encryptType;

    // 扩展参数
    @NameInMap("extern_param")
    public String externParam;

    public static QueryThreemetaOnlinetimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThreemetaOnlinetimeRequest self = new QueryThreemetaOnlinetimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryThreemetaOnlinetimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryThreemetaOnlinetimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryThreemetaOnlinetimeRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryThreemetaOnlinetimeRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public QueryThreemetaOnlinetimeRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryThreemetaOnlinetimeRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public QueryThreemetaOnlinetimeRequest setDivCarrier(Boolean divCarrier) {
        this.divCarrier = divCarrier;
        return this;
    }
    public Boolean getDivCarrier() {
        return this.divCarrier;
    }

    public QueryThreemetaOnlinetimeRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public QueryThreemetaOnlinetimeRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryThreemetaOnlinetimeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
