// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListLcaprojectTraceprojectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询LCA项目列表
    @NameInMap("list")
    public java.util.List<LcaProjectTrace> list;

    public static ListLcaprojectTraceprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLcaprojectTraceprojectResponse self = new ListLcaprojectTraceprojectResponse();
        return TeaModel.build(map, self);
    }

    public ListLcaprojectTraceprojectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLcaprojectTraceprojectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLcaprojectTraceprojectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLcaprojectTraceprojectResponse setList(java.util.List<LcaProjectTrace> list) {
        this.list = list;
        return this;
    }
    public java.util.List<LcaProjectTrace> getList() {
        return this.list;
    }

}
