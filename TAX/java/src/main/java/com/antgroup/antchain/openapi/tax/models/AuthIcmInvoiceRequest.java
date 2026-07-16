// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AuthIcmInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 查询的企业纳税人识别号
    // 
    @NameInMap("nsrsbh")
    @Validation(required = true)
    public String nsrsbh;

    // 企业名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 身份证号
    @NameInMap("identity_number")
    @Validation(required = true)
    public String identityNumber;

    // 已认证的法人手机号
    @NameInMap("cognizant_mobile")
    @Validation(required = true)
    public String cognizantMobile;

    // 已认证的法人姓名
    @NameInMap("cognizant_name")
    @Validation(required = true)
    public String cognizantName;

    // 透传字段
    @NameInMap("biz_context")
    public String bizContext;

    // 授权业务类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    public static AuthIcmInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthIcmInvoiceRequest self = new AuthIcmInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public AuthIcmInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthIcmInvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthIcmInvoiceRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthIcmInvoiceRequest setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
        return this;
    }
    public String getNsrsbh() {
        return this.nsrsbh;
    }

    public AuthIcmInvoiceRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public AuthIcmInvoiceRequest setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }
    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public AuthIcmInvoiceRequest setCognizantMobile(String cognizantMobile) {
        this.cognizantMobile = cognizantMobile;
        return this;
    }
    public String getCognizantMobile() {
        return this.cognizantMobile;
    }

    public AuthIcmInvoiceRequest setCognizantName(String cognizantName) {
        this.cognizantName = cognizantName;
        return this;
    }
    public String getCognizantName() {
        return this.cognizantName;
    }

    public AuthIcmInvoiceRequest setBizContext(String bizContext) {
        this.bizContext = bizContext;
        return this;
    }
    public String getBizContext() {
        return this.bizContext;
    }

    public AuthIcmInvoiceRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
