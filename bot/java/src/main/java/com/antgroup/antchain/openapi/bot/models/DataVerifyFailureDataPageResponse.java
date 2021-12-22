// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DataVerifyFailureDataPageResponse extends TeaModel {
    // 页数
    // 
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页码
    // 
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总记录数
    // 
    @NameInMap("total_size")
    @Validation(required = true)
    public Long totalSize;

    // 总页数
    // 
    @NameInMap("total_pages")
    @Validation(required = true)
    public Long totalPages;

    // 数据
    @NameInMap("page_data")
    @Validation(required = true)
    public java.util.List<DataVerifyFailureData> pageData;

    public static DataVerifyFailureDataPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DataVerifyFailureDataPageResponse self = new DataVerifyFailureDataPageResponse();
        return TeaModel.build(map, self);
    }

    public DataVerifyFailureDataPageResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public DataVerifyFailureDataPageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DataVerifyFailureDataPageResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public DataVerifyFailureDataPageResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public DataVerifyFailureDataPageResponse setPageData(java.util.List<DataVerifyFailureData> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<DataVerifyFailureData> getPageData() {
        return this.pageData;
    }

}
