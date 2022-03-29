// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExecSofamqDailycheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否满足日切条件
    @NameInMap("check_status")
    public Boolean checkStatus;

    public static ExecSofamqDailycheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecSofamqDailycheckResponse self = new ExecSofamqDailycheckResponse();
        return TeaModel.build(map, self);
    }

    public ExecSofamqDailycheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecSofamqDailycheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecSofamqDailycheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecSofamqDailycheckResponse setCheckStatus(Boolean checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Boolean getCheckStatus() {
        return this.checkStatus;
    }

}
