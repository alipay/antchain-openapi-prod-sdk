// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class CreateFileUploadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上传有效期
    @NameInMap("expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expiredTime;

    // 32位文件唯一id
    @NameInMap("file_id")
    public String fileId;

    // 放入http请求头里
    @NameInMap("upload_headers")
    public java.util.List<XNameValuePair> uploadHeaders;

    // 文件上传地址
    @NameInMap("upload_url")
    public String uploadUrl;

    public static CreateFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileUploadResponse self = new CreateFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileUploadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateFileUploadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateFileUploadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateFileUploadResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public CreateFileUploadResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateFileUploadResponse setUploadHeaders(java.util.List<XNameValuePair> uploadHeaders) {
        this.uploadHeaders = uploadHeaders;
        return this;
    }
    public java.util.List<XNameValuePair> getUploadHeaders() {
        return this.uploadHeaders;
    }

    public CreateFileUploadResponse setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
