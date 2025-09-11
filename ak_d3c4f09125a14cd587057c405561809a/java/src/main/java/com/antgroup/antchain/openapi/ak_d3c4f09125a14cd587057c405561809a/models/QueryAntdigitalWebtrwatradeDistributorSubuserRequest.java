// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebtrwatradeDistributorSubuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 机构id
    @NameInMap("institution_id")
    @Validation(required = true)
    public String institutionId;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    public static QueryAntdigitalWebtrwatradeDistributorSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebtrwatradeDistributorSubuserRequest self = new QueryAntdigitalWebtrwatradeDistributorSubuserRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuserRequest setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
        return this;
    }
    public String getInstitutionId() {
        return this.institutionId;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuserRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
