// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpSalesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单ID。和账单ID 两个字段只能选填一个
    @NameInMap("ip_order_id")
    public String ipOrderId;

    // 账单ID。和订单ID 两个字段只能选填一个
    @NameInMap("ip_bill_id")
    public String ipBillId;

    // 排序字段
    @NameInMap("order_by")
    @Validation(required = true)
    public String orderBy;

    // 排序顺序：正序还是倒序
    @NameInMap("order")
    @Validation(required = true)
    public String order;

    // 页码
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // 每页数据量大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PagequeryIpSalesRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpSalesRequest self = new PagequeryIpSalesRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIpSalesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIpSalesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIpSalesRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public PagequeryIpSalesRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public PagequeryIpSalesRequest setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

    public PagequeryIpSalesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public PagequeryIpSalesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public PagequeryIpSalesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpSalesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
