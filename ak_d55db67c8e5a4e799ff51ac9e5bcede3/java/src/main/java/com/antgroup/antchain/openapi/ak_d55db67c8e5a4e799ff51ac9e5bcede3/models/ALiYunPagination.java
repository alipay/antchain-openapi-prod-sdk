// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class ALiYunPagination extends TeaModel {
    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 分页编号
    @NameInMap("page_number")
    public Long pageNumber;

    // 总数大小
    @NameInMap("total_count")
    public Long totalCount;

    public static ALiYunPagination build(java.util.Map<String, ?> map) throws Exception {
        ALiYunPagination self = new ALiYunPagination();
        return TeaModel.build(map, self);
    }

    public ALiYunPagination setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ALiYunPagination setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ALiYunPagination setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
