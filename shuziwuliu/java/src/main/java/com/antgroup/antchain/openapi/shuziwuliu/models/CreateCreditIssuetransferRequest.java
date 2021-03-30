// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCreditIssuetransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 转让结果回调url
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 信用流转凭证
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 全局业务号，保证唯一性，如拆分转让业务单号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 转入方分布式数字身份
    @NameInMap("payee_did")
    @Validation(required = true)
    public String payeeDid;

    // 转出方分布式数字身份
    @NameInMap("payer_did")
    @Validation(required = true)
    public String payerDid;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id 目前使用PRODUCT_MYBANK
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 转让金额
    @NameInMap("tx_amt")
    @Validation(required = true)
    public String txAmt;

    public static CreateCreditIssuetransferRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditIssuetransferRequest self = new CreateCreditIssuetransferRequest();
        return TeaModel.build(map, self);
    }

    public CreateCreditIssuetransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCreditIssuetransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCreditIssuetransferRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateCreditIssuetransferRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public CreateCreditIssuetransferRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public CreateCreditIssuetransferRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CreateCreditIssuetransferRequest setPayeeDid(String payeeDid) {
        this.payeeDid = payeeDid;
        return this;
    }
    public String getPayeeDid() {
        return this.payeeDid;
    }

    public CreateCreditIssuetransferRequest setPayerDid(String payerDid) {
        this.payerDid = payerDid;
        return this;
    }
    public String getPayerDid() {
        return this.payerDid;
    }

    public CreateCreditIssuetransferRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateCreditIssuetransferRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateCreditIssuetransferRequest setTxAmt(String txAmt) {
        this.txAmt = txAmt;
        return this;
    }
    public String getTxAmt() {
        return this.txAmt;
    }

}
