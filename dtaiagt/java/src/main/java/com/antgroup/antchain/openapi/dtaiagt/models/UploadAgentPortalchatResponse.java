// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class UploadAgentPortalchatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public UploadAttachmentFileResult data;

    public static UploadAgentPortalchatResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentPortalchatResponse self = new UploadAgentPortalchatResponse();
        return TeaModel.build(map, self);
    }

    public UploadAgentPortalchatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadAgentPortalchatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadAgentPortalchatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadAgentPortalchatResponse setData(UploadAttachmentFileResult data) {
        this.data = data;
        return this;
    }
    public UploadAttachmentFileResult getData() {
        return this.data;
    }

}
