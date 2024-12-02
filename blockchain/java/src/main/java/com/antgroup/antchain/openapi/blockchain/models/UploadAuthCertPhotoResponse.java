// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UploadAuthCertPhotoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // oss文件上传策略
    @NameInMap("presigned_url_policy")
    public PresignedUrlPolicy presignedUrlPolicy;

    public static UploadAuthCertPhotoResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAuthCertPhotoResponse self = new UploadAuthCertPhotoResponse();
        return TeaModel.build(map, self);
    }

    public UploadAuthCertPhotoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadAuthCertPhotoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadAuthCertPhotoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadAuthCertPhotoResponse setPresignedUrlPolicy(PresignedUrlPolicy presignedUrlPolicy) {
        this.presignedUrlPolicy = presignedUrlPolicy;
        return this;
    }
    public PresignedUrlPolicy getPresignedUrlPolicy() {
        return this.presignedUrlPolicy;
    }

}
