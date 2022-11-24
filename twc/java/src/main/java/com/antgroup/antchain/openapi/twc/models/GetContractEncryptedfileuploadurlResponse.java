// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractEncryptedfileuploadurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上传的原始文件记录id
    @NameInMap("file_log_id")
    public String fileLogId;

    // 文件上传链接
    @NameInMap("file_upload_url")
    public String fileUploadUrl;

    // 上传链接过期时间. yyyy-MM-dd HH:mm:ss
    @NameInMap("expired_time")
    public String expiredTime;

    public static GetContractEncryptedfileuploadurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContractEncryptedfileuploadurlResponse self = new GetContractEncryptedfileuploadurlResponse();
        return TeaModel.build(map, self);
    }

    public GetContractEncryptedfileuploadurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetContractEncryptedfileuploadurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetContractEncryptedfileuploadurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetContractEncryptedfileuploadurlResponse setFileLogId(String fileLogId) {
        this.fileLogId = fileLogId;
        return this;
    }
    public String getFileLogId() {
        return this.fileLogId;
    }

    public GetContractEncryptedfileuploadurlResponse setFileUploadUrl(String fileUploadUrl) {
        this.fileUploadUrl = fileUploadUrl;
        return this;
    }
    public String getFileUploadUrl() {
        return this.fileUploadUrl;
    }

    public GetContractEncryptedfileuploadurlResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

}
