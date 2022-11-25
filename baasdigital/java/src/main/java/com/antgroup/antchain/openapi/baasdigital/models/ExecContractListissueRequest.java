// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class ExecContractListissueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
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

    // 权证发行的目标账户
    @NameInMap("to_account")
    @Validation(required = true)
    public String toAccount;

    // 批量发行的资产id列表
    @NameInMap("asset_list")
    @Validation(required = true)
    public java.util.List<String> assetList;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    @NameInMap("account_info")
    @Validation(required = true)
    public AccountInfo accountInfo;

    public static ExecContractListissueRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractListissueRequest self = new ExecContractListissueRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractListissueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractListissueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractListissueRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ExecContractListissueRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecContractListissueRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ExecContractListissueRequest setToAccount(String toAccount) {
        this.toAccount = toAccount;
        return this;
    }
    public String getToAccount() {
        return this.toAccount;
    }

    public ExecContractListissueRequest setAssetList(java.util.List<String> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<String> getAssetList() {
        return this.assetList;
    }

    public ExecContractListissueRequest setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
