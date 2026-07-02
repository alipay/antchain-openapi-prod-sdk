// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UploadInnerFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 临时上传地址
    @NameInMap("upload_url")
    public String uploadUrl;

    // 文件key
    @NameInMap("file_key")
    public String fileKey;

    public static UploadInnerFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadInnerFileResponse self = new UploadInnerFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadInnerFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadInnerFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadInnerFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadInnerFileResponse setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public UploadInnerFileResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
