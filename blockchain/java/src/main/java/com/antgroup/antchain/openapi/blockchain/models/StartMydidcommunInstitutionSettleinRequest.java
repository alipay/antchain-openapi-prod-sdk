// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunInstitutionSettleinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻时选择的业务码，这个码需要在机构入驻时与数据隐私服务确认之后填写
    @NameInMap("biz_code")
    public String bizCode;

    // 机构唯一编号
    @NameInMap("institiution_no")
    public String institiutionNo;

    // 机构实际名称
    @NameInMap("institution_name")
    @Validation(required = true)
    public String institutionName;

    // 接受数据隐私服务回调通知的URL，如果地址是https的，那么该地址必须提供有效的证书
    @NameInMap("notification_url")
    public String notificationUrl;

    // 机构和数据隐私服务进行通讯的非对称密钥对中的公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 恢复密钥公钥，可用于以后修改通讯公钥用，不要和通讯公钥一样
    @NameInMap("recover_key")
    @Validation(required = true)
    public String recoverKey;

    public static StartMydidcommunInstitutionSettleinRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunInstitutionSettleinRequest self = new StartMydidcommunInstitutionSettleinRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunInstitutionSettleinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunInstitutionSettleinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunInstitutionSettleinRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartMydidcommunInstitutionSettleinRequest setInstitiutionNo(String institiutionNo) {
        this.institiutionNo = institiutionNo;
        return this;
    }
    public String getInstitiutionNo() {
        return this.institiutionNo;
    }

    public StartMydidcommunInstitutionSettleinRequest setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
        return this;
    }
    public String getInstitutionName() {
        return this.institutionName;
    }

    public StartMydidcommunInstitutionSettleinRequest setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
        return this;
    }
    public String getNotificationUrl() {
        return this.notificationUrl;
    }

    public StartMydidcommunInstitutionSettleinRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public StartMydidcommunInstitutionSettleinRequest setRecoverKey(String recoverKey) {
        this.recoverKey = recoverKey;
        return this;
    }
    public String getRecoverKey() {
        return this.recoverKey;
    }

}
