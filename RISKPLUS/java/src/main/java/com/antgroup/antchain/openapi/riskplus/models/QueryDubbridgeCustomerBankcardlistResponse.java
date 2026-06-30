// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCustomerBankcardlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户绑定银行卡信息列表
    @NameInMap("customer_bank_card_info_list")
    public java.util.List<CustomerBankCardInfo> customerBankCardInfoList;

    public static QueryDubbridgeCustomerBankcardlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCustomerBankcardlistResponse self = new QueryDubbridgeCustomerBankcardlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCustomerBankcardlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCustomerBankcardlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCustomerBankcardlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCustomerBankcardlistResponse setCustomerBankCardInfoList(java.util.List<CustomerBankCardInfo> customerBankCardInfoList) {
        this.customerBankCardInfoList = customerBankCardInfoList;
        return this;
    }
    public java.util.List<CustomerBankCardInfo> getCustomerBankCardInfoList() {
        return this.customerBankCardInfoList;
    }

}
