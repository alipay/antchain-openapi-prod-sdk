// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRentalProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 短租商品信息
    @NameInMap("product_info")
    public String productInfo;

    public static QueryRentalProductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRentalProductResponse self = new QueryRentalProductResponse();
        return TeaModel.build(map, self);
    }

    public QueryRentalProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRentalProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRentalProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRentalProductResponse setProductInfo(String productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public String getProductInfo() {
        return this.productInfo;
    }

}
