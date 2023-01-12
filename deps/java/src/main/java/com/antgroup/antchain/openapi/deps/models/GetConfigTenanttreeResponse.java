// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigTenanttreeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前租户下的所有 workspaceGroup 列表
    @NameInMap("data")
    public java.util.List<WorkspaceGroupView> data;

    public static GetConfigTenanttreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigTenanttreeResponse self = new GetConfigTenanttreeResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigTenanttreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetConfigTenanttreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetConfigTenanttreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetConfigTenanttreeResponse setData(java.util.List<WorkspaceGroupView> data) {
        this.data = data;
        return this;
    }
    public java.util.List<WorkspaceGroupView> getData() {
        return this.data;
    }

}
