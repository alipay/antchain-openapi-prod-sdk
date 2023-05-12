// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListTransactionDebugsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前分页
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // id  desc
    @NameInMap("order_by")
    public java.util.List<OrderByParams> orderBy;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // appname
    @NameInMap("app_name")
    public String appName;

    // 1.进行中 4.成功
    @NameInMap("state")
    public String state;

    // 1.发起方 2.参与者
    @NameInMap("debug_type")
    public String debugType;

    public static ListTransactionDebugsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransactionDebugsRequest self = new ListTransactionDebugsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransactionDebugsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTransactionDebugsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListTransactionDebugsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListTransactionDebugsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTransactionDebugsRequest setOrderBy(java.util.List<OrderByParams> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<OrderByParams> getOrderBy() {
        return this.orderBy;
    }

    public ListTransactionDebugsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTransactionDebugsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListTransactionDebugsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListTransactionDebugsRequest setDebugType(String debugType) {
        this.debugType = debugType;
        return this;
    }
    public String getDebugType() {
        return this.debugType;
    }

}
