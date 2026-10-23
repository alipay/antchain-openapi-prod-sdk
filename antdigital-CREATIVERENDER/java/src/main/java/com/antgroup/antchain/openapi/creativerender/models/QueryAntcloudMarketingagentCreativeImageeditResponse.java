// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeImageeditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次子图编辑任务的独立消息 ID。
    @NameInMap("message_id")
    public String messageId;

    // 本次编辑生成的新版本 ID，任务成功后可作为下一轮编辑的来源版本。
    @NameInMap("segment_version_id")
    public String segmentVersionId;

    // 任务状态：PROCESSING（处理中）、COMPLETED（成功）、FAILED（失败）。查询接口调用成功不代表任务生成成功。
    @NameInMap("status")
    public String status;

    // 编辑成功后的图片地址，仅在 status 为 COMPLETED 时返回。
    @NameInMap("result_url")
    public String resultUrl;

    // 编辑失败原因，在 status 为 FAILED 时返回。
    @NameInMap("fail_reason")
    public String failReason;

    public static QueryAntcloudMarketingagentCreativeImageeditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeImageeditResponse self = new QueryAntcloudMarketingagentCreativeImageeditResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setSegmentVersionId(String segmentVersionId) {
        this.segmentVersionId = segmentVersionId;
        return this;
    }
    public String getSegmentVersionId() {
        return this.segmentVersionId;
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public String getResultUrl() {
        return this.resultUrl;
    }

    public QueryAntcloudMarketingagentCreativeImageeditResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
