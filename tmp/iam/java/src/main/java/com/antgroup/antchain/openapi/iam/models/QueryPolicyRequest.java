// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryPolicyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 授权对象id
    @NameInMap("actor_id")
    @Validation(required = true)
    public String actorId;

    // 授权对象类型
    @NameInMap("actor_type")
    @Validation(required = true)
    public String actorType;

    // 当前页，默认值为1
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小，默认值为10
    @NameInMap("page_size")
    public Integer pageSize;

    // 授权策略所属租户
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static QueryPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPolicyRequest self = new QueryPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPolicyRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public QueryPolicyRequest setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }
    public String getActorType() {
        return this.actorType;
    }

    public QueryPolicyRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryPolicyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPolicyRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
