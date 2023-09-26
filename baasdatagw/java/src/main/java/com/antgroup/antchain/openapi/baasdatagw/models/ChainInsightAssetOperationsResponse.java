// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAssetOperationsResponse extends TeaModel {
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
    public java.util.List<ChainInsightAssetOperation> list;

    public static ChainInsightAssetOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAssetOperationsResponse self = new ChainInsightAssetOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightAssetOperationsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ChainInsightAssetOperationsResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ChainInsightAssetOperationsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightAssetOperationsResponse setList(java.util.List<ChainInsightAssetOperation> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ChainInsightAssetOperation> getList() {
        return this.list;
    }

}
