// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryMydidcommunWorkergroupWorkflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 工作流对应的部署Id
    @NameInMap("pod_id")
    @Validation(required = true)
    public Long podId;

    // 版本号
    @NameInMap("pod_version")
    @Validation(required = true)
    public Long podVersion;

    public static QueryMydidcommunWorkergroupWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMydidcommunWorkergroupWorkflowRequest self = new QueryMydidcommunWorkergroupWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public QueryMydidcommunWorkergroupWorkflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMydidcommunWorkergroupWorkflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMydidcommunWorkergroupWorkflowRequest setPodId(Long podId) {
        this.podId = podId;
        return this;
    }
    public Long getPodId() {
        return this.podId;
    }

    public QueryMydidcommunWorkergroupWorkflowRequest setPodVersion(Long podVersion) {
        this.podVersion = podVersion;
        return this;
    }
    public Long getPodVersion() {
        return this.podVersion;
    }

}
