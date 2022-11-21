// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class PushLicenceMeterdataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否推送成功
    @NameInMap("success")
    public Boolean success;

    // 是否需要重发，success为false情况下才有意义
    @NameInMap("need_retry")
    public Boolean needRetry;

    public static PushLicenceMeterdataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushLicenceMeterdataResponse self = new PushLicenceMeterdataResponse();
        return TeaModel.build(map, self);
    }

    public PushLicenceMeterdataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushLicenceMeterdataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushLicenceMeterdataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushLicenceMeterdataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushLicenceMeterdataResponse setNeedRetry(Boolean needRetry) {
        this.needRetry = needRetry;
        return this;
    }
    public Boolean getNeedRetry() {
        return this.needRetry;
    }

}
