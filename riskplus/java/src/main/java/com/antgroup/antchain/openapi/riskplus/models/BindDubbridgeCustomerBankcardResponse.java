// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BindDubbridgeCustomerBankcardResponse extends TeaModel {
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

    public static BindDubbridgeCustomerBankcardResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDubbridgeCustomerBankcardResponse self = new BindDubbridgeCustomerBankcardResponse();
        return TeaModel.build(map, self);
    }

    public BindDubbridgeCustomerBankcardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindDubbridgeCustomerBankcardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindDubbridgeCustomerBankcardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindDubbridgeCustomerBankcardResponse setBindSerialNo(String bindSerialNo) {
        this.bindSerialNo = bindSerialNo;
        return this;
    }
    public String getBindSerialNo() {
        return this.bindSerialNo;
    }

}
