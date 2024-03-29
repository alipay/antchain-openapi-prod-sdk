// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class DetailProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目结构体
    @NameInMap("project_vo")
    public ProjectVO projectVo;

    public static DetailProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailProjectResponse self = new DetailProjectResponse();
        return TeaModel.build(map, self);
    }

    public DetailProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailProjectResponse setProjectVo(ProjectVO projectVo) {
        this.projectVo = projectVo;
        return this;
    }
    public ProjectVO getProjectVo() {
        return this.projectVo;
    }

}
