// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetDomesticTrademarklogoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商标logo下载地址
    @NameInMap("tm_logo_url")
    public String tmLogoUrl;

    public static GetDomesticTrademarklogoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomesticTrademarklogoResponse self = new GetDomesticTrademarklogoResponse();
        return TeaModel.build(map, self);
    }

    public GetDomesticTrademarklogoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDomesticTrademarklogoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDomesticTrademarklogoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDomesticTrademarklogoResponse setTmLogoUrl(String tmLogoUrl) {
        this.tmLogoUrl = tmLogoUrl;
        return this;
    }
    public String getTmLogoUrl() {
        return this.tmLogoUrl;
    }

}
