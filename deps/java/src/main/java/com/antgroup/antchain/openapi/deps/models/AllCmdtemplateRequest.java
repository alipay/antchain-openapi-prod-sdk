// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AllCmdtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 页码
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 页容量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 排序字段
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 关键字
    @NameInMap("keyword")
    public String keyword;

    public static AllCmdtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AllCmdtemplateRequest self = new AllCmdtemplateRequest();
        return TeaModel.build(map, self);
    }

    public AllCmdtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllCmdtemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public AllCmdtemplateRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public AllCmdtemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AllCmdtemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public AllCmdtemplateRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public AllCmdtemplateRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
