// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEcarOffsetaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 碳普惠项目编码
    @NameInMap("project_no")
    @Validation(required = true)
    public String projectNo;

    // 账户DID
    @NameInMap("account_did")
    @Validation(required = true)
    public String accountDid;

    public static QueryEcarOffsetaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEcarOffsetaccountRequest self = new QueryEcarOffsetaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryEcarOffsetaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEcarOffsetaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEcarOffsetaccountRequest setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public QueryEcarOffsetaccountRequest setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

}
