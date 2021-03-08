// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetInternalMasterResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 证件ID
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    // 所属客户ID
    @NameInMap("customer_id")
    public String customerId;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 企业认证名称
    @NameInMap("firm_name")
    public String firmName;

    // havanaId
    @NameInMap("havana_id")
    public String havanaId;

    // 主账号ID
    @NameInMap("id")
    public String id;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 手机
    @NameInMap("mobile")
    public String mobile;

    // 真实姓名
    @NameInMap("real_name")
    public String realName;

    // 来源用户类型，CUSTOMER（企业用户），PERSONAL（个人用户）
    @NameInMap("source_user_type")
    public String sourceUserType;

    // 主账号行业标签，I表示金融机构，C表示特殊机构，N表示非金融机构
    @NameInMap("industry_label")
    public String industryLabel;

    public static GetInternalMasterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInternalMasterResponse self = new GetInternalMasterResponse();
        return TeaModel.build(map, self);
    }

    public GetInternalMasterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInternalMasterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInternalMasterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInternalMasterResponse setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public GetInternalMasterResponse setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public GetInternalMasterResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public GetInternalMasterResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetInternalMasterResponse setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public GetInternalMasterResponse setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public GetInternalMasterResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetInternalMasterResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetInternalMasterResponse setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public GetInternalMasterResponse setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public GetInternalMasterResponse setSourceUserType(String sourceUserType) {
        this.sourceUserType = sourceUserType;
        return this;
    }
    public String getSourceUserType() {
        return this.sourceUserType;
    }

    public GetInternalMasterResponse setIndustryLabel(String industryLabel) {
        this.industryLabel = industryLabel;
        return this;
    }
    public String getIndustryLabel() {
        return this.industryLabel;
    }

}
