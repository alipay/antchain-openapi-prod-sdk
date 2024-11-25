// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class AddSupplierPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 添加打款记录成功
    @NameInMap("data")
    public Boolean data;

    public static AddSupplierPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSupplierPaymentResponse self = new AddSupplierPaymentResponse();
        return TeaModel.build(map, self);
    }

    public AddSupplierPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddSupplierPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddSupplierPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddSupplierPaymentResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
