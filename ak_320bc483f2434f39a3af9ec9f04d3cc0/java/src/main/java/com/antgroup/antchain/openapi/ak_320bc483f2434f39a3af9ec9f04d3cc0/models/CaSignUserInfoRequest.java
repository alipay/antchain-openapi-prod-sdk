// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSignUserInfoRequest extends TeaModel {
    // 用户类型个人:PERSON 机构:ORG
    @NameInMap("sign_user_type")
    @Validation(required = true)
    public String signUserType;

    // 签署方名称，个人传真实姓名：张三 机构传机构正确的名称：xxx责任有限公司
    @NameInMap("signer_name")
    @Validation(required = true)
    public String signerName;

    // 授权签署时的签署人证件类型,签署方证件类型 CRED_PSN_CH_IDCARD(大陆身份证) CRED_ORG_USCC(统一社会信用代码)
    @NameInMap("signer_cert_type")
    @Validation(required = true)
    public String signerCertType;

    // 签署方证件号码,签署方证件号码： 个人传递身份证件号 企业传递统一社会信用编码
    @NameInMap("signer_cert_number")
    @Validation(required = true)
    public String signerCertNumber;

    // 企业子类型,signUserType为org时必选 企业子类型 * BUS("BUS", "企业"), * SINGLE("SINGLE", "个体工商户"), * GOV("GOV", "党政机关"), * INST("INST", "事业单位"), * COMMON("COMMON", "社会组织"), * OTHER("OTHER", "其他组织")
    @NameInMap("sign_sub_type")
    public String signSubType;

    // 是否指定授权人签署
    @NameInMap("authorized")
    public String authorized;

    // authorized=1时必填,签署方名称
    @NameInMap("auth_signer_name")
    public String authSignerName;

    // authorized=1 时必填,授权签署时的签署人证件类型
    @NameInMap("auth_signer_cert_type")
    public String authSignerCertType;

    // authorized=1 时必填,授权签署方证件号码
    @NameInMap("auth_signer_cert_number")
    public String authSignerCertNumber;

    // 手机号，用于发送签署短信
    @NameInMap("mobile")
    public String mobile;

    // 邮箱联系方式
    @NameInMap("email")
    public String email;

    // 签署顺序，默认-1无签署顺序
    @NameInMap("order")
    public String order;

    // 是否自动签署,ture为需要自动签署，false为手动签署
    @NameInMap("auto_sign")
    @Validation(required = true)
    public Boolean autoSign;

    // 签署文件列表（包含印模和签署区域）
    @NameInMap("system_sign_file_request_list")
    @Validation(required = true)
    public java.util.List<CaSystemSignFileRequest> systemSignFileRequestList;

    public static CaSignUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSignUserInfoRequest self = new CaSignUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public CaSignUserInfoRequest setSignUserType(String signUserType) {
        this.signUserType = signUserType;
        return this;
    }
    public String getSignUserType() {
        return this.signUserType;
    }

    public CaSignUserInfoRequest setSignerName(String signerName) {
        this.signerName = signerName;
        return this;
    }
    public String getSignerName() {
        return this.signerName;
    }

    public CaSignUserInfoRequest setSignerCertType(String signerCertType) {
        this.signerCertType = signerCertType;
        return this;
    }
    public String getSignerCertType() {
        return this.signerCertType;
    }

    public CaSignUserInfoRequest setSignerCertNumber(String signerCertNumber) {
        this.signerCertNumber = signerCertNumber;
        return this;
    }
    public String getSignerCertNumber() {
        return this.signerCertNumber;
    }

    public CaSignUserInfoRequest setSignSubType(String signSubType) {
        this.signSubType = signSubType;
        return this;
    }
    public String getSignSubType() {
        return this.signSubType;
    }

    public CaSignUserInfoRequest setAuthorized(String authorized) {
        this.authorized = authorized;
        return this;
    }
    public String getAuthorized() {
        return this.authorized;
    }

    public CaSignUserInfoRequest setAuthSignerName(String authSignerName) {
        this.authSignerName = authSignerName;
        return this;
    }
    public String getAuthSignerName() {
        return this.authSignerName;
    }

    public CaSignUserInfoRequest setAuthSignerCertType(String authSignerCertType) {
        this.authSignerCertType = authSignerCertType;
        return this;
    }
    public String getAuthSignerCertType() {
        return this.authSignerCertType;
    }

    public CaSignUserInfoRequest setAuthSignerCertNumber(String authSignerCertNumber) {
        this.authSignerCertNumber = authSignerCertNumber;
        return this;
    }
    public String getAuthSignerCertNumber() {
        return this.authSignerCertNumber;
    }

    public CaSignUserInfoRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CaSignUserInfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CaSignUserInfoRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public CaSignUserInfoRequest setAutoSign(Boolean autoSign) {
        this.autoSign = autoSign;
        return this;
    }
    public Boolean getAutoSign() {
        return this.autoSign;
    }

    public CaSignUserInfoRequest setSystemSignFileRequestList(java.util.List<CaSystemSignFileRequest> systemSignFileRequestList) {
        this.systemSignFileRequestList = systemSignFileRequestList;
        return this;
    }
    public java.util.List<CaSystemSignFileRequest> getSystemSignFileRequestList() {
        return this.systemSignFileRequestList;
    }

}
