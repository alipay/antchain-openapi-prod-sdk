// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ProjectKeyPageData extends TeaModel {
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

    // 项目密钥列表
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<AssetProjectKey> records;

    public static ProjectKeyPageData build(java.util.Map<String, ?> map) throws Exception {
        ProjectKeyPageData self = new ProjectKeyPageData();
        return TeaModel.build(map, self);
    }

    public ProjectKeyPageData setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ProjectKeyPageData setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ProjectKeyPageData setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ProjectKeyPageData setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ProjectKeyPageData setRecords(java.util.List<AssetProjectKey> records) {
        this.records = records;
        return this;
    }
    public java.util.List<AssetProjectKey> getRecords() {
        return this.records;
    }

}
