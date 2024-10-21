// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ProjectPageData extends TeaModel {
    // 总记录数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 总页数
    @NameInMap("page_count")
    @Validation(required = true)
    public Long pageCount;

    // 当前页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 项目列表
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<AssetProject> records;

    public static ProjectPageData build(java.util.Map<String, ?> map) throws Exception {
        ProjectPageData self = new ProjectPageData();
        return TeaModel.build(map, self);
    }

    public ProjectPageData setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ProjectPageData setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ProjectPageData setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ProjectPageData setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ProjectPageData setRecords(java.util.List<AssetProject> records) {
        this.records = records;
        return this;
    }
    public java.util.List<AssetProject> getRecords() {
        return this.records;
    }

}
