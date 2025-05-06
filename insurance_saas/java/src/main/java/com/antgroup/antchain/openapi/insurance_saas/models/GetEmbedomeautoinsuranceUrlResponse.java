// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetEmbedomeautoinsuranceUrlResponse extends TeaModel {
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

    public static GetEmbedomeautoinsuranceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmbedomeautoinsuranceUrlResponse self = new GetEmbedomeautoinsuranceUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetEmbedomeautoinsuranceUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetEmbedomeautoinsuranceUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetEmbedomeautoinsuranceUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetEmbedomeautoinsuranceUrlResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetEmbedomeautoinsuranceUrlResponse setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

}
