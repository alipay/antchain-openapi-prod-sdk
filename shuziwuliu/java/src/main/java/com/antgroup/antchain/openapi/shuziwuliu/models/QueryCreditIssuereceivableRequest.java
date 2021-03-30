// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuereceivableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 信用凭证id
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // PRODUCT_MYBANK  、PRODUCT_MYBANK_B
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static QueryCreditIssuereceivableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuereceivableRequest self = new QueryCreditIssuereceivableRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuereceivableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditIssuereceivableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditIssuereceivableRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditIssuereceivableRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public QueryCreditIssuereceivableRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditIssuereceivableRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
