// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class GetIssueTransferfileRequest extends TeaModel {
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
    // 
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 信用流转凭证集合，最大长度支持30
    @NameInMap("issue_transfer_datas")
    @Validation(required = true)
    public java.util.List<IssueTransferData> issueTransferDatas;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    // 
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static GetIssueTransferfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIssueTransferfileRequest self = new GetIssueTransferfileRequest();
        return TeaModel.build(map, self);
    }

    public GetIssueTransferfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetIssueTransferfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetIssueTransferfileRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public GetIssueTransferfileRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public GetIssueTransferfileRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public GetIssueTransferfileRequest setIssueTransferDatas(java.util.List<IssueTransferData> issueTransferDatas) {
        this.issueTransferDatas = issueTransferDatas;
        return this;
    }
    public java.util.List<IssueTransferData> getIssueTransferDatas() {
        return this.issueTransferDatas;
    }

    public GetIssueTransferfileRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public GetIssueTransferfileRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
