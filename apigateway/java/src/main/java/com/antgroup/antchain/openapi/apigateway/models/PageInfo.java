// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class PageInfo extends TeaModel {
    // 排序信息
    @NameInMap("order_infos")
    public java.util.List<OrderInfo> orderInfos;

    // 当前页
    @NameInMap("page_index")
    public Long pageIndex;

    // 每页记录数
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total")
    public Long total;

    public static PageInfo build(java.util.Map<String, ?> map) throws Exception {
        PageInfo self = new PageInfo();
        return TeaModel.build(map, self);
    }

    public PageInfo setOrderInfos(java.util.List<OrderInfo> orderInfos) {
        this.orderInfos = orderInfos;
        return this;
    }
    public java.util.List<OrderInfo> getOrderInfos() {
        return this.orderInfos;
    }

    public PageInfo setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PageInfo setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PageInfo setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
