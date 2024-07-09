// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_66d0b62c20644717870b45e5087b8007.models;

import com.aliyun.tea.*;

public class QueryAntcloudBxptnewDatapromotionDecisionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户ID
    @NameInMap("uid")
    public String uid;

    // 营销状态
    @NameInMap("promotion_status")
    public String promotionStatus;

    public static QueryAntcloudBxptnewDatapromotionDecisionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudBxptnewDatapromotionDecisionResponse self = new QueryAntcloudBxptnewDatapromotionDecisionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudBxptnewDatapromotionDecisionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudBxptnewDatapromotionDecisionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudBxptnewDatapromotionDecisionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudBxptnewDatapromotionDecisionResponse setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public QueryAntcloudBxptnewDatapromotionDecisionResponse setPromotionStatus(String promotionStatus) {
        this.promotionStatus = promotionStatus;
        return this;
    }
    public String getPromotionStatus() {
        return this.promotionStatus;
    }

}
