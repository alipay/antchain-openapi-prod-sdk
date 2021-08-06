// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class QueryProductResponse extends TeaModel {
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
    @NameInMap("product_array")
    public java.util.List<ProductBaseInfo> productArray;

    public static QueryProductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductResponse self = new QueryProductResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProductResponse setProductArray(java.util.List<ProductBaseInfo> productArray) {
        this.productArray = productArray;
        return this;
    }
    public java.util.List<ProductBaseInfo> getProductArray() {
        return this.productArray;
    }

}
