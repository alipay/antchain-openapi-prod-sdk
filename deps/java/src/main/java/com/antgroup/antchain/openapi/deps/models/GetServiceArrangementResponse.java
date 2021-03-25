// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetServiceArrangementResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // execution_detail
    @NameInMap("execution_detail")
    public String executionDetail;

    public static GetServiceArrangementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceArrangementResponse self = new GetServiceArrangementResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceArrangementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetServiceArrangementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetServiceArrangementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetServiceArrangementResponse setExecutionDetail(String executionDetail) {
        this.executionDetail = executionDetail;
        return this;
    }
    public String getExecutionDetail() {
        return this.executionDetail;
    }

}
