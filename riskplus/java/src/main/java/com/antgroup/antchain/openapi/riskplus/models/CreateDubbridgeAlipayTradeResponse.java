// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateDubbridgeAlipayTradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产方购物订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 订单二维码码串，支付宝预下单生成的二维码码串，有效时间2小时
    @NameInMap("qr_code")
    public String qrCode;

    public static CreateDubbridgeAlipayTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDubbridgeAlipayTradeResponse self = new CreateDubbridgeAlipayTradeResponse();
        return TeaModel.build(map, self);
    }

    public CreateDubbridgeAlipayTradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDubbridgeAlipayTradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDubbridgeAlipayTradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDubbridgeAlipayTradeResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public CreateDubbridgeAlipayTradeResponse setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
