// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ListAuthProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产品code
    @NameInMap("product_code")
    public String productCode;

    // 产品简称
    @NameInMap("product_abbr")
    public String productAbbr;

    public static ListAuthProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthProductResponse self = new ListAuthProductResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAuthProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAuthProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAuthProductResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListAuthProductResponse setProductAbbr(String productAbbr) {
        this.productAbbr = productAbbr;
        return this;
    }
    public String getProductAbbr() {
        return this.productAbbr;
    }

}
