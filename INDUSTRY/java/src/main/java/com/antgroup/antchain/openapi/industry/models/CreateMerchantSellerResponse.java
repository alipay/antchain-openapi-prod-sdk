// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class CreateMerchantSellerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 申请单id
    @NameInMap("order_id")
    public String orderId;

    public static CreateMerchantSellerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMerchantSellerResponse self = new CreateMerchantSellerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMerchantSellerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateMerchantSellerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMerchantSellerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateMerchantSellerResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
