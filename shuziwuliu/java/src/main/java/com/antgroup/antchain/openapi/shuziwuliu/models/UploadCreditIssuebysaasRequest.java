// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditIssuebysaasRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次id
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 发行结果回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 发行信息
    @NameInMap("issue_apply_infos")
    @Validation(required = true)
    public java.util.List<SaasIssueApplyInfo> issueApplyInfos;

    // 凭证发行方did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static UploadCreditIssuebysaasRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditIssuebysaasRequest self = new UploadCreditIssuebysaasRequest();
        return TeaModel.build(map, self);
    }

    public UploadCreditIssuebysaasRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadCreditIssuebysaasRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadCreditIssuebysaasRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public UploadCreditIssuebysaasRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UploadCreditIssuebysaasRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public UploadCreditIssuebysaasRequest setIssueApplyInfos(java.util.List<SaasIssueApplyInfo> issueApplyInfos) {
        this.issueApplyInfos = issueApplyInfos;
        return this;
    }
    public java.util.List<SaasIssueApplyInfo> getIssueApplyInfos() {
        return this.issueApplyInfos;
    }

    public UploadCreditIssuebysaasRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public UploadCreditIssuebysaasRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
