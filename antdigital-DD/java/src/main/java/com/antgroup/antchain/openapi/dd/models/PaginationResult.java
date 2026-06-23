// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PaginationResult extends TeaModel {
    // 查询结果
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<ChargeBillVO> data;

    // 当前页
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 分页大小
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 查询结果总数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static PaginationResult build(java.util.Map<String, ?> map) throws Exception {
        PaginationResult self = new PaginationResult();
        return TeaModel.build(map, self);
    }

    public PaginationResult setData(java.util.List<ChargeBillVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ChargeBillVO> getData() {
        return this.data;
    }

    public PaginationResult setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PaginationResult setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PaginationResult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PaginationResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
