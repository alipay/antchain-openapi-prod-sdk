// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaApptagResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_tags
    @NameInMap("app_tags")
    public java.util.List<TraasAppTagDto> appTags;

    public static BatchcreateTraasmetaApptagResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaApptagResponse self = new BatchcreateTraasmetaApptagResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaApptagResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateTraasmetaApptagResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateTraasmetaApptagResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateTraasmetaApptagResponse setAppTags(java.util.List<TraasAppTagDto> appTags) {
        this.appTags = appTags;
        return this;
    }
    public java.util.List<TraasAppTagDto> getAppTags() {
        return this.appTags;
    }

}
