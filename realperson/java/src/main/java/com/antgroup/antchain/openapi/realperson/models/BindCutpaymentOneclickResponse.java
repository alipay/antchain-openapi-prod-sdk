// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCutpaymentOneclickResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跳转银行页面地址
    @NameInMap("url")
    public String url;

    // 渠道 ID
    @NameInMap("channel_id")
    public String channelId;

    // 前端请求银行页面的请求方法
    @NameInMap("query_method")
    public String queryMethod;

    // 前端请求银行页面的请求参数key和vaule
    @NameInMap("query_value")
    public String queryValue;

    public static BindCutpaymentOneclickResponse build(java.util.Map<String, ?> map) throws Exception {
        BindCutpaymentOneclickResponse self = new BindCutpaymentOneclickResponse();
        return TeaModel.build(map, self);
    }

    public BindCutpaymentOneclickResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindCutpaymentOneclickResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindCutpaymentOneclickResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindCutpaymentOneclickResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public BindCutpaymentOneclickResponse setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public BindCutpaymentOneclickResponse setQueryMethod(String queryMethod) {
        this.queryMethod = queryMethod;
        return this;
    }
    public String getQueryMethod() {
        return this.queryMethod;
    }

    public BindCutpaymentOneclickResponse setQueryValue(String queryValue) {
        this.queryValue = queryValue;
        return this;
    }
    public String getQueryValue() {
        return this.queryValue;
    }

}
