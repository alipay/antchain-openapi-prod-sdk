// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuefinanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

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

    public static QueryCreditIssuefinanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuefinanceRequest self = new QueryCreditIssuefinanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuefinanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditIssuefinanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditIssuefinanceRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditIssuefinanceRequest setLoanerDid(String loanerDid) {
        this.loanerDid = loanerDid;
        return this;
    }
    public String getLoanerDid() {
        return this.loanerDid;
    }

    public QueryCreditIssuefinanceRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public QueryCreditIssuefinanceRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditIssuefinanceRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
