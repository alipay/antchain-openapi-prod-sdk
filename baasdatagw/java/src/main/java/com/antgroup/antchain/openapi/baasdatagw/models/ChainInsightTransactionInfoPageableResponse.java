// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightTransactionInfoPageableResponse extends TeaModel {
    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 合计
    @NameInMap("total")
    public Long total;

    // ChainInsightTransactionInfo列表
    @NameInMap("list")
    public java.util.List<ChainInsightTransactionInfo> list;

    public static ChainInsightTransactionInfoPageableResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightTransactionInfoPageableResponse self = new ChainInsightTransactionInfoPageableResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightTransactionInfoPageableResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ChainInsightTransactionInfoPageableResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ChainInsightTransactionInfoPageableResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightTransactionInfoPageableResponse setList(java.util.List<ChainInsightTransactionInfo> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ChainInsightTransactionInfo> getList() {
        return this.list;
    }

}
