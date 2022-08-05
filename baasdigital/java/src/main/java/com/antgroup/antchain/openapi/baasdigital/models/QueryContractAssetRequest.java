// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class QueryContractAssetRequest extends TeaModel {
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

    // 查询的目标账户
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    @NameInMap("account_info")
    @Validation(required = true)
    public AccountInfo accountInfo;

    public static QueryContractAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractAssetRequest self = new QueryContractAssetRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractAssetRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryContractAssetRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryContractAssetRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryContractAssetRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public QueryContractAssetRequest setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
