// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentChatHistoryForSessionIdResult extends TeaModel {
    // success
    /**
     * <strong>example:</strong>
     * <p>success</p>
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

    // 对话历史
    // 
    @NameInMap("result")
    @Validation(required = true)
    public DisplaySingleSessionHistoryVO result;

    public static AgentChatHistoryForSessionIdResult build(java.util.Map<String, ?> map) throws Exception {
        AgentChatHistoryForSessionIdResult self = new AgentChatHistoryForSessionIdResult();
        return TeaModel.build(map, self);
    }

    public AgentChatHistoryForSessionIdResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AgentChatHistoryForSessionIdResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AgentChatHistoryForSessionIdResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AgentChatHistoryForSessionIdResult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public AgentChatHistoryForSessionIdResult setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public AgentChatHistoryForSessionIdResult setResult(DisplaySingleSessionHistoryVO result) {
        this.result = result;
        return this;
    }
    public DisplaySingleSessionHistoryVO getResult() {
        return this.result;
    }

}
