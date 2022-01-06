// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListUndisplayComponentsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 不展示的组件
    @NameInMap("configs")
    public java.util.List<String> configs;

    public static ListUndisplayComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUndisplayComponentsResponse self = new ListUndisplayComponentsResponse();
        return TeaModel.build(map, self);
    }

    public ListUndisplayComponentsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUndisplayComponentsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUndisplayComponentsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUndisplayComponentsResponse setConfigs(java.util.List<String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

}
