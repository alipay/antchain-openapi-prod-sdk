// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CellPageDTO extends TeaModel {
    // cell数据
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<CellDO> content;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总量
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static CellPageDTO build(java.util.Map<String, ?> map) throws Exception {
        CellPageDTO self = new CellPageDTO();
        return TeaModel.build(map, self);
    }

    public CellPageDTO setContent(java.util.List<CellDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<CellDO> getContent() {
        return this.content;
    }

    public CellPageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public CellPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public CellPageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
