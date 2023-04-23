// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryEcoCommodityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品及其归属政策信息
    @NameInMap("commodity_policy_info")
    public java.util.List<CommodityPolicyRelation> commodityPolicyInfo;

    public static QueryEcoCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEcoCommodityResponse self = new QueryEcoCommodityResponse();
        return TeaModel.build(map, self);
    }

    public QueryEcoCommodityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEcoCommodityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEcoCommodityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEcoCommodityResponse setCommodityPolicyInfo(java.util.List<CommodityPolicyRelation> commodityPolicyInfo) {
        this.commodityPolicyInfo = commodityPolicyInfo;
        return this;
    }
    public java.util.List<CommodityPolicyRelation> getCommodityPolicyInfo() {
        return this.commodityPolicyInfo;
    }

}
