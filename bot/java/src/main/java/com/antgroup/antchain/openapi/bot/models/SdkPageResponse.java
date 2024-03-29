// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SdkPageResponse extends TeaModel {
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
    public java.util.List<SdkModel> pageData;

    public static SdkPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkPageResponse self = new SdkPageResponse();
        return TeaModel.build(map, self);
    }

    public SdkPageResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public SdkPageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SdkPageResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public SdkPageResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public SdkPageResponse setPageData(java.util.List<SdkModel> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<SdkModel> getPageData() {
        return this.pageData;
    }

}
