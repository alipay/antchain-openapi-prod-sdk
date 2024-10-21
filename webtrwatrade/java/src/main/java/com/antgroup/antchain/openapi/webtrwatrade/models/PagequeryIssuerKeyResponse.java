// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class PagequeryIssuerKeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 密钥分页列表
    @NameInMap("data")
    public KeyPageData data;

    public static PagequeryIssuerKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIssuerKeyResponse self = new PagequeryIssuerKeyResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIssuerKeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIssuerKeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIssuerKeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIssuerKeyResponse setData(KeyPageData data) {
        this.data = data;
        return this;
    }
    public KeyPageData getData() {
        return this.data;
    }

}
