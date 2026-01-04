// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class LibraryUploadFileResult extends TeaModel {
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
     * <p>code</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 返回消息
    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 请求链路追踪ID
    /**
     * <strong>example:</strong>
     * <p>312</p>
     */
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 文件上传响应对象
    @NameInMap("result")
    @Validation(required = true)
    public UploadAttachmentFileVO result;

    public static LibraryUploadFileResult build(java.util.Map<String, ?> map) throws Exception {
        LibraryUploadFileResult self = new LibraryUploadFileResult();
        return TeaModel.build(map, self);
    }

    public LibraryUploadFileResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LibraryUploadFileResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LibraryUploadFileResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LibraryUploadFileResult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public LibraryUploadFileResult setResult(UploadAttachmentFileVO result) {
        this.result = result;
        return this;
    }
    public UploadAttachmentFileVO getResult() {
        return this.result;
    }

}
