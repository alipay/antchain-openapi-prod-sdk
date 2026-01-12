// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class VerifyDubbridgeCustomerBankcardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 绑卡流水
    @NameInMap("bind_serial_no")
    public String bindSerialNo;

    // 签约结果
    @NameInMap("sign_result")
    public String signResult;

    // 客户号
    @NameInMap("customer_no")
    public String customerNo;

    // 协议号
    @NameInMap("protocol_no")
    public String protocolNo;

    public static VerifyDubbridgeCustomerBankcardResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDubbridgeCustomerBankcardResponse self = new VerifyDubbridgeCustomerBankcardResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDubbridgeCustomerBankcardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyDubbridgeCustomerBankcardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyDubbridgeCustomerBankcardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyDubbridgeCustomerBankcardResponse setBindSerialNo(String bindSerialNo) {
        this.bindSerialNo = bindSerialNo;
        return this;
    }
    public String getBindSerialNo() {
        return this.bindSerialNo;
    }

    public VerifyDubbridgeCustomerBankcardResponse setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

    public VerifyDubbridgeCustomerBankcardResponse setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public VerifyDubbridgeCustomerBankcardResponse setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

}
