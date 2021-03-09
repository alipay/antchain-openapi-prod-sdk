// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListSlsProjectResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 日志项目数组
    @NameInMap("data")
    public java.util.List<SLSProject> data;

    public static ListSlsProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlsProjectResponse self = new ListSlsProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListSlsProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSlsProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSlsProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSlsProjectResponse setData(java.util.List<SLSProject> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SLSProject> getData() {
        return this.data;
    }

}
