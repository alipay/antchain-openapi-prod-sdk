// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDigitalregistrationApplyformsealurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数登申请表签署url
    @NameInMap("seal_url")
    public String sealUrl;

    public static QueryDigitalregistrationApplyformsealurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalregistrationApplyformsealurlResponse self = new QueryDigitalregistrationApplyformsealurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalregistrationApplyformsealurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalregistrationApplyformsealurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalregistrationApplyformsealurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalregistrationApplyformsealurlResponse setSealUrl(String sealUrl) {
        this.sealUrl = sealUrl;
        return this;
    }
    public String getSealUrl() {
        return this.sealUrl;
    }

}
