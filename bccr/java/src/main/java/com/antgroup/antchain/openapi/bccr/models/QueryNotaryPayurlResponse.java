// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryPayurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付二维码链接
    @NameInMap("pay_url")
    public String payUrl;

    // 支付二维码链接到期时间
    @NameInMap("pay_url_expire_time")
    public Long payUrlExpireTime;

    public static QueryNotaryPayurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryPayurlResponse self = new QueryNotaryPayurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryNotaryPayurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNotaryPayurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNotaryPayurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNotaryPayurlResponse setPayUrl(String payUrl) {
        this.payUrl = payUrl;
        return this;
    }
    public String getPayUrl() {
        return this.payUrl;
    }

    public QueryNotaryPayurlResponse setPayUrlExpireTime(Long payUrlExpireTime) {
        this.payUrlExpireTime = payUrlExpireTime;
        return this;
    }
    public Long getPayUrlExpireTime() {
        return this.payUrlExpireTime;
    }

}
