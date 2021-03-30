// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class GetCreditIssuescpticketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请唯一流水号
    @NameInMap("apply_id")
    @Validation(required = true)
    public String applyId;

    // 回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 业务发起方分布式数字身
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id	
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 电子回单查询凭证数据
    @NameInMap("scp_ticket_issue_data")
    @Validation(required = true)
    public java.util.List<ScpTicketIssueData> scpTicketIssueData;

    public static GetCreditIssuescpticketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreditIssuescpticketRequest self = new GetCreditIssuescpticketRequest();
        return TeaModel.build(map, self);
    }

    public GetCreditIssuescpticketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCreditIssuescpticketRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetCreditIssuescpticketRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public GetCreditIssuescpticketRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public GetCreditIssuescpticketRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public GetCreditIssuescpticketRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public GetCreditIssuescpticketRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetCreditIssuescpticketRequest setScpTicketIssueData(java.util.List<ScpTicketIssueData> scpTicketIssueData) {
        this.scpTicketIssueData = scpTicketIssueData;
        return this;
    }
    public java.util.List<ScpTicketIssueData> getScpTicketIssueData() {
        return this.scpTicketIssueData;
    }

}
