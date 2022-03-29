// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SchemaMetadataPageDO extends TeaModel {
    // Metadata列表内容
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<SchemaMetadataDO> content;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总个数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static SchemaMetadataPageDO build(java.util.Map<String, ?> map) throws Exception {
        SchemaMetadataPageDO self = new SchemaMetadataPageDO();
        return TeaModel.build(map, self);
    }

    public SchemaMetadataPageDO setContent(java.util.List<SchemaMetadataDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<SchemaMetadataDO> getContent() {
        return this.content;
    }

    public SchemaMetadataPageDO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public SchemaMetadataPageDO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SchemaMetadataPageDO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
