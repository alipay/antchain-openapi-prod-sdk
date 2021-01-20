// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackBgreleaseGraytrafficResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 回滚进程ID
    @NameInMap("process_id")
    public String processId;

    public static RollbackBgreleaseGraytrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackBgreleaseGraytrafficResponse self = new RollbackBgreleaseGraytrafficResponse();
        return TeaModel.build(map, self);
    }

    public RollbackBgreleaseGraytrafficResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RollbackBgreleaseGraytrafficResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RollbackBgreleaseGraytrafficResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RollbackBgreleaseGraytrafficResponse setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
