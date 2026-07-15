// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractEsignurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 账户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 默认为空，返回的任务链接仅包含签署人本人需要签署的任务；  传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务；  传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务, 注意：当签署是企业签署的情况，该字段必传。建议organizeId直接传0。
    @NameInMap("organize_id")
    public String organizeId;

    public static GetContractEsignurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractEsignurlRequest self = new GetContractEsignurlRequest();
        return TeaModel.build(map, self);
    }

    public GetContractEsignurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetContractEsignurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetContractEsignurlRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetContractEsignurlRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetContractEsignurlRequest setOrganizeId(String organizeId) {
        this.organizeId = organizeId;
        return this;
    }
    public String getOrganizeId() {
        return this.organizeId;
    }

}
