// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SchemaDetailPageDO extends TeaModel {
    // 页面数量
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 内容
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<SchemaDetailDO> content;

    public static SchemaDetailPageDO build(java.util.Map<String, ?> map) throws Exception {
        SchemaDetailPageDO self = new SchemaDetailPageDO();
        return TeaModel.build(map, self);
    }

    public SchemaDetailPageDO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public SchemaDetailPageDO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SchemaDetailPageDO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public SchemaDetailPageDO setContent(java.util.List<SchemaDetailDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<SchemaDetailDO> getContent() {
        return this.content;
    }

}
