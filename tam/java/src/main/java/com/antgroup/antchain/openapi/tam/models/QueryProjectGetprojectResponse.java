// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryProjectGetprojectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("project_list")
    public ProjectBase projectList;

    //  
    @NameInMap("success")
    public Boolean success;

    public static QueryProjectGetprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectGetprojectResponse self = new QueryProjectGetprojectResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectGetprojectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProjectGetprojectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProjectGetprojectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProjectGetprojectResponse setProjectList(ProjectBase projectList) {
        this.projectList = projectList;
        return this;
    }
    public ProjectBase getProjectList() {
        return this.projectList;
    }

    public QueryProjectGetprojectResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
