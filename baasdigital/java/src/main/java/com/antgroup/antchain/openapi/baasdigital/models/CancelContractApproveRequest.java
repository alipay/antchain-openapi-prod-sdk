// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CancelContractApproveRequest extends TeaModel {
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

    // 取消授权的目标账户
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    @NameInMap("account_info")
    @Validation(required = true)
    public AccountInfo accountInfo;

    public static CancelContractApproveRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelContractApproveRequest self = new CancelContractApproveRequest();
        return TeaModel.build(map, self);
    }

    public CancelContractApproveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelContractApproveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelContractApproveRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CancelContractApproveRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CancelContractApproveRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public CancelContractApproveRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CancelContractApproveRequest setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
