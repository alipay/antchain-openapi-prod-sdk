// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciPreviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 作品预览处理状态
    @NameInMap("file_preview_status")
    public String filePreviewStatus;

    // 作品片段预览状态
    @NameInMap("file_part_preview_status")
    public String filePartPreviewStatus;

    // 作品预览处理结果
    @NameInMap("file_preview_url")
    public String filePreviewUrl;

    // 作品预览截取片段结果
    @NameInMap("file_part_preview_url")
    public String filePartPreviewUrl;

    // 作品名称
    @NameInMap("work_name")
    public String workName;

    // dci码
    @NameInMap("dci_code")
    public String dciCode;

    // 文件类型
    @NameInMap("file_type")
    public String fileType;

    // 当前查询时间
    @NameInMap("query_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String queryTime;

    public static QueryDciPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDciPreviewResponse self = new QueryDciPreviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryDciPreviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDciPreviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDciPreviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDciPreviewResponse setFilePreviewStatus(String filePreviewStatus) {
        this.filePreviewStatus = filePreviewStatus;
        return this;
    }
    public String getFilePreviewStatus() {
        return this.filePreviewStatus;
    }

    public QueryDciPreviewResponse setFilePartPreviewStatus(String filePartPreviewStatus) {
        this.filePartPreviewStatus = filePartPreviewStatus;
        return this;
    }
    public String getFilePartPreviewStatus() {
        return this.filePartPreviewStatus;
    }

    public QueryDciPreviewResponse setFilePreviewUrl(String filePreviewUrl) {
        this.filePreviewUrl = filePreviewUrl;
        return this;
    }
    public String getFilePreviewUrl() {
        return this.filePreviewUrl;
    }

    public QueryDciPreviewResponse setFilePartPreviewUrl(String filePartPreviewUrl) {
        this.filePartPreviewUrl = filePartPreviewUrl;
        return this;
    }
    public String getFilePartPreviewUrl() {
        return this.filePartPreviewUrl;
    }

    public QueryDciPreviewResponse setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
    }

    public QueryDciPreviewResponse setDciCode(String dciCode) {
        this.dciCode = dciCode;
        return this;
    }
    public String getDciCode() {
        return this.dciCode;
    }

    public QueryDciPreviewResponse setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public QueryDciPreviewResponse setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

}
