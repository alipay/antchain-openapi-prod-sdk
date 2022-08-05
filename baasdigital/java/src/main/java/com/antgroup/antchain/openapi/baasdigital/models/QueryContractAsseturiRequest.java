// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class QueryContractAsseturiRequest extends TeaModel {
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
    public String traceId;

    // 查询的权证ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    @NameInMap("account_info")
    @Validation(required = true)
    public AccountInfo accountInfo;

    public static QueryContractAsseturiRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractAsseturiRequest self = new QueryContractAsseturiRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractAsseturiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractAsseturiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractAsseturiRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryContractAsseturiRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryContractAsseturiRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryContractAsseturiRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryContractAsseturiRequest setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
