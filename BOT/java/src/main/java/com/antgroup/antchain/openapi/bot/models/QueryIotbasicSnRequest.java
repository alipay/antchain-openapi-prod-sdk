// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicSnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 当前登录用户ID
    // 
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 指定显示返回结果中的第几页。
    // 
    @NameInMap("current_page")
    @Validation(required = true, minimum = 1)
    public Long currentPage;

    // 指定返回结果中每页显示的产品数量，最大值是300。
    // 
    @NameInMap("page_size")
    @Validation(required = true, maximum = 300, minimum = 1)
    public Long pageSize;

    public static QueryIotbasicSnRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicSnRequest self = new QueryIotbasicSnRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicSnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotbasicSnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotbasicSnRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIotbasicSnRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIotbasicSnRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIotbasicSnRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
