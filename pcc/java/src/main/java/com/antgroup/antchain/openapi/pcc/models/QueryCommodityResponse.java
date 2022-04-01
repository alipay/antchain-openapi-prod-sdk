// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class QueryCommodityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品列表
    @NameInMap("commoditys")
    public java.util.List<Commodity> commoditys;

    public static QueryCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityResponse self = new QueryCommodityResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommodityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCommodityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCommodityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCommodityResponse setCommoditys(java.util.List<Commodity> commoditys) {
        this.commoditys = commoditys;
        return this;
    }
    public java.util.List<Commodity> getCommoditys() {
        return this.commoditys;
    }

}
