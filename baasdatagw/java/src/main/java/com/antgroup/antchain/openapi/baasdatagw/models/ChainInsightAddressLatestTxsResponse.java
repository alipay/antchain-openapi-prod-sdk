// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAddressLatestTxsResponse extends TeaModel {
    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 合计
    @NameInMap("total")
    public Long total;

    // 近期交易详情
    @NameInMap("list")
    public java.util.List<ChainInsightTransaction> list;

    public static ChainInsightAddressLatestTxsResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAddressLatestTxsResponse self = new ChainInsightAddressLatestTxsResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightAddressLatestTxsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ChainInsightAddressLatestTxsResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ChainInsightAddressLatestTxsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightAddressLatestTxsResponse setList(java.util.List<ChainInsightTransaction> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ChainInsightTransaction> getList() {
        return this.list;
    }

}
