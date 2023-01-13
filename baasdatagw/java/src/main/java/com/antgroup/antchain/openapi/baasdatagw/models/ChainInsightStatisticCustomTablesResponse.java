// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightStatisticCustomTablesResponse extends TeaModel {
    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 总条数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 表格每一行内容，    Key 为列名，    Value，列的取值
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<ChainInsightStatisticCustomTableRow> list;

    public static ChainInsightStatisticCustomTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightStatisticCustomTablesResponse self = new ChainInsightStatisticCustomTablesResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightStatisticCustomTablesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ChainInsightStatisticCustomTablesResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ChainInsightStatisticCustomTablesResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightStatisticCustomTablesResponse setList(java.util.List<ChainInsightStatisticCustomTableRow> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ChainInsightStatisticCustomTableRow> getList() {
        return this.list;
    }

}
