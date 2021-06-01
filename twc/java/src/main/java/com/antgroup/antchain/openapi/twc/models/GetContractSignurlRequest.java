// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractSignurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署人账号id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 存量参数，已废弃
    @NameInMap("organize_id")
    public String organizeId;

    // 是否需要同时返回短链接，默认为false
    @NameInMap("short_url")
    public Boolean shortUrl;

    // 本功能需要单独审批开放。当account_id为机构账户时，可以在执行签署时单独指定经办人账户，代为完成本次签署操作。
    @NameInMap("agent_account_id")
    public String agentAccountId;

    public static GetContractSignurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractSignurlRequest self = new GetContractSignurlRequest();
        return TeaModel.build(map, self);
    }

    public GetContractSignurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetContractSignurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetContractSignurlRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetContractSignurlRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetContractSignurlRequest setOrganizeId(String organizeId) {
        this.organizeId = organizeId;
        return this;
    }
    public String getOrganizeId() {
        return this.organizeId;
    }

    public GetContractSignurlRequest setShortUrl(Boolean shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public Boolean getShortUrl() {
        return this.shortUrl;
    }

    public GetContractSignurlRequest setAgentAccountId(String agentAccountId) {
        this.agentAccountId = agentAccountId;
        return this;
    }
    public String getAgentAccountId() {
        return this.agentAccountId;
    }

}
