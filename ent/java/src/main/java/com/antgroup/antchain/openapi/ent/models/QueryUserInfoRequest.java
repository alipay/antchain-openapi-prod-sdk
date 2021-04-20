// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryUserInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目唯一编码
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 用户账号信息
    @NameInMap("user")
    @Validation(required = true)
    public User user;

    public static QueryUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoRequest self = new QueryUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryUserInfoRequest setUser(User user) {
        this.user = user;
        return this;
    }
    public User getUser() {
        return this.user;
    }

}
