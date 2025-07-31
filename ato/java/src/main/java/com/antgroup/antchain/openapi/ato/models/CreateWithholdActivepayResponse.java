// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateWithholdActivepayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝支付订单号，用于拉起主动支付页面
    @NameInMap("trade_no")
    public String tradeNo;

    // 单据支付字符串
    // app场景：返回签名字符串
    // h5场景：返回支付链接
    @NameInMap("order_str")
    public String orderStr;

    public static CreateWithholdActivepayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdActivepayResponse self = new CreateWithholdActivepayResponse();
        return TeaModel.build(map, self);
    }

    public CreateWithholdActivepayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateWithholdActivepayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateWithholdActivepayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateWithholdActivepayResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public CreateWithholdActivepayResponse setOrderStr(String orderStr) {
        this.orderStr = orderStr;
        return this;
    }
    public String getOrderStr() {
        return this.orderStr;
    }

}
