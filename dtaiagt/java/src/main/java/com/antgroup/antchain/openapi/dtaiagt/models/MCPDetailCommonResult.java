// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class MCPDetailCommonResult extends TeaModel {
    // MCP详情信息
    @NameInMap("result")
    @Validation(required = true)
    public DigitalGatewayMCPDetailVO result;

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
     * <p>ok</p>
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

    // 异常对象
    /**
     * <strong>example:</strong>
     * <p>biz_error</p>
     */
    @NameInMap("biz_error")
    @Validation(required = true)
    public BizErrorInfo bizError;

    public static MCPDetailCommonResult build(java.util.Map<String, ?> map) throws Exception {
        MCPDetailCommonResult self = new MCPDetailCommonResult();
        return TeaModel.build(map, self);
    }

    public MCPDetailCommonResult setResult(DigitalGatewayMCPDetailVO result) {
        this.result = result;
        return this;
    }
    public DigitalGatewayMCPDetailVO getResult() {
        return this.result;
    }

    public MCPDetailCommonResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MCPDetailCommonResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MCPDetailCommonResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public MCPDetailCommonResult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public MCPDetailCommonResult setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public MCPDetailCommonResult setBizError(BizErrorInfo bizError) {
        this.bizError = bizError;
        return this;
    }
    public BizErrorInfo getBizError() {
        return this.bizError;
    }

}
