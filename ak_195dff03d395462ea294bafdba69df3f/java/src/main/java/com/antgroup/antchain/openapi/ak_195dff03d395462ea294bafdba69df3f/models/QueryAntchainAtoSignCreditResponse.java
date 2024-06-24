// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoSignCreditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内容信息
    @NameInMap("content_info")
    public String contentInfo;

    public static QueryAntchainAtoSignCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoSignCreditResponse self = new QueryAntchainAtoSignCreditResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoSignCreditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoSignCreditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoSignCreditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoSignCreditResponse setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
        return this;
    }
    public String getContentInfo() {
        return this.contentInfo;
    }

}
