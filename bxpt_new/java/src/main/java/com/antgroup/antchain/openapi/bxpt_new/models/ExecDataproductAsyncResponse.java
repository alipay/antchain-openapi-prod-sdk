// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class ExecDataproductAsyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行状态
    // RUNNING：执行中
    // SUCCESS：成功
    // FAIL：失败
    @NameInMap("exec_status")
    public String execStatus;

    public static ExecDataproductAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataproductAsyncResponse self = new ExecDataproductAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataproductAsyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecDataproductAsyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecDataproductAsyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecDataproductAsyncResponse setExecStatus(String execStatus) {
        this.execStatus = execStatus;
        return this;
    }
    public String getExecStatus() {
        return this.execStatus;
    }

}
