// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetDciRegistrationcertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 废弃待删除
    @NameInMap("cert_status")
    public String certStatus;

    // 废弃待删除
    @NameInMap("certificate_url")
    public String certificateUrl;

    // 废弃待删除
    @NameInMap("error_reason")
    public String errorReason;

    // 废弃待删除
    @NameInMap("error_reason_cn")
    public String errorReasonCn;

    // 数登状态
    @NameInMap("digital_register_status")
    public String digitalRegisterStatus;

    // 数登证书&样本证书压缩包url
    @NameInMap("download_url")
    public String downloadUrl;

    // 剩余下载次数
    @NameInMap("download_times_left")
    public Long downloadTimesLeft;

    // 失败详情
    @NameInMap("fail_detail")
    public String failDetail;

    public static GetDciRegistrationcertResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDciRegistrationcertResponse self = new GetDciRegistrationcertResponse();
        return TeaModel.build(map, self);
    }

    public GetDciRegistrationcertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDciRegistrationcertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDciRegistrationcertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDciRegistrationcertResponse setCertStatus(String certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public String getCertStatus() {
        return this.certStatus;
    }

    public GetDciRegistrationcertResponse setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public GetDciRegistrationcertResponse setErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }
    public String getErrorReason() {
        return this.errorReason;
    }

    public GetDciRegistrationcertResponse setErrorReasonCn(String errorReasonCn) {
        this.errorReasonCn = errorReasonCn;
        return this;
    }
    public String getErrorReasonCn() {
        return this.errorReasonCn;
    }

    public GetDciRegistrationcertResponse setDigitalRegisterStatus(String digitalRegisterStatus) {
        this.digitalRegisterStatus = digitalRegisterStatus;
        return this;
    }
    public String getDigitalRegisterStatus() {
        return this.digitalRegisterStatus;
    }

    public GetDciRegistrationcertResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetDciRegistrationcertResponse setDownloadTimesLeft(Long downloadTimesLeft) {
        this.downloadTimesLeft = downloadTimesLeft;
        return this;
    }
    public Long getDownloadTimesLeft() {
        return this.downloadTimesLeft;
    }

    public GetDciRegistrationcertResponse setFailDetail(String failDetail) {
        this.failDetail = failDetail;
        return this;
    }
    public String getFailDetail() {
        return this.failDetail;
    }

}
