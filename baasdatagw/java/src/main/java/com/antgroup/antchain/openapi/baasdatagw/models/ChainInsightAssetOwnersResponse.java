// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAssetOwnersResponse extends TeaModel {
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
    public java.util.List<ChainInsightAssetOwner> list;

    public static ChainInsightAssetOwnersResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAssetOwnersResponse self = new ChainInsightAssetOwnersResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightAssetOwnersResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ChainInsightAssetOwnersResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ChainInsightAssetOwnersResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightAssetOwnersResponse setList(java.util.List<ChainInsightAssetOwner> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ChainInsightAssetOwner> getList() {
        return this.list;
    }

}
