// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class BatchqueryCommercialcoreProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产品code列表
    @NameInMap("product_codes")
    public java.util.List<String> productCodes;

    public static BatchqueryCommercialcoreProductResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCommercialcoreProductResponse self = new BatchqueryCommercialcoreProductResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryCommercialcoreProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryCommercialcoreProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryCommercialcoreProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryCommercialcoreProductResponse setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

}
