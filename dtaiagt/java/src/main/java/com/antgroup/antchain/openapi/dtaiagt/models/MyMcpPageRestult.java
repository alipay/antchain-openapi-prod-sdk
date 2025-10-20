// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class MyMcpPageRestult extends TeaModel {
    // total_count
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // current_page
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // trace_id
    /**
     * <strong>example:</strong>
     * <p>trace_id</p>
     */
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

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

    // req_id
    /**
     * <strong>example:</strong>
     * <p>req_id</p>
     */
    @NameInMap("req_id")
    @Validation(required = true)
    public String reqId;

    // MCP分页内容
    @NameInMap("result")
    @Validation(required = true)
    public java.util.List<DigitalGatewayMCPPageVO> result;

    public static MyMcpPageRestult build(java.util.Map<String, ?> map) throws Exception {
        MyMcpPageRestult self = new MyMcpPageRestult();
        return TeaModel.build(map, self);
    }

    public MyMcpPageRestult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public MyMcpPageRestult setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public MyMcpPageRestult setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public MyMcpPageRestult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MyMcpPageRestult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MyMcpPageRestult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public MyMcpPageRestult setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public MyMcpPageRestult setResult(java.util.List<DigitalGatewayMCPPageVO> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DigitalGatewayMCPPageVO> getResult() {
        return this.result;
    }

}
