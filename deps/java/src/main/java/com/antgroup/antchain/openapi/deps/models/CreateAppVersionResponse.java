// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布包任务id，可用于查询应用发布包生成状态
    @NameInMap("build_id")
    @Validation(required = true)
    public String buildId;

    public static CreateAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionResponse self = new CreateAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAppVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAppVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAppVersionResponse setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

}
