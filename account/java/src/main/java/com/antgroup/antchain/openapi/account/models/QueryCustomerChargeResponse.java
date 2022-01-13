// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class QueryCustomerChargeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 充值记录
    @NameInMap("result")
    public java.util.List<ChargeRecordVO> result;

    // 总的数量
    @NameInMap("total_items")
    public Long totalItems;

    public static QueryCustomerChargeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerChargeResponse self = new QueryCustomerChargeResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerChargeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCustomerChargeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCustomerChargeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCustomerChargeResponse setResult(java.util.List<ChargeRecordVO> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ChargeRecordVO> getResult() {
        return this.result;
    }

    public QueryCustomerChargeResponse setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Long getTotalItems() {
        return this.totalItems;
    }

}
