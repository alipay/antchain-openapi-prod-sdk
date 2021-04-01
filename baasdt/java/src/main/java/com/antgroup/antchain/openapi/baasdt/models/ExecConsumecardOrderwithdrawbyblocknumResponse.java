// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardOrderwithdrawbyblocknumResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 提现单编号(跟踪提现任务)
    @NameInMap("withdraw_biz_id")
    public String withdrawBizId;

    public static ExecConsumecardOrderwithdrawbyblocknumResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardOrderwithdrawbyblocknumResponse self = new ExecConsumecardOrderwithdrawbyblocknumResponse();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardOrderwithdrawbyblocknumResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecConsumecardOrderwithdrawbyblocknumResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecConsumecardOrderwithdrawbyblocknumResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecConsumecardOrderwithdrawbyblocknumResponse setWithdrawBizId(String withdrawBizId) {
        this.withdrawBizId = withdrawBizId;
        return this;
    }
    public String getWithdrawBizId() {
        return this.withdrawBizId;
    }

}
