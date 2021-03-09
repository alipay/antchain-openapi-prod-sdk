// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ReinitResourceComputerpasswordResponse extends TeaModel {
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

    // 异步任务ID
    @NameInMap("job_id")
    public String jobId;

    public static ReinitResourceComputerpasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitResourceComputerpasswordResponse self = new ReinitResourceComputerpasswordResponse();
        return TeaModel.build(map, self);
    }

    public ReinitResourceComputerpasswordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReinitResourceComputerpasswordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReinitResourceComputerpasswordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReinitResourceComputerpasswordResponse setRetCode(Long retCode) {
        this.retCode = retCode;
        return this;
    }
    public Long getRetCode() {
        return this.retCode;
    }

    public ReinitResourceComputerpasswordResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReinitResourceComputerpasswordResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
