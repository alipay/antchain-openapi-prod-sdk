// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryUserTokenallocationdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目唯一编码
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 用户账户信息
    @NameInMap("user")
    @Validation(required = true)
    public User user;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryUserTokenallocationdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTokenallocationdetailRequest self = new QueryUserTokenallocationdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserTokenallocationdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserTokenallocationdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserTokenallocationdetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryUserTokenallocationdetailRequest setUser(User user) {
        this.user = user;
        return this;
    }
    public User getUser() {
        return this.user;
    }

    public QueryUserTokenallocationdetailRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryUserTokenallocationdetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
