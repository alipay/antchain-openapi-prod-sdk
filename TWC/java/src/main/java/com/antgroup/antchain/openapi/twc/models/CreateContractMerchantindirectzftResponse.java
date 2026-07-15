// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractMerchantindirectzftResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 传入参数内容
    @NameInMap("body")
    public String body;

    // 错误码
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 支付宝返回的二级错误信息
    @NameInMap("sub_code")
    public String subCode;

    // 支付宝返回的二级错误信息描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static CreateContractMerchantindirectzftResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContractMerchantindirectzftResponse self = new CreateContractMerchantindirectzftResponse();
        return TeaModel.build(map, self);
    }

    public CreateContractMerchantindirectzftResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateContractMerchantindirectzftResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateContractMerchantindirectzftResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateContractMerchantindirectzftResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateContractMerchantindirectzftResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateContractMerchantindirectzftResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateContractMerchantindirectzftResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateContractMerchantindirectzftResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateContractMerchantindirectzftResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
