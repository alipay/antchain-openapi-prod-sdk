// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateReleaseplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布单的唯一标识，可以认为是timeSeriesId
    @NameInMap("plan_unique_id")
    public String planUniqueId;

    public static CreateReleaseplanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReleaseplanResponse self = new CreateReleaseplanResponse();
        return TeaModel.build(map, self);
    }

    public CreateReleaseplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateReleaseplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateReleaseplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateReleaseplanResponse setPlanUniqueId(String planUniqueId) {
        this.planUniqueId = planUniqueId;
        return this;
    }
    public String getPlanUniqueId() {
        return this.planUniqueId;
    }

}
