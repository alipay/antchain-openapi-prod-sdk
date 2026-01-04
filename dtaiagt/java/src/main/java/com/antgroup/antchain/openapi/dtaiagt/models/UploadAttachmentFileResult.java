// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class UploadAttachmentFileResult extends TeaModel {
    // success
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // code
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // msg
    /**
     * <strong>example:</strong>
     * <p>msg</p>
     */
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    // trace_id
    /**
     * <strong>example:</strong>
     * <p>trace_id</p>
     */
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // req_id
    /**
     * <strong>example:</strong>
     * <p>req_id</p>
     */
    @NameInMap("req_id")
    @Validation(required = true)
    public String reqId;

    // 上传解析结果
    // 
    @NameInMap("result")
    @Validation(required = true)
    public UploadAttachmentFileVO result;

    public static UploadAttachmentFileResult build(java.util.Map<String, ?> map) throws Exception {
        UploadAttachmentFileResult self = new UploadAttachmentFileResult();
        return TeaModel.build(map, self);
    }

    public UploadAttachmentFileResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UploadAttachmentFileResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadAttachmentFileResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UploadAttachmentFileResult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public UploadAttachmentFileResult setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public UploadAttachmentFileResult setResult(UploadAttachmentFileVO result) {
        this.result = result;
        return this;
    }
    public UploadAttachmentFileVO getResult() {
        return this.result;
    }

}
