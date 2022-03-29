// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryTraasmetaApptagResponse extends TeaModel {
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

    public static BatchqueryTraasmetaApptagResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTraasmetaApptagResponse self = new BatchqueryTraasmetaApptagResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryTraasmetaApptagResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryTraasmetaApptagResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryTraasmetaApptagResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryTraasmetaApptagResponse setAppTags(java.util.List<TraasAppTagDto> appTags) {
        this.appTags = appTags;
        return this;
    }
    public java.util.List<TraasAppTagDto> getAppTags() {
        return this.appTags;
    }

}
