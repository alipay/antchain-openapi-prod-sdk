// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerFundmngdatadownloadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否提交成功
    @NameInMap("is_submit_download")
    public Boolean isSubmitDownload;

    // 线上；线下
    @NameInMap("download_type")
    public String downloadType;

    // 下载链接
    @NameInMap("download_url")
    public String downloadUrl;

    // 状态
    // TODO 待处理
    // FINISH 完成
    @NameInMap("status")
    public String status;

    public static SubmitInnerFundmngdatadownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerFundmngdatadownloadResponse self = new SubmitInnerFundmngdatadownloadResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInnerFundmngdatadownloadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitInnerFundmngdatadownloadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitInnerFundmngdatadownloadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitInnerFundmngdatadownloadResponse setIsSubmitDownload(Boolean isSubmitDownload) {
        this.isSubmitDownload = isSubmitDownload;
        return this;
    }
    public Boolean getIsSubmitDownload() {
        return this.isSubmitDownload;
    }

    public SubmitInnerFundmngdatadownloadResponse setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public SubmitInnerFundmngdatadownloadResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public SubmitInnerFundmngdatadownloadResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
