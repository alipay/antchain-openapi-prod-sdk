// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListTransactionCorrectionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aaa
    @NameInMap("action_type")
    public String actionType;

    // current_page
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // id desc
    @NameInMap("order_by")
    public java.util.List<OrderByParams> orderBy;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 0 已提交 4 成功
    @NameInMap("state")
    public String state;

    // app_name
    @NameInMap("app_name")
    public String appName;

    public static ListTransactionCorrectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransactionCorrectionsRequest self = new ListTransactionCorrectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransactionCorrectionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTransactionCorrectionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListTransactionCorrectionsRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public ListTransactionCorrectionsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListTransactionCorrectionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTransactionCorrectionsRequest setOrderBy(java.util.List<OrderByParams> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<OrderByParams> getOrderBy() {
        return this.orderBy;
    }

    public ListTransactionCorrectionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTransactionCorrectionsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListTransactionCorrectionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
