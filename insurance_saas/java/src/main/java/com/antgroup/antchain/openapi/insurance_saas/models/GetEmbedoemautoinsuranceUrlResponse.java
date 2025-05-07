// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetEmbedoemautoinsuranceUrlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // url链接
    @NameInMap("url")
    public String url;

    // 请求流水号
    @NameInMap("request_no")
    public String requestNo;

    public static GetEmbedoemautoinsuranceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmbedoemautoinsuranceUrlResponse self = new GetEmbedoemautoinsuranceUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetEmbedoemautoinsuranceUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetEmbedoemautoinsuranceUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetEmbedoemautoinsuranceUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetEmbedoemautoinsuranceUrlResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetEmbedoemautoinsuranceUrlResponse setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

}
