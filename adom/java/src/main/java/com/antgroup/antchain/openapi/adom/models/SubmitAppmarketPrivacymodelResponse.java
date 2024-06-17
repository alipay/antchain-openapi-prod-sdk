// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class SubmitAppmarketPrivacymodelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 异步提交执行记录id
    @NameInMap("record_id")
    public String recordId;

    public static SubmitAppmarketPrivacymodelResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAppmarketPrivacymodelResponse self = new SubmitAppmarketPrivacymodelResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAppmarketPrivacymodelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAppmarketPrivacymodelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAppmarketPrivacymodelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAppmarketPrivacymodelResponse setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
