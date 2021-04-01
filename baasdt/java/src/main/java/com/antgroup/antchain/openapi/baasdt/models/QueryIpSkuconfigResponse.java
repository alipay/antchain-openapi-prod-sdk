// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpSkuconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sku信息
    @NameInMap("skus")
    public java.util.List<IpSkuEmphasisInfo> skus;

    public static QueryIpSkuconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpSkuconfigResponse self = new QueryIpSkuconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpSkuconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpSkuconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpSkuconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpSkuconfigResponse setSkus(java.util.List<IpSkuEmphasisInfo> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<IpSkuEmphasisInfo> getSkus() {
        return this.skus;
    }

}
