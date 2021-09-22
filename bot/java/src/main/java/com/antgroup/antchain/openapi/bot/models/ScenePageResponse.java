// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ScenePageResponse extends TeaModel {
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
    public java.util.List<SceneModel> pageData;

    public static ScenePageResponse build(java.util.Map<String, ?> map) throws Exception {
        ScenePageResponse self = new ScenePageResponse();
        return TeaModel.build(map, self);
    }

    public ScenePageResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ScenePageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ScenePageResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ScenePageResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public ScenePageResponse setPageData(java.util.List<SceneModel> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<SceneModel> getPageData() {
        return this.pageData;
    }

}
