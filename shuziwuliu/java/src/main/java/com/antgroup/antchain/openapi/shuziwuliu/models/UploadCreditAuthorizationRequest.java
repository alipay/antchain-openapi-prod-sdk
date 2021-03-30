// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署货主统一社会信用代码
    @NameInMap("consignor_cert_no")
    @Validation(required = true)
    public String consignorCertNo;

    // 签署货主did
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 签署货主企业名称
    @NameInMap("consignor_name")
    @Validation(required = true)
    public String consignorName;

    // 授权的货主平台账号
    @NameInMap("consignor_platform_account")
    @Validation(required = true)
    public String consignorPlatformAccount;

    // 协议到期日
    @NameInMap("expire_date")
    @Validation(required = true)
    public String expireDate;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 是否包含账号授权条款
    @NameInMap("has_authorization_clause")
    @Validation(required = true)
    public Boolean hasAuthorizationClause;

    // 签署子公司统一社会信用代码
    @NameInMap("platform_cert_no")
    @Validation(required = true)
    public String platformCertNo;

    // 签署子公司did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 签署子公司企业名称
    // 
    @NameInMap("platform_name")
    @Validation(required = true)
    public String platformName;

    // 线下协议影像件id与文件哈希, 多id以逗号分隔, 最多支持10个
    @NameInMap("protocol_img_id")
    @Validation(required = true)
    public String protocolImgId;

    // 协议名称
    @NameInMap("protocol_name")
    @Validation(required = true)
    public String protocolName;

    // 线下协议编号
    @NameInMap("protocol_no")
    @Validation(required = true)
    public String protocolNo;

    // 签署时间
    @NameInMap("sign_date")
    @Validation(required = true)
    public String signDate;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static UploadCreditAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditAuthorizationRequest self = new UploadCreditAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public UploadCreditAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadCreditAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadCreditAuthorizationRequest setConsignorCertNo(String consignorCertNo) {
        this.consignorCertNo = consignorCertNo;
        return this;
    }
    public String getConsignorCertNo() {
        return this.consignorCertNo;
    }

    public UploadCreditAuthorizationRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public UploadCreditAuthorizationRequest setConsignorName(String consignorName) {
        this.consignorName = consignorName;
        return this;
    }
    public String getConsignorName() {
        return this.consignorName;
    }

    public UploadCreditAuthorizationRequest setConsignorPlatformAccount(String consignorPlatformAccount) {
        this.consignorPlatformAccount = consignorPlatformAccount;
        return this;
    }
    public String getConsignorPlatformAccount() {
        return this.consignorPlatformAccount;
    }

    public UploadCreditAuthorizationRequest setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public UploadCreditAuthorizationRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public UploadCreditAuthorizationRequest setHasAuthorizationClause(Boolean hasAuthorizationClause) {
        this.hasAuthorizationClause = hasAuthorizationClause;
        return this;
    }
    public Boolean getHasAuthorizationClause() {
        return this.hasAuthorizationClause;
    }

    public UploadCreditAuthorizationRequest setPlatformCertNo(String platformCertNo) {
        this.platformCertNo = platformCertNo;
        return this;
    }
    public String getPlatformCertNo() {
        return this.platformCertNo;
    }

    public UploadCreditAuthorizationRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public UploadCreditAuthorizationRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public UploadCreditAuthorizationRequest setProtocolImgId(String protocolImgId) {
        this.protocolImgId = protocolImgId;
        return this;
    }
    public String getProtocolImgId() {
        return this.protocolImgId;
    }

    public UploadCreditAuthorizationRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public UploadCreditAuthorizationRequest setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public UploadCreditAuthorizationRequest setSignDate(String signDate) {
        this.signDate = signDate;
        return this;
    }
    public String getSignDate() {
        return this.signDate;
    }

    public UploadCreditAuthorizationRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
