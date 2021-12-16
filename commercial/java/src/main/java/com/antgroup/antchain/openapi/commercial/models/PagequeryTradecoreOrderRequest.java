// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PagequeryTradecoreOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 取值范围：NEW
    @NameInMap("order_type")
    public String orderType;

    // 取值范围：INIT、PAY_SUCCESS、CLOSED
    @NameInMap("order_status")
    public String orderStatus;

    // 取值范围：GMT_CREATE（订单创建时间）、GMT_PAY_SUCCESS（订单支付成功时间）
    @NameInMap("sort_column")
    public String sortColumn;

    // 取值范围：ASC（升序）、DESC（降序）
    @NameInMap("sort_type")
    public String sortType;

    // page_num
    @NameInMap("page_num")
    public Long pageNum;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryTradecoreOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTradecoreOrderRequest self = new PagequeryTradecoreOrderRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryTradecoreOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryTradecoreOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public PagequeryTradecoreOrderRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public PagequeryTradecoreOrderRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public PagequeryTradecoreOrderRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public PagequeryTradecoreOrderRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryTradecoreOrderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
