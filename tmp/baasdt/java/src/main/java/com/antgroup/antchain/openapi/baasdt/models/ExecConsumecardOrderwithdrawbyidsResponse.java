// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardOrderwithdrawbyidsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 提现单编号(跟踪提现任务)
    @NameInMap("withdraw_biz_id")
    public String withdrawBizId;

    public static ExecConsumecardOrderwithdrawbyidsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardOrderwithdrawbyidsResponse self = new ExecConsumecardOrderwithdrawbyidsResponse();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardOrderwithdrawbyidsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecConsumecardOrderwithdrawbyidsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecConsumecardOrderwithdrawbyidsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecConsumecardOrderwithdrawbyidsResponse setWithdrawBizId(String withdrawBizId) {
        this.withdrawBizId = withdrawBizId;
        return this;
    }
    public String getWithdrawBizId() {
        return this.withdrawBizId;
    }

}
