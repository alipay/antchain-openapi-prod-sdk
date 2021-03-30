// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditConfirmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货主云资金商户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 确认时间
    @NameInMap("confirm_date")
    @Validation(required = true)
    public String confirmDate;

    // 应收转让通知编号
    @NameInMap("confirm_no")
    @Validation(required = true)
    public String confirmNo;

    // 签署货主did
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 签署的货主平台账号
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

    // 签署子公司did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 协议名称
    @NameInMap("protocol_name")
    @Validation(required = true)
    public String protocolName;

    // 协议PDF文件, 多个文件可用逗号分隔, 最多10个
    @NameInMap("protocol_pdf_id")
    @Validation(required = true)
    public String protocolPdfId;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static UploadCreditConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditConfirmRequest self = new UploadCreditConfirmRequest();
        return TeaModel.build(map, self);
    }

    public UploadCreditConfirmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadCreditConfirmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadCreditConfirmRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UploadCreditConfirmRequest setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
        return this;
    }
    public String getConfirmDate() {
        return this.confirmDate;
    }

    public UploadCreditConfirmRequest setConfirmNo(String confirmNo) {
        this.confirmNo = confirmNo;
        return this;
    }
    public String getConfirmNo() {
        return this.confirmNo;
    }

    public UploadCreditConfirmRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public UploadCreditConfirmRequest setConsignorPlatformAccount(String consignorPlatformAccount) {
        this.consignorPlatformAccount = consignorPlatformAccount;
        return this;
    }
    public String getConsignorPlatformAccount() {
        return this.consignorPlatformAccount;
    }

    public UploadCreditConfirmRequest setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public UploadCreditConfirmRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public UploadCreditConfirmRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public UploadCreditConfirmRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public UploadCreditConfirmRequest setProtocolPdfId(String protocolPdfId) {
        this.protocolPdfId = protocolPdfId;
        return this;
    }
    public String getProtocolPdfId() {
        return this.protocolPdfId;
    }

    public UploadCreditConfirmRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
