// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class GetFileDownloadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建文件使用的apiCode
    @NameInMap("api_code")
    public String apiCode;

    // 文件下载地址
    @NameInMap("download_url")
    public String downloadUrl;

    // 下载超时时间
    @NameInMap("expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expiredTime;

    // 文件标签
    @NameInMap("file_label")
    public String fileLabel;

    // 请求上传时的自定义元数据
    @NameInMap("file_metadata")
    public String fileMetadata;

    // 文件名
    @NameInMap("file_name")
    public String fileName;

    // 文件路径
    @NameInMap("file_path")
    public String filePath;

    // 文件大小
    @NameInMap("file_size")
    public Long fileSize;

    // 上传的调用者信息
    @NameInMap("upload_invoker")
    public XInvokerInfo uploadInvoker;

    public static GetFileDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileDownloadResponse self = new GetFileDownloadResponse();
        return TeaModel.build(map, self);
    }

    public GetFileDownloadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFileDownloadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFileDownloadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFileDownloadResponse setApiCode(String apiCode) {
        this.apiCode = apiCode;
        return this;
    }
    public String getApiCode() {
        return this.apiCode;
    }

    public GetFileDownloadResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetFileDownloadResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public GetFileDownloadResponse setFileLabel(String fileLabel) {
        this.fileLabel = fileLabel;
        return this;
    }
    public String getFileLabel() {
        return this.fileLabel;
    }

    public GetFileDownloadResponse setFileMetadata(String fileMetadata) {
        this.fileMetadata = fileMetadata;
        return this;
    }
    public String getFileMetadata() {
        return this.fileMetadata;
    }

    public GetFileDownloadResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetFileDownloadResponse setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public GetFileDownloadResponse setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public GetFileDownloadResponse setUploadInvoker(XInvokerInfo uploadInvoker) {
        this.uploadInvoker = uploadInvoker;
        return this;
    }
    public XInvokerInfo getUploadInvoker() {
        return this.uploadInvoker;
    }

}
