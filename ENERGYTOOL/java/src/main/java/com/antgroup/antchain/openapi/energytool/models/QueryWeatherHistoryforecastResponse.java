// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherHistoryforecastResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原提交请求 ID，与入参一致。
    @NameInMap("request_id")
    public String requestId;

    // 结果是否就绪。准备中的 INIT/RUNNING 为正常响应 false，文件字段为空；完成后为 true，并返回下载信息。
    @NameInMap("data_ready")
    public Boolean dataReady;

    // 仅就绪时返回的临时签名 ZIP 下载地址，受 url_expires_at 和固定 result_expires_at 约束；请在有效期内下载。
    @NameInMap("download_url")
    public String downloadUrl;

    // 当前签名下载链接的失效时间，对应 Java Date；不晚于 result_expires_at。
    @NameInMap("url_expires_at")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String urlExpiresAt;

    // 本次结果的固定失效时间，从发布成功起 12 小时。轮询或重新签名不延长；到期后需使用新 request_id 重新提交。
    @NameInMap("result_expires_at")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String resultExpiresAt;

    // 最终 ZIP 文件名称，仅就绪时返回；ZIP 内为按点位和日期窗口分组的 CSV。
    @NameInMap("file_name")
    public String fileName;

    // 最终 ZIP 文件大小，单位字节，对应 Java Long；未就绪时为空。
    @NameInMap("file_size")
    public Long fileSize;

    // 导出有效数据记录数，对应 Java Long；全空导出可为 0，不以受理成功推断存在有效记录。
    @NameInMap("record_count")
    public Long recordCount;

    // 导出数据是否完整，对应 Java Boolean；false 表示存在缺失数据，需结合 CSV 内容判断，未就绪时为空。
    @NameInMap("data_complete")
    public Boolean dataComplete;

    public static QueryWeatherHistoryforecastResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherHistoryforecastResponse self = new QueryWeatherHistoryforecastResponse();
        return TeaModel.build(map, self);
    }

    public QueryWeatherHistoryforecastResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWeatherHistoryforecastResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWeatherHistoryforecastResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWeatherHistoryforecastResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherHistoryforecastResponse setDataReady(Boolean dataReady) {
        this.dataReady = dataReady;
        return this;
    }
    public Boolean getDataReady() {
        return this.dataReady;
    }

    public QueryWeatherHistoryforecastResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public QueryWeatherHistoryforecastResponse setUrlExpiresAt(String urlExpiresAt) {
        this.urlExpiresAt = urlExpiresAt;
        return this;
    }
    public String getUrlExpiresAt() {
        return this.urlExpiresAt;
    }

    public QueryWeatherHistoryforecastResponse setResultExpiresAt(String resultExpiresAt) {
        this.resultExpiresAt = resultExpiresAt;
        return this;
    }
    public String getResultExpiresAt() {
        return this.resultExpiresAt;
    }

    public QueryWeatherHistoryforecastResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryWeatherHistoryforecastResponse setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public QueryWeatherHistoryforecastResponse setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Long getRecordCount() {
        return this.recordCount;
    }

    public QueryWeatherHistoryforecastResponse setDataComplete(Boolean dataComplete) {
        this.dataComplete = dataComplete;
        return this;
    }
    public Boolean getDataComplete() {
        return this.dataComplete;
    }

}
