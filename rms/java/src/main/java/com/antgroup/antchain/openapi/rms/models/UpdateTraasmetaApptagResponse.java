// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraasmetaApptagResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_tag
    @NameInMap("app_tag")
    public TraasAppTagDto appTag;

    public static UpdateTraasmetaApptagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraasmetaApptagResponse self = new UpdateTraasmetaApptagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTraasmetaApptagResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateTraasmetaApptagResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateTraasmetaApptagResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateTraasmetaApptagResponse setAppTag(TraasAppTagDto appTag) {
        this.appTag = appTag;
        return this;
    }
    public TraasAppTagDto getAppTag() {
        return this.appTag;
    }

}
