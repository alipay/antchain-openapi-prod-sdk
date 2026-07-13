// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryUserProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目
    @NameInMap("project_list")
    public java.util.List<Project> projectList;

    public static QueryUserProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserProjectResponse self = new QueryUserProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserProjectResponse setProjectList(java.util.List<Project> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<Project> getProjectList() {
        return this.projectList;
    }

}
