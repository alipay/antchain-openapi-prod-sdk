// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class RepayAssetpledgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款id
    @NameInMap("repay_id")
    public String repayId;

    // 链信息
    @NameInMap("info")
    public BlockchainInfo info;

    // 请求标识
    @NameInMap("request_id")
    public String requestId;

    // 时间戳
    @NameInMap("date")
    public Long date;

    public static RepayAssetpledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayAssetpledgeResponse self = new RepayAssetpledgeResponse();
        return TeaModel.build(map, self);
    }

    public RepayAssetpledgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RepayAssetpledgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RepayAssetpledgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RepayAssetpledgeResponse setRepayId(String repayId) {
        this.repayId = repayId;
        return this;
    }
    public String getRepayId() {
        return this.repayId;
    }

    public RepayAssetpledgeResponse setInfo(BlockchainInfo info) {
        this.info = info;
        return this;
    }
    public BlockchainInfo getInfo() {
        return this.info;
    }

    public RepayAssetpledgeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RepayAssetpledgeResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

}
