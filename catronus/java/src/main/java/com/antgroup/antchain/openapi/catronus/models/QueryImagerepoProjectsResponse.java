// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryImagerepoProjectsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目列表
    @NameInMap("projects")
    public java.util.List<RepoProject> projects;

    public static QueryImagerepoProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImagerepoProjectsResponse self = new QueryImagerepoProjectsResponse();
        return TeaModel.build(map, self);
    }

    public QueryImagerepoProjectsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImagerepoProjectsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImagerepoProjectsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImagerepoProjectsResponse setProjects(java.util.List<RepoProject> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<RepoProject> getProjects() {
        return this.projects;
    }

}
