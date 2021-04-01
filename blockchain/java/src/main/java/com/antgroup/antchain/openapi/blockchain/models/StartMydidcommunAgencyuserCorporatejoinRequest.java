// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyuserCorporatejoinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 法人姓名
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 事件通知地址
    @NameInMap("notification_url")
    @Validation(required = true)
    public String notificationUrl;

    // 公钥	
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 恢复公钥	
    @NameInMap("recover_key")
    @Validation(required = true)
    public String recoverKey;

    // 选择的tapp列表
    @NameInMap("tapp_info_list")
    public java.util.List<ChoiceTappInfo> tappInfoList;

    // 业务码，接入时需要找数据隐私服务分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartMydidcommunAgencyuserCorporatejoinRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyuserCorporatejoinRequest self = new StartMydidcommunAgencyuserCorporatejoinRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
        return this;
    }
    public String getNotificationUrl() {
        return this.notificationUrl;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setRecoverKey(String recoverKey) {
        this.recoverKey = recoverKey;
        return this;
    }
    public String getRecoverKey() {
        return this.recoverKey;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setTappInfoList(java.util.List<ChoiceTappInfo> tappInfoList) {
        this.tappInfoList = tappInfoList;
        return this;
    }
    public java.util.List<ChoiceTappInfo> getTappInfoList() {
        return this.tappInfoList;
    }

    public StartMydidcommunAgencyuserCorporatejoinRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
