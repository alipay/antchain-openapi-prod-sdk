// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class BatchcreateCreditmodeIssueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次id
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 集团平台分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 发行列表
    @NameInMap("issue_apply_infos")
    @Validation(required = true)
    public java.util.List<IssueApplyInfo> issueApplyInfos;

    // 业务平台方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static BatchcreateCreditmodeIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateCreditmodeIssueRequest self = new BatchcreateCreditmodeIssueRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateCreditmodeIssueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateCreditmodeIssueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateCreditmodeIssueRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BatchcreateCreditmodeIssueRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public BatchcreateCreditmodeIssueRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public BatchcreateCreditmodeIssueRequest setIssueApplyInfos(java.util.List<IssueApplyInfo> issueApplyInfos) {
        this.issueApplyInfos = issueApplyInfos;
        return this;
    }
    public java.util.List<IssueApplyInfo> getIssueApplyInfos() {
        return this.issueApplyInfos;
    }

    public BatchcreateCreditmodeIssueRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public BatchcreateCreditmodeIssueRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
