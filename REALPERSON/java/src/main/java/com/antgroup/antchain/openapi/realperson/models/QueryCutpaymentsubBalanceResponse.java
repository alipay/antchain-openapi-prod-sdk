// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentsubBalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账簿可用余额，单位：元；可用于提现，整数部分最长10位数，保留两位小数
    @NameInMap("available_amount")
    public String availableAmount;

    // 账簿余额，单位：元；整数部分最长10位数，保留两位小数
    @NameInMap("curr_amount")
    public String currAmount;

    // 扩展信息，预留字段
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryCutpaymentsubBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentsubBalanceResponse self = new QueryCutpaymentsubBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentsubBalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCutpaymentsubBalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCutpaymentsubBalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCutpaymentsubBalanceResponse setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public QueryCutpaymentsubBalanceResponse setCurrAmount(String currAmount) {
        this.currAmount = currAmount;
        return this;
    }
    public String getCurrAmount() {
        return this.currAmount;
    }

    public QueryCutpaymentsubBalanceResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
