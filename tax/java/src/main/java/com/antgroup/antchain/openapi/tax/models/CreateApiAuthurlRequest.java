// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class CreateApiAuthurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 01发票归集授权 02记账 03报销 11发票贷授权（0X发票相关授权，1X金融类授权）
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 纳税人识别号
    @NameInMap("nsrsbh")
    @Validation(required = true)
    public String nsrsbh;

    // 企业名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 授权回调地址，授权成功后，会跳转该地址，该地址填接入方自己的接收授权结果的地址
    @NameInMap("call_back_url")
    @Validation(required = true)
    public String callBackUrl;

    // 机构代码
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 已认证的法人手机号
    @NameInMap("cognizant_mobile")
    public String cognizantMobile;

    // 已认证的法人姓名
    @NameInMap("cognizant_name")
    public String cognizantName;

    // 已认证的法人身份证号
    @NameInMap("identity_number")
    public String identityNumber;

    // 订单号，用于幂等控制，每次新生成，如果不填我方会自动生成一个
    @NameInMap("order_no")
    public String orderNo;

    // 登录方式，ACCOUNT_PASS：账密，ALL：全部(包括账密和扫码)，默认为ALL（全部）
    @NameInMap("login_mode")
    public String loginMode;

    public static CreateApiAuthurlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiAuthurlRequest self = new CreateApiAuthurlRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiAuthurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApiAuthurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateApiAuthurlRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateApiAuthurlRequest setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
        return this;
    }
    public String getNsrsbh() {
        return this.nsrsbh;
    }

    public CreateApiAuthurlRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateApiAuthurlRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public CreateApiAuthurlRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public CreateApiAuthurlRequest setCognizantMobile(String cognizantMobile) {
        this.cognizantMobile = cognizantMobile;
        return this;
    }
    public String getCognizantMobile() {
        return this.cognizantMobile;
    }

    public CreateApiAuthurlRequest setCognizantName(String cognizantName) {
        this.cognizantName = cognizantName;
        return this;
    }
    public String getCognizantName() {
        return this.cognizantName;
    }

    public CreateApiAuthurlRequest setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }
    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public CreateApiAuthurlRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CreateApiAuthurlRequest setLoginMode(String loginMode) {
        this.loginMode = loginMode;
        return this;
    }
    public String getLoginMode() {
        return this.loginMode;
    }

}
