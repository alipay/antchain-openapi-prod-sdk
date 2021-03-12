// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryMydidcommunAgencyProcessauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审批流水号
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 查询者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static QueryMydidcommunAgencyProcessauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMydidcommunAgencyProcessauthRequest self = new QueryMydidcommunAgencyProcessauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryMydidcommunAgencyProcessauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMydidcommunAgencyProcessauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMydidcommunAgencyProcessauthRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public QueryMydidcommunAgencyProcessauthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
