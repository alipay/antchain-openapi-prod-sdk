// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class UploadAntcloudAdomAppmarketOcrfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件上传url
    @NameInMap("upload_url")
    public String uploadUrl;

    // 文件key
    @NameInMap("file_key")
    public String fileKey;

    public static UploadAntcloudAdomAppmarketOcrfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAntcloudAdomAppmarketOcrfileResponse self = new UploadAntcloudAdomAppmarketOcrfileResponse();
        return TeaModel.build(map, self);
    }

    public UploadAntcloudAdomAppmarketOcrfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadAntcloudAdomAppmarketOcrfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadAntcloudAdomAppmarketOcrfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadAntcloudAdomAppmarketOcrfileResponse setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public UploadAntcloudAdomAppmarketOcrfileResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
