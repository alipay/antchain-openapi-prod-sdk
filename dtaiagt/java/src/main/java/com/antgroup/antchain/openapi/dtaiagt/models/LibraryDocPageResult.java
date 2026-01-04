// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class LibraryDocPageResult extends TeaModel {
    // 请求处理结果标识
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 业务状态码
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 返回消息
    /**
     * <strong>example:</strong>
     * <p>返回消息</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 请求链路追踪ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 符合查询条件的总记录数
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 当前返回数据的页码
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 文档数据列表
    @NameInMap("result")
    @Validation(required = true)
    public java.util.List<ContentFile> result;

    public static LibraryDocPageResult build(java.util.Map<String, ?> map) throws Exception {
        LibraryDocPageResult self = new LibraryDocPageResult();
        return TeaModel.build(map, self);
    }

    public LibraryDocPageResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LibraryDocPageResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LibraryDocPageResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LibraryDocPageResult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public LibraryDocPageResult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public LibraryDocPageResult setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public LibraryDocPageResult setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public LibraryDocPageResult setResult(java.util.List<ContentFile> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ContentFile> getResult() {
        return this.result;
    }

}
