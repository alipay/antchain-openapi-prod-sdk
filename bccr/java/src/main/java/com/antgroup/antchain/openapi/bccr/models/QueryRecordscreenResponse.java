// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryRecordscreenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 取证id
    @NameInMap("evidence_id")
    public String evidenceId;

    // 取证状态 具体见附录 RecordScreenStatus
    @NameInMap("status")
    public String status;

    // 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
    @NameInMap("operate_url")
    public String operateUrl;

    // 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
    @NameInMap("data")
    public RecordScreenData data;

    public static QueryRecordscreenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordscreenResponse self = new QueryRecordscreenResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordscreenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRecordscreenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRecordscreenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRecordscreenResponse setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public QueryRecordscreenResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRecordscreenResponse setOperateUrl(String operateUrl) {
        this.operateUrl = operateUrl;
        return this;
    }
    public String getOperateUrl() {
        return this.operateUrl;
    }

    public QueryRecordscreenResponse setData(RecordScreenData data) {
        this.data = data;
        return this;
    }
    public RecordScreenData getData() {
        return this.data;
    }

}
