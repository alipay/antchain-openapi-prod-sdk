// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyContractMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否进件成功
    @NameInMap("success")
    public Boolean success;

    // 进件子结果码，0 成功，1 代理商户已进件，2 商户已进件，请走挂接接口进行代理商挂接，3 商户进件中
    @NameInMap("sub_code")
    public Long subCode;

    // 进件失败原因
    @NameInMap("sub_msg")
    public String subMsg;

    // 已进件商户信息（当cert_no对应的商户已经进件过，会返回完整的已进件的商户信息）
    @NameInMap("merchant_info")
    public String merchantInfo;

    // 已进件成功的商户ID（当cert_no表示的商户已经进件过，会返回进件生成的商户ID）
    @NameInMap("smid")
    public String smid;

    // 订单ID
    @NameInMap("order_id")
    public String orderId;

    public static ApplyContractMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyContractMerchantResponse self = new ApplyContractMerchantResponse();
        return TeaModel.build(map, self);
    }

    public ApplyContractMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyContractMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyContractMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyContractMerchantResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyContractMerchantResponse setSubCode(Long subCode) {
        this.subCode = subCode;
        return this;
    }
    public Long getSubCode() {
        return this.subCode;
    }

    public ApplyContractMerchantResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public ApplyContractMerchantResponse setMerchantInfo(String merchantInfo) {
        this.merchantInfo = merchantInfo;
        return this;
    }
    public String getMerchantInfo() {
        return this.merchantInfo;
    }

    public ApplyContractMerchantResponse setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

    public ApplyContractMerchantResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
