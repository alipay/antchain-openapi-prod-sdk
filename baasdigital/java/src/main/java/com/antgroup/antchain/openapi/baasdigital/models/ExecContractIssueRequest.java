// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class ExecContractIssueRequest extends TeaModel {
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

    // 权证ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 数字权证标准URI协议文件，权证信息
    @NameInMap("asset_uri")
    @Validation(required = true)
    public String assetUri;

    // 权证发行的目标账户
    @NameInMap("to_account")
    @Validation(required = true)
    public String toAccount;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    @NameInMap("account_info")
    @Validation(required = true)
    public AccountInfo accountInfo;

    public static ExecContractIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractIssueRequest self = new ExecContractIssueRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractIssueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractIssueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractIssueRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ExecContractIssueRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecContractIssueRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ExecContractIssueRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecContractIssueRequest setAssetUri(String assetUri) {
        this.assetUri = assetUri;
        return this;
    }
    public String getAssetUri() {
        return this.assetUri;
    }

    public ExecContractIssueRequest setToAccount(String toAccount) {
        this.toAccount = toAccount;
        return this;
    }
    public String getToAccount() {
        return this.toAccount;
    }

    public ExecContractIssueRequest setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
