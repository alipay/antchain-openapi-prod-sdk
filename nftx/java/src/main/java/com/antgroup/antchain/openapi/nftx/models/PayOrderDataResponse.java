// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class PayOrderDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 鲸探开放平台内部订单号
    @NameInMap("open_order_no")
    public String openOrderNo;

    // json字符串
    @NameInMap("pay_params")
    public String payParams;

    public static PayOrderDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PayOrderDataResponse self = new PayOrderDataResponse();
        return TeaModel.build(map, self);
    }

    public PayOrderDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PayOrderDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PayOrderDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PayOrderDataResponse setOpenOrderNo(String openOrderNo) {
        this.openOrderNo = openOrderNo;
        return this;
    }
    public String getOpenOrderNo() {
        return this.openOrderNo;
    }

    public PayOrderDataResponse setPayParams(String payParams) {
        this.payParams = payParams;
        return this;
    }
    public String getPayParams() {
        return this.payParams;
    }

}
