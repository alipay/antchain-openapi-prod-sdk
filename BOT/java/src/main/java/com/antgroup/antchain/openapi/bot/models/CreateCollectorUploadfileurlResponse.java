// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateCollectorUploadfileurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可以上传文件的预签名URL
    @NameInMap("upload_file_url")
    public String uploadFileUrl;

    // 上传任务唯一ID，后续流程中会用到
    @NameInMap("upload_id")
    public String uploadId;

    public static CreateCollectorUploadfileurlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectorUploadfileurlResponse self = new CreateCollectorUploadfileurlResponse();
        return TeaModel.build(map, self);
    }

    public CreateCollectorUploadfileurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateCollectorUploadfileurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateCollectorUploadfileurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateCollectorUploadfileurlResponse setUploadFileUrl(String uploadFileUrl) {
        this.uploadFileUrl = uploadFileUrl;
        return this;
    }
    public String getUploadFileUrl() {
        return this.uploadFileUrl;
    }

    public CreateCollectorUploadfileurlResponse setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
