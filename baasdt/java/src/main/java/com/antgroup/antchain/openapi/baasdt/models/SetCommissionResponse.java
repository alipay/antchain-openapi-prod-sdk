// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetCommissionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 手续费ID
    @NameInMap("commission_id")
    public String commissionId;

    public static SetCommissionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCommissionResponse self = new SetCommissionResponse();
        return TeaModel.build(map, self);
    }

    public SetCommissionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetCommissionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetCommissionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetCommissionResponse setCommissionId(String commissionId) {
        this.commissionId = commissionId;
        return this;
    }
    public String getCommissionId() {
        return this.commissionId;
    }

}
