// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class SimpleResult extends TeaModel {
    // success
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 返回结果编码 “ok”
    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 返回结果信息
    /**
     * <strong>example:</strong>
     * <p>返回结果信息</p>
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

    public static SimpleResult build(java.util.Map<String, ?> map) throws Exception {
        SimpleResult self = new SimpleResult();
        return TeaModel.build(map, self);
    }

    public SimpleResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SimpleResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SimpleResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SimpleResult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SimpleResult setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

}
