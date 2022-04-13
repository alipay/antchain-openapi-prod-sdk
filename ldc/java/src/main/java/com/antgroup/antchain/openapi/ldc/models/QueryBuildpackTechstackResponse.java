// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryBuildpackTechstackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前租户内可见的技术栈分类：包括公共可见以及租户自定义分类
    @NameInMap("list")
    public java.util.List<TechStack> list;

    public static QueryBuildpackTechstackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackTechstackResponse self = new QueryBuildpackTechstackResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackTechstackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackTechstackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackTechstackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackTechstackResponse setList(java.util.List<TechStack> list) {
        this.list = list;
        return this;
    }
    public java.util.List<TechStack> getList() {
        return this.list;
    }

}
