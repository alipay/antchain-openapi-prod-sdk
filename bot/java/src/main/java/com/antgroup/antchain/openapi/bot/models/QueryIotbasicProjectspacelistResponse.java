// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicProjectspacelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口调用结果
    @NameInMap("success")
    public Boolean success;

    // 项目空间信息列表
    @NameInMap("data")
    public java.util.List<ProjectSpaceInfo> data;

    public static QueryIotbasicProjectspacelistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicProjectspacelistResponse self = new QueryIotbasicProjectspacelistResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicProjectspacelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotbasicProjectspacelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotbasicProjectspacelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotbasicProjectspacelistResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIotbasicProjectspacelistResponse setData(java.util.List<ProjectSpaceInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ProjectSpaceInfo> getData() {
        return this.data;
    }

}
