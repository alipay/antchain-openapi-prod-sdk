// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteResourceComputerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 0表示正常，非0表示异常
    @NameInMap("ret_code")
    public Long retCode;

    // 错误描述信息
    @NameInMap("message")
    public String message;

    // 异步执行任务id
    @NameInMap("job_id")
    public String jobId;

    public static DeleteResourceComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceComputerResponse self = new DeleteResourceComputerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteResourceComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteResourceComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteResourceComputerResponse setRetCode(Long retCode) {
        this.retCode = retCode;
        return this;
    }
    public Long getRetCode() {
        return this.retCode;
    }

    public DeleteResourceComputerResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteResourceComputerResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
