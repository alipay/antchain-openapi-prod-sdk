// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightActiveAddressesResponse extends TeaModel {
    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 合计
    @NameInMap("total")
    public Long total;

    // 结果列表
    @NameInMap("list")
    public java.util.List<MapEntryList> list;

    public static ChainInsightActiveAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightActiveAddressesResponse self = new ChainInsightActiveAddressesResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightActiveAddressesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ChainInsightActiveAddressesResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ChainInsightActiveAddressesResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightActiveAddressesResponse setList(java.util.List<MapEntryList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<MapEntryList> getList() {
        return this.list;
    }

}
