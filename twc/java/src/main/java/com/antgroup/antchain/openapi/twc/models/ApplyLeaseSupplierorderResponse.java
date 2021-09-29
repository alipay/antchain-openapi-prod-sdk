// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyLeaseSupplierorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单信息
    @NameInMap("order_info")
    public ApplySupplierOrderProductOutput orderInfo;

    // 错误码，0表示成功
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    // 商户本次采购的所有商品信息
    @NameInMap("product_infos")
    public java.util.List<ApplySupplierOrderProductInput> productInfos;

    public static ApplyLeaseSupplierorderResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyLeaseSupplierorderResponse self = new ApplyLeaseSupplierorderResponse();
        return TeaModel.build(map, self);
    }

    public ApplyLeaseSupplierorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyLeaseSupplierorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyLeaseSupplierorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyLeaseSupplierorderResponse setOrderInfo(ApplySupplierOrderProductOutput orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public ApplySupplierOrderProductOutput getOrderInfo() {
        return this.orderInfo;
    }

    public ApplyLeaseSupplierorderResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ApplyLeaseSupplierorderResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ApplyLeaseSupplierorderResponse setProductInfos(java.util.List<ApplySupplierOrderProductInput> productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public java.util.List<ApplySupplierOrderProductInput> getProductInfos() {
        return this.productInfos;
    }

}
