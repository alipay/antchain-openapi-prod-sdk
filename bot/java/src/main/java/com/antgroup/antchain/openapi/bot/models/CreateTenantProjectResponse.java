// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateTenantProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回租户唯一的项目id，可以用以管理不同业务。
    @NameInMap("project_uid")
    public String projectUid;

    // 交易唯一ID
    @NameInMap("nonce")
    public String nonce;

    public static CreateTenantProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantProjectResponse self = new CreateTenantProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateTenantProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateTenantProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateTenantProjectResponse setProjectUid(String projectUid) {
        this.projectUid = projectUid;
        return this;
    }
    public String getProjectUid() {
        return this.projectUid;
    }

    public CreateTenantProjectResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
