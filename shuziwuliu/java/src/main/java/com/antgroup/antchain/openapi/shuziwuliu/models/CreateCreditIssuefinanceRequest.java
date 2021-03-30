// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCreditIssuefinanceRequest extends TeaModel {
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

    // 融资申请方分布式数字身份
    @NameInMap("loaner_did")
    @Validation(required = true)
    public String loanerDid;

    // 全局业务号，保证唯一性，如融资业务单号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id 
    // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 融资金额
    @NameInMap("tx_amt")
    @Validation(required = true)
    public String txAmt;

    public static CreateCreditIssuefinanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditIssuefinanceRequest self = new CreateCreditIssuefinanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCreditIssuefinanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCreditIssuefinanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCreditIssuefinanceRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateCreditIssuefinanceRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public CreateCreditIssuefinanceRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public CreateCreditIssuefinanceRequest setLoanerDid(String loanerDid) {
        this.loanerDid = loanerDid;
        return this;
    }
    public String getLoanerDid() {
        return this.loanerDid;
    }

    public CreateCreditIssuefinanceRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CreateCreditIssuefinanceRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateCreditIssuefinanceRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateCreditIssuefinanceRequest setTxAmt(String txAmt) {
        this.txAmt = txAmt;
        return this;
    }
    public String getTxAmt() {
        return this.txAmt;
    }

}
