// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAssetsResponse extends TeaModel {
    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 合计
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 结果列表
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<ChainInsightAsset> list;

    public static ChainInsightAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAssetsResponse self = new ChainInsightAssetsResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightAssetsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ChainInsightAssetsResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ChainInsightAssetsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightAssetsResponse setList(java.util.List<ChainInsightAsset> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ChainInsightAsset> getList() {
        return this.list;
    }

}
