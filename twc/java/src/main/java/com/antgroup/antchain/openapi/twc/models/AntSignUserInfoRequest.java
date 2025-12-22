// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AntSignUserInfoRequest extends TeaModel {
    // signUserId
    /**
     * <strong>example:</strong>
     * <p>signUserId</p>
     */
    @NameInMap("sign_user_id")
    public String signUserId;

    // 是否为我方（蚂蚁域）公司
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("our_corp")
    @Validation(required = true)
    public Boolean ourCorp;

    // 签署文件列表（包含印模和签署区域）
    @NameInMap("ca_system_sign_file_request_list")
    @Validation(required = true)
    public java.util.List<CaSystemSignFileRequest> caSystemSignFileRequestList;

    // 用户类型
    /**
     * <strong>example:</strong>
     * <p>PERSON：个人 ORG：机构</p>
     */
    @NameInMap("sign_user_type")
    @Validation(required = true)
    public String signUserType;

    // 签署人名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("signer_name")
    @Validation(required = true)
    public String signerName;

    // 签署人证件类型
    /**
     * <strong>example:</strong>
     * <p>CRED_PSN_CH_IDCARD：大陆身份证 CRED_ORG_USCC：统一社会信用代码</p>
     */
    @NameInMap("signer_cert_type")
    @Validation(required = true)
    public String signerCertType;

    // 签署人证件号码
    /**
     * <strong>example:</strong>
     * <p>4201212121212121</p>
     */
    @NameInMap("signer_cert_number")
    @Validation(required = true)
    public String signerCertNumber;

    // 企业子类型
    /**
     * <strong>example:</strong>
     * <p>企业子类型</p>
     */
    @NameInMap("sign_sub_type")
    public String signSubType;

    // 签署方联系手机号
    /**
     * <strong>example:</strong>
     * <p>12313124112</p>
     */
    @NameInMap("mobile")
    public String mobile;

    // 邮件联系地址
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:1212121@163.com">1212121@163.com</a></p>
     */
    @NameInMap("email")
    public String email;

    // 签署顺序
    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("order")
    public Long order;

    // 是否自动签署
    // true：自动签署需传递坐标信息
    // false：非自动签署，不需要传递坐标信息，签署文件会发送给签署方签署
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("auto_sign")
    @Validation(required = true)
    public Boolean autoSign;

    // 签署方签署操作人签署时支持的印章来源类型目前支持上传公章(UPLOAD)、手写签名(PERSONAL)
    /**
     * <strong>example:</strong>
     * <p>[&quot;UPLOAD&quot;,&quot;PERSONAL&quot;]</p>
     */
    @NameInMap("seal_source_types")
    public java.util.List<String> sealSourceTypes;

    public static AntSignUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AntSignUserInfoRequest self = new AntSignUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public AntSignUserInfoRequest setSignUserId(String signUserId) {
        this.signUserId = signUserId;
        return this;
    }
    public String getSignUserId() {
        return this.signUserId;
    }

    public AntSignUserInfoRequest setOurCorp(Boolean ourCorp) {
        this.ourCorp = ourCorp;
        return this;
    }
    public Boolean getOurCorp() {
        return this.ourCorp;
    }

    public AntSignUserInfoRequest setCaSystemSignFileRequestList(java.util.List<CaSystemSignFileRequest> caSystemSignFileRequestList) {
        this.caSystemSignFileRequestList = caSystemSignFileRequestList;
        return this;
    }
    public java.util.List<CaSystemSignFileRequest> getCaSystemSignFileRequestList() {
        return this.caSystemSignFileRequestList;
    }

    public AntSignUserInfoRequest setSignUserType(String signUserType) {
        this.signUserType = signUserType;
        return this;
    }
    public String getSignUserType() {
        return this.signUserType;
    }

    public AntSignUserInfoRequest setSignerName(String signerName) {
        this.signerName = signerName;
        return this;
    }
    public String getSignerName() {
        return this.signerName;
    }

    public AntSignUserInfoRequest setSignerCertType(String signerCertType) {
        this.signerCertType = signerCertType;
        return this;
    }
    public String getSignerCertType() {
        return this.signerCertType;
    }

    public AntSignUserInfoRequest setSignerCertNumber(String signerCertNumber) {
        this.signerCertNumber = signerCertNumber;
        return this;
    }
    public String getSignerCertNumber() {
        return this.signerCertNumber;
    }

    public AntSignUserInfoRequest setSignSubType(String signSubType) {
        this.signSubType = signSubType;
        return this;
    }
    public String getSignSubType() {
        return this.signSubType;
    }

    public AntSignUserInfoRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public AntSignUserInfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AntSignUserInfoRequest setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public AntSignUserInfoRequest setAutoSign(Boolean autoSign) {
        this.autoSign = autoSign;
        return this;
    }
    public Boolean getAutoSign() {
        return this.autoSign;
    }

    public AntSignUserInfoRequest setSealSourceTypes(java.util.List<String> sealSourceTypes) {
        this.sealSourceTypes = sealSourceTypes;
        return this;
    }
    public java.util.List<String> getSealSourceTypes() {
        return this.sealSourceTypes;
    }

}
