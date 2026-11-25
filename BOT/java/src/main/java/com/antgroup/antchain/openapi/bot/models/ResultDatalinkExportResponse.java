// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ResultDatalinkExportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // excel oss 地址
    @NameInMap("file_url")
    public String fileUrl;

    // 返回数量列表
    @NameInMap("row_count")
    public Long rowCount;

    // 是否截段
    @NameInMap("truncated")
    public Boolean truncated;

    // 文件大小
    @NameInMap("file_size")
    public Long fileSize;

    // 过期时刻
    @NameInMap("expire_time")
    public Long expireTime;

    // sql 执行耗时 耗秒
    @NameInMap("sql_elapsed_ms")
    public Long sqlElapsedMs;

    // 上传OSS耗时 耗秒
    @NameInMap("upload_elapsed_ms")
    public Long uploadElapsedMs;

    // 运行状态 RUNNING： 运行中，SUCCESS： 成功，FAILED：失败
    @NameInMap("status")
    public String status;

    // 失败错误编码
    @NameInMap("error_code")
    public String errorCode;

    // 错误原因
    @NameInMap("error_message")
    public String errorMessage;

    public static ResultDatalinkExportResponse build(java.util.Map<String, ?> map) throws Exception {
        ResultDatalinkExportResponse self = new ResultDatalinkExportResponse();
        return TeaModel.build(map, self);
    }

    public ResultDatalinkExportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ResultDatalinkExportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResultDatalinkExportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ResultDatalinkExportResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ResultDatalinkExportResponse setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public ResultDatalinkExportResponse setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

    public ResultDatalinkExportResponse setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public ResultDatalinkExportResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ResultDatalinkExportResponse setSqlElapsedMs(Long sqlElapsedMs) {
        this.sqlElapsedMs = sqlElapsedMs;
        return this;
    }
    public Long getSqlElapsedMs() {
        return this.sqlElapsedMs;
    }

    public ResultDatalinkExportResponse setUploadElapsedMs(Long uploadElapsedMs) {
        this.uploadElapsedMs = uploadElapsedMs;
        return this;
    }
    public Long getUploadElapsedMs() {
        return this.uploadElapsedMs;
    }

    public ResultDatalinkExportResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ResultDatalinkExportResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ResultDatalinkExportResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
