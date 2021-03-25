// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class PullConfigTemplateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用参数模板
    @NameInMap("data")
    public AppConfigTemplate data;

    public static PullConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PullConfigTemplateResponse self = new PullConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PullConfigTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullConfigTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullConfigTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullConfigTemplateResponse setData(AppConfigTemplate data) {
        this.data = data;
        return this;
    }
    public AppConfigTemplate getData() {
        return this.data;
    }

}
