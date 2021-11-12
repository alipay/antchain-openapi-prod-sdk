// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpSalessummaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单ID。订单ID和账单ID二选一传入。
    @NameInMap("ip_order_id")
    public String ipOrderId;

    // 账单ID。订单ID和账单ID二选一传入。
    @NameInMap("ip_bill_id")
    public String ipBillId;

    // 销售数据状态：1初始化，2商户确认，3版权方确认，4账单生成，5商户已校正，6版权方拒绝
    @NameInMap("status")
    public Long status;

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

    // 每页数据量大小。不大于100。
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PagequeryIpSalessummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpSalessummaryRequest self = new PagequeryIpSalessummaryRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIpSalessummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIpSalessummaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIpSalessummaryRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public PagequeryIpSalessummaryRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public PagequeryIpSalessummaryRequest setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

    public PagequeryIpSalessummaryRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public PagequeryIpSalessummaryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public PagequeryIpSalessummaryRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public PagequeryIpSalessummaryRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpSalessummaryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
