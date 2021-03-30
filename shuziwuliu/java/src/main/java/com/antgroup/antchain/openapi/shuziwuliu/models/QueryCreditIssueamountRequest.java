// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssueamountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定查询者分布式数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

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

    // 产品id 目前填写PRODUCT_MYBANK
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static QueryCreditIssueamountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssueamountRequest self = new QueryCreditIssueamountRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssueamountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditIssueamountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditIssueamountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditIssueamountRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditIssueamountRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public QueryCreditIssueamountRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditIssueamountRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
