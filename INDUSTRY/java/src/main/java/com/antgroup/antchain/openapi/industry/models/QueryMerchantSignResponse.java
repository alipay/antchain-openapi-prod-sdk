// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class QueryMerchantSignResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 进件申请单信息
    @NameInMap("order_info")
    public MerchantOrderInfo orderInfo;

    public static QueryMerchantSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantSignResponse self = new QueryMerchantSignResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantSignResponse setOrderInfo(MerchantOrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public MerchantOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

}
