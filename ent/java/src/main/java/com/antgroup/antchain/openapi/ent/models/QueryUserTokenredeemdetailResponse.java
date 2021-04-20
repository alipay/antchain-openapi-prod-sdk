// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryUserTokenredeemdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 兑现流水
    @NameInMap("redeem_detail")
    public java.util.List<TokenOperationDetail> redeemDetail;

    public static QueryUserTokenredeemdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTokenredeemdetailResponse self = new QueryUserTokenredeemdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserTokenredeemdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserTokenredeemdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserTokenredeemdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserTokenredeemdetailResponse setRedeemDetail(java.util.List<TokenOperationDetail> redeemDetail) {
        this.redeemDetail = redeemDetail;
        return this;
    }
    public java.util.List<TokenOperationDetail> getRedeemDetail() {
        return this.redeemDetail;
    }

}
