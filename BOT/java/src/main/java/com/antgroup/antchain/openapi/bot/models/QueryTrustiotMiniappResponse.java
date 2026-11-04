// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTrustiotMiniappResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 一次性跳转链接。链接整体 24 小时有效（见 valid_to），令牌一次性消费、用后即失效
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 链接生效时间，毫秒级时间戳
    @NameInMap("valid_from")
    public Long validFrom;

    // 链接过期时间，毫秒级时间戳，valid_from 起 24 小时。过期后链接不可用
    @NameInMap("valid_to")
    public Long validTo;

    public static QueryTrustiotMiniappResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrustiotMiniappResponse self = new QueryTrustiotMiniappResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrustiotMiniappResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTrustiotMiniappResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTrustiotMiniappResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTrustiotMiniappResponse setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public QueryTrustiotMiniappResponse setValidFrom(Long validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public Long getValidFrom() {
        return this.validFrom;
    }

    public QueryTrustiotMiniappResponse setValidTo(Long validTo) {
        this.validTo = validTo;
        return this;
    }
    public Long getValidTo() {
        return this.validTo;
    }

}
