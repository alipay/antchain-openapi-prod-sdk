// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsSkuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 商品列表
    @NameInMap("skus")
    public java.util.List<SKUItem> skus;

    public static QueryMypointsSkuResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsSkuResponse self = new QueryMypointsSkuResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypointsSkuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypointsSkuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypointsSkuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypointsSkuResponse setSkus(java.util.List<SKUItem> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<SKUItem> getSkus() {
        return this.skus;
    }

}
