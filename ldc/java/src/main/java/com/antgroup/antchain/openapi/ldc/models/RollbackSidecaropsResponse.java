// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RollbackSidecaropsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 返回被更新的podNumber list
    @NameInMap("updated_pod_numbers")
    public java.util.List<String> updatedPodNumbers;

    public static RollbackSidecaropsResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackSidecaropsResponse self = new RollbackSidecaropsResponse();
        return TeaModel.build(map, self);
    }

    public RollbackSidecaropsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RollbackSidecaropsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RollbackSidecaropsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RollbackSidecaropsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RollbackSidecaropsResponse setUpdatedPodNumbers(java.util.List<String> updatedPodNumbers) {
        this.updatedPodNumbers = updatedPodNumbers;
        return this;
    }
    public java.util.List<String> getUpdatedPodNumbers() {
        return this.updatedPodNumbers;
    }

}
