// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBenefithubBlacklistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // true-命中黑名单,false-非命中黑名单
    @NameInMap("hit")
    public Boolean hit;

    // UUID-流量平台用户id维度命中，MOBILE-手机号匹配命中。
    @NameInMap("hit_type")
    public String hitType;

    public static QueryBenefithubBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefithubBlacklistResponse self = new QueryBenefithubBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public QueryBenefithubBlacklistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBenefithubBlacklistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBenefithubBlacklistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBenefithubBlacklistResponse setHit(Boolean hit) {
        this.hit = hit;
        return this;
    }
    public Boolean getHit() {
        return this.hit;
    }

    public QueryBenefithubBlacklistResponse setHitType(String hitType) {
        this.hitType = hitType;
        return this;
    }
    public String getHitType() {
        return this.hitType;
    }

}
