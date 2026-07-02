// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总量
    @NameInMap("total")
    public Long total;

    // 商品列表
    @NameInMap("product_info_list")
    public java.util.List<ProductInfo> productInfoList;

    public static PagequeryInnerProductResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerProductResponse self = new PagequeryInnerProductResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerProductResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerProductResponse setProductInfoList(java.util.List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
        return this;
    }
    public java.util.List<ProductInfo> getProductInfoList() {
        return this.productInfoList;
    }

}
