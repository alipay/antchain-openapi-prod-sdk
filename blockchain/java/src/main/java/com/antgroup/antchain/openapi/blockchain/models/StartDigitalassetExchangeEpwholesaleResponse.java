// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDigitalassetExchangeEpwholesaleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 失败账户列表
    @NameInMap("fail_list")
    public java.util.List<String> failList;

    // 失败原因 0:成功 1:执行失败 2:线下配额数量不足
    @NameInMap("reason")
    public Long reason;

    // 成功账户列表
    @NameInMap("success_list")
    public java.util.List<String> successList;

    public static StartDigitalassetExchangeEpwholesaleResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDigitalassetExchangeEpwholesaleResponse self = new StartDigitalassetExchangeEpwholesaleResponse();
        return TeaModel.build(map, self);
    }

    public StartDigitalassetExchangeEpwholesaleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDigitalassetExchangeEpwholesaleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDigitalassetExchangeEpwholesaleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDigitalassetExchangeEpwholesaleResponse setFailList(java.util.List<String> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<String> getFailList() {
        return this.failList;
    }

    public StartDigitalassetExchangeEpwholesaleResponse setReason(Long reason) {
        this.reason = reason;
        return this;
    }
    public Long getReason() {
        return this.reason;
    }

    public StartDigitalassetExchangeEpwholesaleResponse setSuccessList(java.util.List<String> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<String> getSuccessList() {
        return this.successList;
    }

}
