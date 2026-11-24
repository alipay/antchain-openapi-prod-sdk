// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ConfirmIotagentFilesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件ID
    @NameInMap("file_id")
    public String fileId;

    // 文件名
    @NameInMap("file_name")
    public String fileName;

    // 媒体类型
    @NameInMap("media_type")
    public String mediaType;

    // 字节数
    @NameInMap("size_bytes")
    public String sizeBytes;

    // 确认时间
    @NameInMap("created_at")
    public String createdAt;

    public static ConfirmIotagentFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIotagentFilesResponse self = new ConfirmIotagentFilesResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmIotagentFilesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmIotagentFilesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmIotagentFilesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmIotagentFilesResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ConfirmIotagentFilesResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ConfirmIotagentFilesResponse setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ConfirmIotagentFilesResponse setSizeBytes(String sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public String getSizeBytes() {
        return this.sizeBytes;
    }

    public ConfirmIotagentFilesResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

}
