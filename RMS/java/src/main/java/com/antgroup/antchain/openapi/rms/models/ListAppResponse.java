// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListAppResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果：应用列表
    @NameInMap("result")
    public java.util.List<AppDO> result;

    public static ListAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppResponse self = new ListAppResponse();
        return TeaModel.build(map, self);
    }

    public ListAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppResponse setResult(java.util.List<AppDO> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AppDO> getResult() {
        return this.result;
    }

}
