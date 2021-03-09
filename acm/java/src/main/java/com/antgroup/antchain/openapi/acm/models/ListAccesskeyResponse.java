// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class ListAccesskeyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // AccessKey列表
    @NameInMap("access_keys")
    @Validation(required = true)
    public java.util.List<AccessKey> accessKeys;

    public static ListAccesskeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccesskeyResponse self = new ListAccesskeyResponse();
        return TeaModel.build(map, self);
    }

    public ListAccesskeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAccesskeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAccesskeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAccesskeyResponse setAccessKeys(java.util.List<AccessKey> accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }
    public java.util.List<AccessKey> getAccessKeys() {
        return this.accessKeys;
    }

}
