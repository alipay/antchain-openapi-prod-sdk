// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class ResetAntchainDemosdkAbcdLimitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("stauts")
    public String stauts;

    // 返回描述
    @NameInMap("msg")
    public String msg;

    public static ResetAntchainDemosdkAbcdLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAntchainDemosdkAbcdLimitResponse self = new ResetAntchainDemosdkAbcdLimitResponse();
        return TeaModel.build(map, self);
    }

    public ResetAntchainDemosdkAbcdLimitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ResetAntchainDemosdkAbcdLimitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResetAntchainDemosdkAbcdLimitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ResetAntchainDemosdkAbcdLimitResponse setStauts(String stauts) {
        this.stauts = stauts;
        return this;
    }
    public String getStauts() {
        return this.stauts;
    }

    public ResetAntchainDemosdkAbcdLimitResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
