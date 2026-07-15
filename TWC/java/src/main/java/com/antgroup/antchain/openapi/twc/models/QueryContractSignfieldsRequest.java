// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractSignfieldsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 账号id，默认所有签署人
    @NameInMap("account_id")
    public String accountId;

    // 指定签署区id列表，逗号分割，默认所有签署区
    @NameInMap("signfield_ids")
    public String signfieldIds;

    public static QueryContractSignfieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractSignfieldsRequest self = new QueryContractSignfieldsRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractSignfieldsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractSignfieldsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractSignfieldsRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryContractSignfieldsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryContractSignfieldsRequest setSignfieldIds(String signfieldIds) {
        this.signfieldIds = signfieldIds;
        return this;
    }
    public String getSignfieldIds() {
        return this.signfieldIds;
    }

}
