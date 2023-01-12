// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListAppbaselineSidecarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用基线列表
    @NameInMap("appbaselines")
    public java.util.List<AppBaselineSidecarConfig> appbaselines;

    public static ListAppbaselineSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppbaselineSidecarResponse self = new ListAppbaselineSidecarResponse();
        return TeaModel.build(map, self);
    }

    public ListAppbaselineSidecarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppbaselineSidecarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppbaselineSidecarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppbaselineSidecarResponse setAppbaselines(java.util.List<AppBaselineSidecarConfig> appbaselines) {
        this.appbaselines = appbaselines;
        return this;
    }
    public java.util.List<AppBaselineSidecarConfig> getAppbaselines() {
        return this.appbaselines;
    }

}
