// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractSignurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    // 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
    @NameInMap("organize_id")
    public String organizeId;

    // 是否需要同时返回短链接，默认为false
    @NameInMap("short_url")
    public Boolean shortUrl;

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

}
