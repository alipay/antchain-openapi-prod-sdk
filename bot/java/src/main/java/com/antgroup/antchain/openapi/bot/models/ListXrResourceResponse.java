// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListXrResourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 资源列表
    @NameInMap("resource_list")
    public java.util.List<CodeListView> resourceList;

    public static ListXrResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListXrResourceResponse self = new ListXrResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListXrResourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListXrResourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListXrResourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListXrResourceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListXrResourceResponse setResourceList(java.util.List<CodeListView> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<CodeListView> getResourceList() {
        return this.resourceList;
    }

}
