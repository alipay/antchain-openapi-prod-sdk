// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseAssetagentregisterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务层错误码
    @NameInMap("biz_error_code")
    public String bizErrorCode;

    // 错误信息描述
    @NameInMap("biz_error_msg")
    public String bizErrorMsg;

    // 代理关系链上存证哈希
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateLeaseAssetagentregisterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseAssetagentregisterResponse self = new CreateLeaseAssetagentregisterResponse();
        return TeaModel.build(map, self);
    }

    public CreateLeaseAssetagentregisterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateLeaseAssetagentregisterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLeaseAssetagentregisterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateLeaseAssetagentregisterResponse setBizErrorCode(String bizErrorCode) {
        this.bizErrorCode = bizErrorCode;
        return this;
    }
    public String getBizErrorCode() {
        return this.bizErrorCode;
    }

    public CreateLeaseAssetagentregisterResponse setBizErrorMsg(String bizErrorMsg) {
        this.bizErrorMsg = bizErrorMsg;
        return this;
    }
    public String getBizErrorMsg() {
        return this.bizErrorMsg;
    }

    public CreateLeaseAssetagentregisterResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
