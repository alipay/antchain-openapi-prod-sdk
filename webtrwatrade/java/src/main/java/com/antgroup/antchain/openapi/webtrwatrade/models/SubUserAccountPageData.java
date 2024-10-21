// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class SubUserAccountPageData extends TeaModel {
    // 总记录
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

    // 二级用户列表
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<SubUserAccountVO> records;

    public static SubUserAccountPageData build(java.util.Map<String, ?> map) throws Exception {
        SubUserAccountPageData self = new SubUserAccountPageData();
        return TeaModel.build(map, self);
    }

    public SubUserAccountPageData setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public SubUserAccountPageData setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public SubUserAccountPageData setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public SubUserAccountPageData setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SubUserAccountPageData setRecords(java.util.List<SubUserAccountVO> records) {
        this.records = records;
        return this;
    }
    public java.util.List<SubUserAccountVO> getRecords() {
        return this.records;
    }

}
