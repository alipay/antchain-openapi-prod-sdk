// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ffd8f5e932224d668101af0154daa8a6.models;

import com.aliyun.tea.*;

public class ExecAntcloudBxptnewDataproductAsyncResponse extends TeaModel {
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

    public static ExecAntcloudBxptnewDataproductAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudBxptnewDataproductAsyncResponse self = new ExecAntcloudBxptnewDataproductAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudBxptnewDataproductAsyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudBxptnewDataproductAsyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudBxptnewDataproductAsyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudBxptnewDataproductAsyncResponse setExecStatus(String execStatus) {
        this.execStatus = execStatus;
        return this;
    }
    public String getExecStatus() {
        return this.execStatus;
    }

}
