// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class UpdateBaasDidServicesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 更新后的did doc
    @NameInMap("did_doc")
    public String didDoc;

    public static UpdateBaasDidServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasDidServicesResponse self = new UpdateBaasDidServicesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaasDidServicesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBaasDidServicesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBaasDidServicesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBaasDidServicesResponse setDidDoc(String didDoc) {
        this.didDoc = didDoc;
        return this;
    }
    public String getDidDoc() {
        return this.didDoc;
    }

}
