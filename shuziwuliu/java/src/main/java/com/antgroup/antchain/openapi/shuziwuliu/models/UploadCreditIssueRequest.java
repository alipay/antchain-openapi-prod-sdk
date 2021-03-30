// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditIssueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 发行结果回调url
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 货主分布式数字身份
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 发行信用流转信息列表
    @NameInMap("issue_apply_infos")
    @Validation(required = true)
    public java.util.List<IssueApplyInfo> issueApplyInfos;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id 目前填PRODUCT_MYBANK
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static UploadCreditIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditIssueRequest self = new UploadCreditIssueRequest();
        return TeaModel.build(map, self);
    }

    public UploadCreditIssueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadCreditIssueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadCreditIssueRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public UploadCreditIssueRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UploadCreditIssueRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public UploadCreditIssueRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public UploadCreditIssueRequest setIssueApplyInfos(java.util.List<IssueApplyInfo> issueApplyInfos) {
        this.issueApplyInfos = issueApplyInfos;
        return this;
    }
    public java.util.List<IssueApplyInfo> getIssueApplyInfos() {
        return this.issueApplyInfos;
    }

    public UploadCreditIssueRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public UploadCreditIssueRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
