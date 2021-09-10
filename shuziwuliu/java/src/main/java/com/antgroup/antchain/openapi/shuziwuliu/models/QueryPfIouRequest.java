// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfIouRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 融资主体Did
    @NameInMap("financing_subject_did")
    @Validation(required = true)
    public String financingSubjectDid;

    // 支用Id
    @NameInMap("financing_id")
    @Validation(required = true)
    public String financingId;

    public static QueryPfIouRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfIouRequest self = new QueryPfIouRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfIouRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfIouRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfIouRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryPfIouRequest setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

    public QueryPfIouRequest setFinancingId(String financingId) {
        this.financingId = financingId;
        return this;
    }
    public String getFinancingId() {
        return this.financingId;
    }

}
