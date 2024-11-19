// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoFundCompensateaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可用余额，单位为分
    @NameInMap("available_amount")
    public Long availableAmount;

    public static QueryAntchainAtoFundCompensateaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoFundCompensateaccountResponse self = new QueryAntchainAtoFundCompensateaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoFundCompensateaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoFundCompensateaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoFundCompensateaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoFundCompensateaccountResponse setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public Long getAvailableAmount() {
        return this.availableAmount;
    }

}
