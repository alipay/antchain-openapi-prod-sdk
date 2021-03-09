// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StopResourceComputerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 非0表示异常，0表示正常
    @NameInMap("ret_code")
    public Long retCode;

    // 异步执行的任务ID
    @NameInMap("job_id")
    public String jobId;

    // 错误信息
    @NameInMap("message")
    public String message;

    public static StopResourceComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopResourceComputerResponse self = new StopResourceComputerResponse();
        return TeaModel.build(map, self);
    }

    public StopResourceComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StopResourceComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StopResourceComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StopResourceComputerResponse setRetCode(Long retCode) {
        this.retCode = retCode;
        return this;
    }
    public Long getRetCode() {
        return this.retCode;
    }

    public StopResourceComputerResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StopResourceComputerResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
