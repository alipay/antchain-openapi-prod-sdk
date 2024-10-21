// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class QueryIssuerSubuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 机构id
    @NameInMap("institution_id")
    @Validation(required = true)
    public String institutionId;

    public static QueryIssuerSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIssuerSubuserRequest self = new QueryIssuerSubuserRequest();
        return TeaModel.build(map, self);
    }

    public QueryIssuerSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIssuerSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIssuerSubuserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIssuerSubuserRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryIssuerSubuserRequest setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
        return this;
    }
    public String getInstitutionId() {
        return this.institutionId;
    }

}
