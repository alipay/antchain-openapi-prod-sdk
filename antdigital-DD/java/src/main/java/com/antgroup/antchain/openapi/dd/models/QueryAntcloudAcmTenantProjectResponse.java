// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudAcmTenantProjectResponse extends TeaModel {
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
    @NameInMap("project_list")
    public java.util.List<Project> projectList;

    public static QueryAntcloudAcmTenantProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudAcmTenantProjectResponse self = new QueryAntcloudAcmTenantProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudAcmTenantProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudAcmTenantProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudAcmTenantProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudAcmTenantProjectResponse setProjectList(java.util.List<Project> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<Project> getProjectList() {
        return this.projectList;
    }

}
