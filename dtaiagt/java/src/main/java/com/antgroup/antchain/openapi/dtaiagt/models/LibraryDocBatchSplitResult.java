// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class LibraryDocBatchSplitResult extends TeaModel {
    // 请求是否成功
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
     * <p>消息</p>
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

    // 任务ID，可用于异步任务追踪
    @NameInMap("result")
    @Validation(required = true)
    public Long result;

    public static LibraryDocBatchSplitResult build(java.util.Map<String, ?> map) throws Exception {
        LibraryDocBatchSplitResult self = new LibraryDocBatchSplitResult();
        return TeaModel.build(map, self);
    }

    public LibraryDocBatchSplitResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LibraryDocBatchSplitResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LibraryDocBatchSplitResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LibraryDocBatchSplitResult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public LibraryDocBatchSplitResult setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
