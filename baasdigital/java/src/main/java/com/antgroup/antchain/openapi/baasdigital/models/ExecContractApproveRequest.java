// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class ExecContractApproveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 数字权证项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 业务方请求唯一标识，用于异步查询交易情况
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 被授权的目标权证
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 被授权的目标账户
    @NameInMap("to_account")
    @Validation(required = true)
    public String toAccount;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    @NameInMap("account_info")
    @Validation(required = true)
    public AccountInfo accountInfo;

    public static ExecContractApproveRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractApproveRequest self = new ExecContractApproveRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractApproveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractApproveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractApproveRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ExecContractApproveRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecContractApproveRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ExecContractApproveRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecContractApproveRequest setToAccount(String toAccount) {
        this.toAccount = toAccount;
        return this;
    }
    public String getToAccount() {
        return this.toAccount;
    }

    public ExecContractApproveRequest setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
