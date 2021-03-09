// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BatchcreateResourceIngressrulesResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 安全组入方向规则是否添加成功
    @NameInMap("success")
    public Boolean success;

    public static BatchcreateResourceIngressrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateResourceIngressrulesResponse self = new BatchcreateResourceIngressrulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateResourceIngressrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateResourceIngressrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateResourceIngressrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateResourceIngressrulesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
