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

    // 仅数据就绪时返回，为当前下载链接的实际截止时间。新结果从发布完成起固定1小时有效，重复查询或重新签名不延长结果有效期，链接可能因凭证期限而提前失效。
    @NameInMap("url_expires_at")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String urlExpiresAt;

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

}
