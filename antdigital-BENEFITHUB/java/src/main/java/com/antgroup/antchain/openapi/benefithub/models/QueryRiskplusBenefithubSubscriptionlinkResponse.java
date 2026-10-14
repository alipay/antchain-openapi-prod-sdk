// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benefithub.models;

import com.aliyun.tea.*;

public class QueryRiskplusBenefithubSubscriptionlinkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // h5跳转链接
    @NameInMap("h5_url")
    public String h5Url;

    public static QueryRiskplusBenefithubSubscriptionlinkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusBenefithubSubscriptionlinkResponse self = new QueryRiskplusBenefithubSubscriptionlinkResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusBenefithubSubscriptionlinkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskplusBenefithubSubscriptionlinkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskplusBenefithubSubscriptionlinkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskplusBenefithubSubscriptionlinkResponse setH5Url(String h5Url) {
        this.h5Url = h5Url;
        return this;
    }
    public String getH5Url() {
        return this.h5Url;
    }

}
