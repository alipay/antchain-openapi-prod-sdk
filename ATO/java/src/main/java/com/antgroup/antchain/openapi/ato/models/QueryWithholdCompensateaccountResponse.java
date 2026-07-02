// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryWithholdCompensateaccountResponse extends TeaModel {
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

    public static QueryWithholdCompensateaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdCompensateaccountResponse self = new QueryWithholdCompensateaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdCompensateaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWithholdCompensateaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWithholdCompensateaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWithholdCompensateaccountResponse setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryWithholdCompensateaccountResponse setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public Long getAvailableAmount() {
        return this.availableAmount;
    }

}
