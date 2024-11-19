// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoWithholdCompensateaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代偿卡号
    @NameInMap("card_no")
    public String cardNo;

    // 可用余额，单位为分
    @NameInMap("available_amount")
    public Long availableAmount;

    public static QueryAntchainAtoWithholdCompensateaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoWithholdCompensateaccountResponse self = new QueryAntchainAtoWithholdCompensateaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoWithholdCompensateaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoWithholdCompensateaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoWithholdCompensateaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoWithholdCompensateaccountResponse setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryAntchainAtoWithholdCompensateaccountResponse setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public Long getAvailableAmount() {
        return this.availableAmount;
    }

}
