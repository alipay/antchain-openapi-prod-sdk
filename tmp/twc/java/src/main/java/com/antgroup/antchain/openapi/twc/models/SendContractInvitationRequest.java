// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendContractInvitationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务方id，重定向和回调时都回传这个id
    @NameInMap("biz_process_id")
    public String bizProcessId;

    // 回调接口地址，默认为空，不回调
    @NameInMap("callback_url")
    public String callbackUrl;

    // 被邀请人邮箱，若手机号和邮箱都传入，则仅手机号有效
    @NameInMap("email")
    public String email;

    // 被邀请人证件号
    @NameInMap("id_number")
    public String idNumber;

    // 被邀请人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
    @NameInMap("invitee_cert_type")
    public String inviteeCertType;

    // 邀请个人实名为PERSON，邀请企业为ORGAN
    @NameInMap("invite_type")
    @Validation(required = true)
    public String inviteType;

    // 企业法定代表人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
    @NameInMap("legal_cert_type")
    public String legalCertType;

    // 企业法定代表人姓名
    @NameInMap("legal_name")
    public String legalName;

    // 企业法定代表人证件号
    @NameInMap("legal_no")
    public String legalNo;

    // 被邀请人手机号
    @NameInMap("mobile")
    public String mobile;

    // 被邀请人姓名
    @NameInMap("name")
    public String name;

    // 默认为空，传入“sms”表示短信，“email”表示邮件，若两者都传入，则只发送短信
    @NameInMap("notify_type")
    public String notifyType;

    // 企业证件号
    @NameInMap("organ_cert_no")
    public String organCertNo;

    // 企业证件类型，详见机构证件类型说明 ，默认CRED_ORG_USCC
    @NameInMap("organ_cert_type")
    public String organCertType;

    // 企业名称
    @NameInMap("organ_name")
    public String organName;

    // 结束后重定向地址（需加前缀https:// 或 http:// ），默认停留在当前页面
    @NameInMap("redirect_url")
    public String redirectUrl;

    public static SendContractInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        SendContractInvitationRequest self = new SendContractInvitationRequest();
        return TeaModel.build(map, self);
    }

    public SendContractInvitationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendContractInvitationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendContractInvitationRequest setBizProcessId(String bizProcessId) {
        this.bizProcessId = bizProcessId;
        return this;
    }
    public String getBizProcessId() {
        return this.bizProcessId;
    }

    public SendContractInvitationRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public SendContractInvitationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SendContractInvitationRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public SendContractInvitationRequest setInviteeCertType(String inviteeCertType) {
        this.inviteeCertType = inviteeCertType;
        return this;
    }
    public String getInviteeCertType() {
        return this.inviteeCertType;
    }

    public SendContractInvitationRequest setInviteType(String inviteType) {
        this.inviteType = inviteType;
        return this;
    }
    public String getInviteType() {
        return this.inviteType;
    }

    public SendContractInvitationRequest setLegalCertType(String legalCertType) {
        this.legalCertType = legalCertType;
        return this;
    }
    public String getLegalCertType() {
        return this.legalCertType;
    }

    public SendContractInvitationRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public SendContractInvitationRequest setLegalNo(String legalNo) {
        this.legalNo = legalNo;
        return this;
    }
    public String getLegalNo() {
        return this.legalNo;
    }

    public SendContractInvitationRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SendContractInvitationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SendContractInvitationRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public SendContractInvitationRequest setOrganCertNo(String organCertNo) {
        this.organCertNo = organCertNo;
        return this;
    }
    public String getOrganCertNo() {
        return this.organCertNo;
    }

    public SendContractInvitationRequest setOrganCertType(String organCertType) {
        this.organCertType = organCertType;
        return this;
    }
    public String getOrganCertType() {
        return this.organCertType;
    }

    public SendContractInvitationRequest setOrganName(String organName) {
        this.organName = organName;
        return this;
    }
    public String getOrganName() {
        return this.organName;
    }

    public SendContractInvitationRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

}
