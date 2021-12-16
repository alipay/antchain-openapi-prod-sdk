// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ListCommercialcoreProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产品列表
    @NameInMap("products")
    public java.util.List<ProductVO> products;

    public static ListCommercialcoreProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialcoreProductResponse self = new ListCommercialcoreProductResponse();
        return TeaModel.build(map, self);
    }

    public ListCommercialcoreProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCommercialcoreProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCommercialcoreProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCommercialcoreProductResponse setProducts(java.util.List<ProductVO> products) {
        this.products = products;
        return this;
    }
    public java.util.List<ProductVO> getProducts() {
        return this.products;
    }

}
