// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseOrderproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 错误码
    @NameInMap("code")
    public String code;

    // 返回信息描述
    @NameInMap("message")
    public String message;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单商品信息的数组
    @NameInMap("product_infos")
    public java.util.List<LeaseOrderProductInfo> productInfos;

    public static QueryLeaseOrderproductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseOrderproductResponse self = new QueryLeaseOrderproductResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseOrderproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseOrderproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseOrderproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseOrderproductResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseOrderproductResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLeaseOrderproductResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseOrderproductResponse setProductInfos(java.util.List<LeaseOrderProductInfo> productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public java.util.List<LeaseOrderProductInfo> getProductInfos() {
        return this.productInfos;
    }

}
