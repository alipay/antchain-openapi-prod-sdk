// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyuserPersonjoinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

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

    // 选择的TAPP列表
    @NameInMap("tapp_info_list")
    public java.util.List<ChoiceTappInfo> tappInfoList;

    // 业务码，接入时需要找数据隐私服务分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartMydidcommunAgencyuserPersonjoinRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyuserPersonjoinRequest self = new StartMydidcommunAgencyuserPersonjoinRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
        return this;
    }
    public String getNotificationUrl() {
        return this.notificationUrl;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setRecoverKey(String recoverKey) {
        this.recoverKey = recoverKey;
        return this;
    }
    public String getRecoverKey() {
        return this.recoverKey;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setTappInfoList(java.util.List<ChoiceTappInfo> tappInfoList) {
        this.tappInfoList = tappInfoList;
        return this;
    }
    public java.util.List<ChoiceTappInfo> getTappInfoList() {
        return this.tappInfoList;
    }

    public StartMydidcommunAgencyuserPersonjoinRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
