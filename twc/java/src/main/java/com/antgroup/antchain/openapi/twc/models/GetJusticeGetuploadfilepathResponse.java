// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetJusticeGetuploadfilepathResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // OSS上传链接
    @NameInMap("upload_file_url")
    public String uploadFileUrl;

    // 文件key
    @NameInMap("file_key")
    public String fileKey;

    // 业务码 0表示成功
    @NameInMap("code")
    public Long code;

    // 业务码描述
    @NameInMap("message")
    public String message;

    public static GetJusticeGetuploadfilepathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJusticeGetuploadfilepathResponse self = new GetJusticeGetuploadfilepathResponse();
        return TeaModel.build(map, self);
    }

    public GetJusticeGetuploadfilepathResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetJusticeGetuploadfilepathResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetJusticeGetuploadfilepathResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetJusticeGetuploadfilepathResponse setUploadFileUrl(String uploadFileUrl) {
        this.uploadFileUrl = uploadFileUrl;
        return this;
    }
    public String getUploadFileUrl() {
        return this.uploadFileUrl;
    }

    public GetJusticeGetuploadfilepathResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public GetJusticeGetuploadfilepathResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetJusticeGetuploadfilepathResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
